package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowHandle extends CommonAPI {

    @Test
    public void windowHandleTabTest(){
        WebElement windowTab = getDriver().findElement(By.cssSelector("#openwindow"));
        click(windowTab);
        List<String> newTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTabs.get(1));
        getDriver().switchTo().window(newTabs.get(0));
        getDriver().close();
        getDriver().switchTo().window(newTabs.get(1));
        getDriver().manage().window().maximize();
        String expectedPageTitle = "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
    }


}
