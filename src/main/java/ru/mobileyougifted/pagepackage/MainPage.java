package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class MainPage extends BasePageObject<MainPage> {


    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    private By titleDataPicker = By.xpath("///XCUIElementTypeStaticText[@name=\"Date Picker\"]");

    public MainPage clickTitleDataPicker() {
        click(titleDataPicker);
        return new MainPage(driver);
    }

}
