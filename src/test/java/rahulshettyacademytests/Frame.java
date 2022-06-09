package rahulshettyacademytests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Frame extends CommonAPI {

    @Test
    public void iFrameTest(){
        getDriver().switchTo().frame("iframe-name");
        System.out.println("Switched to Frame");
        getDriver().findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
}


}
