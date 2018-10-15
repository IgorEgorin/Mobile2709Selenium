package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

import static ru.mobileyougifted.helperpackage.BaseTest.basePageObject;


public class PickerView extends BasePageObject {
    public PickerView(AppiumDriver driver) {
        super(driver);
    }


    private By wheelTwo = By.className("UIAPickerWheel");
    private By valueFromWheelTwo = By.id("Green color component value");



    public PickerView setPickerWheelTwo(String s) {
        typeIntoField(wheelTwo,s);
        return new PickerView(driver);
    }



    public String getValueFromWheelTwo() {
        return basePageObject.find(valueFromWheelTwo).getText();
    }




}
