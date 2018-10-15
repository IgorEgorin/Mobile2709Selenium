package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

import static ru.mobileyougifted.helperpackage.BaseTest.basePageObject;

public class AlertViews extends BasePageObject{
    public AlertViews(AppiumDriver driver) {
        super(driver);
    }


    private By buttonOther = By.id("Other");
    private By textPopUpShortTitleIsBest = By.xpath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]");


    public AlertViews clickInButtonOtherAlertViews() {
        click(buttonOther);
        return new AlertViews(driver);
    }


    public String getTextContainsInsidePopUpAlertViews() {
        return basePageObject.find(textPopUpShortTitleIsBest).getText();

    }



}
