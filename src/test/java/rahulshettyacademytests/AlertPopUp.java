package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPopUp extends CommonAPI {

    @Test
    public void handleAlertTest(){

        getDriver().findElement(By.cssSelector("#alertbtn")).click();
        String alertMessage1 = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();
        String expectedAlertText = "Hello , share this practice page and share your knowledge";
        Assert.assertEquals(expectedAlertText, alertMessage1);
    }

    @Test
    public void handleConfirmAlertTest(){
        getDriver().findElement(By.cssSelector("#confirmbtn")).click();
        String alertMessage2 = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().dismiss();
        String expectedConfirmText = "Hello , Are you sure you want to confirm?";
        Assert.assertEquals(expectedConfirmText, alertMessage2);
    }
}
