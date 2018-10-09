package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class MainPage extends BasePageObject<MainPage> {


    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    private MobileElement titleDataPicker = (MobileElement)
            driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Sliders\"]");
//    private MobileElement titleTextFields = (MobileElement)
//            driver.findElementByXPath("//XCUIElementTypeCell[14]");
    private By textFieldTintedInsideTextFields = By.xpath("//XCUIElementTypeCell[2]");
    private By wheelTwoDataPicker = By.xpath("///XCUIElementTypePickerWheel[1]");

    public MainPage clickTitleDataPicker() {
        WebElement webElement = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Switches\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).perform();
        webElement.click();
//        titleDataPicker.click();
        return new MainPage(driver);
    }



    public MainPage clickTitleTextFields() {



//        click(titleTextFields);

        return new MainPage(driver);
    }


    public MainPage selectDayWheelTwoDataPicker (String day) {
        typeIntoField(day,wheelTwoDataPicker);
        return new MainPage(driver);
    }


    public MainPage typeTextIntoTinted (String textTinted) {
        typeIntoField(textTinted,textFieldTintedInsideTextFields);
        return new MainPage(driver);
    }

}
