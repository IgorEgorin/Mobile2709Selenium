package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.PreconditionAndOverrideMainMethods;

public class MainPage {


    protected AppiumDriver driver;

    public MainPage(AppiumDriver driver) {
        this.driver = driver;
    }


    //   private By titleDatePickerMainPage = By.xpath("//XCUIElementTypeStaticText[@name=\"Date Picker\"]");


   public MainPage clickOnTitleDataPicker() {
       driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Date Picker\"]")).click();
       return new MainPage(driver);
   }
}
