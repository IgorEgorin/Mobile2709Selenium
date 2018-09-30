package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class MainPage extends BasePageObject<MainPage> {


    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    private By titleDataPicker = By.xpath("///XCUIElementTypeStaticText[@name=\"Date Picker\"]");
    private By wheelTwoDataPicker = By.xpath("///XCUIElementTypePickerWheel[1]");

    public MainPage clickTitleDataPicker() {
        click(titleDataPicker);
        return new MainPage(driver);
    }


    public MainPage selectDayWheelTwoDataPicker (String day) {
        typeIntoField(day,wheelTwoDataPicker);
        return new MainPage(driver);
    }

}
