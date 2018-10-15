package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class PageControl extends BasePageObject{
    public PageControl(AppiumDriver driver) {
        super(driver);
    }



    private By barUnderImage = By.xpath("//XCUIElementTypePageIndicator");



    public boolean barUnderImageIsEnabledOnPageControl() {
        return find(barUnderImage).isEnabled();
    }
}
