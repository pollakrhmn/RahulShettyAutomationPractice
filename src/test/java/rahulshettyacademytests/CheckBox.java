package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademypages.AutomationPracticePage;

import java.util.List;

public class CheckBox extends CommonAPI {

    @Test
    public void checkBoxTest() {
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        autoPracticePage.clickOption1Box();
        autoPracticePage.clickOption2Box();
        autoPracticePage.clickOption3Box();
        Assert.assertTrue(autoPracticePage.checkOption1Box());
        Assert.assertTrue(autoPracticePage.checkOption2Box());
        Assert.assertTrue(autoPracticePage.checkOption3Box());
    }

    @Test
    public void checkBoxTestWithLoop() throws InterruptedException {

        List<WebElement> checkBoxButtons = getDriver().findElements(By.xpath("//*[contains(@id,'checkBoxOption')]"));

        for (int i = 0; i < checkBoxButtons.size(); i++) {
            if (checkBoxButtons.get(i).getAttribute("value").equalsIgnoreCase("option2")) {
                checkBoxButtons.get(i).click();
            }
            System.out.println("Successful Clicks");
        }
    }
}