package rahulshettyacademypages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AutomationPracticePage extends CommonAPI {

    WebDriver driver;
    boolean flag;

    @FindBy(css = "#checkBoxOption1")
    private WebElement checkBoxOption1;

    @FindBy(css = "#checkBoxOption2")
    private WebElement checkBoxOption2;

    @FindBy(css = "#checkBoxOption3")
    private WebElement checkBoxOption3;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "//button[contains(text(),'Practice')]")
    private WebElement practiceButton;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElement logInButton;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    private WebElement signUpButton;

    @FindBy(css = "#autocomplete")
    private WebElement countryTextField;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameTextField;

    @FindBy(xpath = "//input[@id='alertbtn']")
    private WebElement alertButton;

    @FindBy(css = "#confirmbtn")
    private WebElement confirmButton;

    @FindBy(css = "#hide-textbox")
    private WebElement hideTextBoxButton;

    @FindBy(css = "#show-textbox")
    private WebElement showTextBoxButton;

    @FindBy(css = "#displayed-text")
    private WebElement displayedTextField;

    @FindBy(css = "#openwindow")
    private WebElement openWindowButton;

    @FindBy(css = "#opentab")
    private WebElement openTabButton;

    @FindBy(xpath = "//button[@id='mousehover']")
    private WebElement mouseHover;

    @FindBy(xpath = "//a[contains(text(),'Top')]")
    private WebElement topOption;

    @FindBy(xpath = "//a[contains(text(),'Reload')]")
    private WebElement reloadOption;

    @FindBy(css = "#dropdown-class-example")
    private List<WebElement> dropDownOptions;

    @FindBy(css = "#dropdown-class-example")
    private WebElement dropDown;

    @FindBy(css = "div.block.large-row-spacer:nth-child(3) div.left-align fieldset:nth-child(1) label:nth-child(2) > input.radioButton\n")
    private WebElement radioButton1;

    @FindBy(css = "div.block.large-row-spacer:nth-child(3) div.left-align fieldset:nth-child(1) label:nth-child(3) > input.radioButton")
    private WebElement radioButton2;

    @FindBy(css = "div.block.large-row-spacer:nth-child(3) div.left-align fieldset:nth-child(1) label:nth-child(4) > input.radioButton")
    private WebElement radioButton3;

    public AutomationPracticePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectDropDown(String text) {
        selectFromDropdown(dropDown, text);
    }

    public List<String> getDropDownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(dropDown);
        for (WebElement element : elements) {
            options.add(element.getText());
        }
        return options;
    }

    public void selectOptionFromDropDownWithDropDownOption(String option) {
        List<WebElement> ele = dropDownOptions;
        for (WebElement element : ele) {
            if (element.getText().equalsIgnoreCase(option)) {
                element.click();
            }
        }
    }

    public void clickOption1Box() {
        click(checkBoxOption1);
    }

    public void clickOption2Box() {
        click(checkBoxOption2);
    }

    public void clickOption3Box() {
        click(checkBoxOption3);
    }
    public void selectRadioButton1() {
        click(radioButton1);
    }

    public void selectRadioButton2() {
        click(radioButton2);
    }

    public void selectRadioButton3() {
        click(radioButton3);
    }

    public void homeButton() {
        click(homeButton);
    }

    public void practiceButton() {
        click(practiceButton);
    }

    public void logInButton() {
        click(logInButton);
    }

    public void signUpButton() {
        click(signUpButton);
    }

    public void enterCountryName(String text) {
        type(countryTextField, text);
    }

    public void enterName(String text) {
        type(nameTextField, text);
    }

//    public void alertButton() {
//        click(alertButton);
//    }

//    public void confirmButton() {
//        click(confirmButton);
//    }

    public void hideTextBoxButton() {
        click(hideTextBoxButton);
    }

    public void showTextBoxButton() {
        click(showTextBoxButton);
    }


    public void openWindowButton() {
        click(openWindowButton);
    }

    public void openTabButton() {
        click(openTabButton);
    }

    public boolean checkCountryTextField() {
        return checkDisplayed(countryTextField);
    }

    public boolean checkRadioButton1() {
        return checkEnabled(radioButton1);
    }

    public boolean checkRadioButton2() {
        return checkEnabled(radioButton2);
    }

    public boolean checkRadioButton3() {
        return checkEnabled(radioButton3);
    }

    public boolean checkOption1Box() {
        return checkEnabled(checkBoxOption1);
    }

    public boolean checkOption2Box() {
        return checkEnabled(checkBoxOption2);
    }

    public boolean checkOption3Box() {
        return checkEnabled(checkBoxOption3);
    }

    public void iFrameHandle(){
        iFrameHandle(openWindowButton);
    }
//    public void acceptAlert() {
//        okAlert();
//    }
//    public void getAlertText(){
//         alertText();
//    }
        public boolean checkAcceptButton(){
            return checkEnabled(alertButton);
        }
        public boolean checkHideTextField(){
        return checkNotDisplayed(displayedTextField);
        }

        public boolean checkShowTextField(){
        return checkDisplayed(displayedTextField);
        }

//
//        public void hoverTopAndCLick(){
//         hoverOverAndClick(mouseHover, topOption);
//        }
//
//    public void hoverReloadAndClick(){
//        hoverOverAndClick(mouseHover, topOption);
//
//    }

    public boolean checkIfTopIsSelected(){
        return checkEnabled(topOption);
    }


    public boolean checkIfPageReloads(){
        return checkEnabled(reloadOption);
    }

    public void suggestDropDown(){
        click(countryTextField);
        countryTextField.sendKeys("Can", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    }
