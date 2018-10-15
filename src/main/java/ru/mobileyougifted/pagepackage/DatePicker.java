package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

import static ru.mobileyougifted.helperpackage.BaseTest.basePageObject;

public class DatePicker extends BasePageObject{
    public DatePicker(AppiumDriver driver) {
        super(driver);
    }

    private By wheelThree = By.xpath("//XCUIElementTypePickerWheel[3]");



    public DatePicker setValueWheelThreeDatePicker(String s) {
        basePageObject.typeIntoField(wheelThree,s);
        return new DatePicker(driver);

    }

    public String getTextFromWheelThree() {
        return basePageObject.find(wheelThree).getText();

    }


}
