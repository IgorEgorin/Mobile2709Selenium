package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class ImageView extends BasePageObject{
    public ImageView(AppiumDriver driver) {
        super(driver);
    }


    private By imagesViewPage = By.name("Animated");


    public boolean imagesEnableOnImageViewPage() {
        return find(imagesViewPage).isEnabled();

    }
}
