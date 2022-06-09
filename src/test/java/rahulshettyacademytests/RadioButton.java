package rahulshettyacademytests;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulshettyacademypages.AutomationPracticePage;


public class RadioButton extends CommonAPI {

    @Test
    public void radioButtonTest(){
        AutomationPracticePage autoPracticePage = new AutomationPracticePage(getDriver());
        autoPracticePage.selectRadioButton1();
        Assert.assertTrue(autoPracticePage.checkRadioButton1());
        autoPracticePage.selectRadioButton2();
        Assert.assertTrue(autoPracticePage.checkRadioButton2());
        autoPracticePage.selectRadioButton3();
        Assert.assertTrue(autoPracticePage.checkRadioButton3());
    }


    }


