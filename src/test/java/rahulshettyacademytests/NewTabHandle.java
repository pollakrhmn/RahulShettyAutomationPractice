package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewTabHandle extends CommonAPI {

    @Test
    public void newTabHandleTabTest() {
        WebElement windowTab = getDriver().findElement(By.cssSelector("#opentab"));
        click(windowTab);
        List<String> newTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTabs.get(1));
        getDriver().switchTo().window(newTabs.get(0));
        String expectedPageTitle1 = "Practice Page";
        Assert.assertEquals(expectedPageTitle1, getDriver().getTitle());
        getDriver().switchTo().window(newTabs.get(1));
        getDriver().findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
        String expectedPageTitle2 = "Rahul Shetty Academy";
        Assert.assertEquals(expectedPageTitle2, getDriver().getTitle());
    }
}
