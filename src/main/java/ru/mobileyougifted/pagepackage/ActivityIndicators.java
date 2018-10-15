package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class ActivityIndicators extends BasePageObject{
    public ActivityIndicators(AppiumDriver driver) {
        super(driver);
    }



    private By buttonOkPopUpMenuActionSheetsIsEnabled = By.
            xpath("(//XCUIElementTypeActivityIndicator[@name=\"In progress\"])[1]");


    public boolean buttonOkPopUpMenuActionSheetsIsEnabled() {
        return driver.findElement(buttonOkPopUpMenuActionSheetsIsEnabled).isEnabled();
    }



}
