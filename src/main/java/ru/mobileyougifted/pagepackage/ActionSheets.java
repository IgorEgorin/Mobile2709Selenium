package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class ActionSheets extends BasePageObject{
    public ActionSheets(AppiumDriver driver) {
        super(driver);
    }

    private By buttonOkayCancel = By.id("Okay / Cancel");
    private By buttonOkPopUpMenu = By.id("OK");


    public ActionSheets clickInButtonOkayCancelActionSheets() {
        click(buttonOkayCancel);
        return new ActionSheets(driver);
    }

    public boolean buttonOkPopUpMenuActionSheetsIsEnabled() {
        return driver.findElement(buttonOkPopUpMenu).isEnabled();
    }
}
