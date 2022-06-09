package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableScrollBar extends CommonAPI {

    @Test
    public void scrollBarWithJavaScriptExecutorTest() {

        WebElement webTablePosition = getDriver().findElement(By.xpath("//td[contains(text(),'Businessman')]"));
        scrollToView(webTablePosition);
        System.out.println("Position: Businessman is Present");
    }

    @Test
    public void scrollBarWithActionsClassTest(){

        Actions actions = new Actions(getDriver());
        WebElement webTablePosition = getDriver().findElement(By.xpath("//td[contains(text(),'Cricketer')]"));
        actions.moveToElement(webTablePosition).perform();
        System.out.println("Position: Cricketer is Present");
    }
}
