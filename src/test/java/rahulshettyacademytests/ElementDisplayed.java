package rahulshettyacademytests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademypages.AutomationPracticePage;

public class ElementDisplayed extends CommonAPI {

    @Test
    public void hideButtonTest() {
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        autoPracticePage.hideTextBoxButton();
        Assert.assertTrue(autoPracticePage.checkHideTextField());
    }

    @Test
    public void showButtonTest() {
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        autoPracticePage.showTextBoxButton();
        Assert.assertTrue(autoPracticePage.checkShowTextField());
    }

}
