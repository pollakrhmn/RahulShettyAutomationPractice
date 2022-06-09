package rahulshettyacademytests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademypages.AutomationPracticePage;

public class DropDown extends CommonAPI {

    @Test
    public void dropDownTest(){
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        autoPracticePage.selectOptionFromDropDownWithDropDownOption("Option2");
        String expectedDragDown = "Option2";
        Assert.assertEquals(expectedDragDown, getElementText("//option[contains(text(),'Option2')]"));
    }
}
