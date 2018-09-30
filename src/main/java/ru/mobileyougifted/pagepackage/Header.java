package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class Header extends BasePageObject<Header> {
    public Header(AppiumDriver driver) {
        super(driver);
    }

    private By buttonBack = By.xpath("//XCUIElementTypeButton[@name=\"UICatalog\"]");


    public Header clickButtonBack() {
        click(buttonBack);
        return new Header(driver);
    }

    public Header waitButtonBackInHeaderToload() {
        waitingVisibilityOfElement(buttonBack,7);
        return new Header(driver);
    }

}
