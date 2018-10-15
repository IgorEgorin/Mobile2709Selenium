package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

import static ru.mobileyougifted.helperpackage.BaseTest.basePageObject;

public class Buttons extends BasePageObject{
    public Buttons(AppiumDriver driver) {
        super(driver);
    }

    private By imageSystemContactAddButtonsPage = By.
            xpath("//XCUIElementTypeCell[2]/XCUIElementTypeButton");


    public boolean imageSystemContactAddOnButtonsPageIsEnabled() {
        return basePageObject.find(imageSystemContactAddButtonsPage).isEnabled();
    }


}
