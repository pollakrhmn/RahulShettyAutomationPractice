package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SuggestionClass extends CommonAPI {

    @Test
    public void suggestionClassTest(){
        WebElement suggestionTextBox = getDriver().findElement(By.cssSelector("#autocomplete"));
        Actions action = new Actions(getDriver());
        action.click(suggestionTextBox).sendKeys("can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        System.out.println("Canada is present in the text field.");
    }
}
