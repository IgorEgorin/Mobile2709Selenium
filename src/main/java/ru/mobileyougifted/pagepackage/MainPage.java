package ru.mobileyougifted.pagepackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BasePageObject;

public class MainPage extends BasePageObject {


    public MainPage(AppiumDriver driver) {
        super(driver);
    }


    private By titleActionSheets = By.id("Action Sheets");
    private By titleActivityIndicators = By.id("Activity Indicators");
    private By titleAlertViews = By.id("Alert Views");
    private By titleButtons = By.id("Buttons");
    private By titleDatePicker = By.id("Date Picker");
    private By titleImageView = By.id("Image View");
    private By titlePageControl = By.id("Page Control");
    private By titlePickerView = By.id("Picker View");




    public ActionSheets clickOnTitleActionSheets () {
        click(titleActionSheets);
        return new ActionSheets(driver);
    }


    public ActivityIndicators clickOnTitleActivityIndicators () {
        click(titleActivityIndicators);
        return new ActivityIndicators(driver);
    }


    public AlertViews clickOnTitleAlertViews () {
        click(titleAlertViews);
        return new AlertViews(driver);
    }


    public Buttons clickOnTitleButtons () {
        click(titleButtons);
        return new Buttons(driver);
    }



    public DatePicker clickOnTitleDatePicker() {
        click(titleDatePicker);
        return new DatePicker(driver);
    }



    public ImageView clickOnTitleImageView() {
        click(titleImageView);
        return new ImageView(driver);
    }


    public PageControl clickOnTitlePageControl() {
        click(titlePageControl);
        return new PageControl(driver);
    }


    public PickerView clickOnTitlePickerView() {
        click(titlePickerView);
        return new PickerView(driver);
    }



}
