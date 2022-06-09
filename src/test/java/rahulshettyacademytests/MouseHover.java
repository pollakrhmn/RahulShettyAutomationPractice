package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademypages.AutomationPracticePage;


public class MouseHover extends CommonAPI {

    @Test
    public void mouseHoverReloadTest() {

        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        WebElement mouseHoverOption = getDriver().findElement(By.xpath("//button[@id='mousehover']"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(mouseHoverOption).click().build().perform();
        WebElement reloadOption = getDriver().findElement(By.xpath("//a[contains(text(),'Reload')]"));
        actions.click(reloadOption).build().perform();
        Assert.assertTrue(autoPracticePage.checkIfTopIsSelected());

    }

    @Test
    public void mouseHoverTopTest() {
        WebElement mouseHoverOption = getDriver().findElement(By.xpath("//button[@id='mousehover']"));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(mouseHoverOption).click().build().perform();
        WebElement topOption = getDriver().findElement(By.xpath("//a[contains(text(),'Top')]"));
        actions.click(topOption).build().perform();
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        Assert.assertTrue(autoPracticePage.checkIfPageReloads());
    }

}
