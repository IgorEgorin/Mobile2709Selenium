package ru.mobileyougifted.helperpackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.remote.DesiredCapabilities;
import ru.mobileyougifted.pagepackage.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {


    public static AppiumDriver<MobileElement> driver;
    public static MainPage mainPage;
    public static Header header;
    public static ActionSheets actionSheets;
    public static ActivityIndicators activityIndicators;
    public static AlertViews alertViews;
    public static Buttons buttons;
    public static DatePicker datePicker;
    public static ImageView imageView;
    public static PageControl pageControl;
    public static PickerView pickerView;
    public static BasePageObject basePageObject;


    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("\nMethod set up");
        URL serverUrl = new URL ("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.3");

        capabilities.setCapability("deviceName", "iPhone 7");
        capabilities.setCapability("app", "Users/Tester/Library/Developer/Xcode/DerivedData/UICatalog-atucuvunkgyqpgdksxapsbzebani/Build/Products/Debug-iphonesimulator/UICatalog.app");

        driver = new IOSDriver<MobileElement>(serverUrl,capabilities);

        mainPage = new MainPage(driver);
        header = new Header(driver);
        actionSheets = new ActionSheets(driver);
        activityIndicators = new ActivityIndicators(driver);
        alertViews = new AlertViews(driver);
        buttons = new Buttons(driver);
        datePicker = new DatePicker(driver);
        imageView = new ImageView(driver);
        pageControl = new PageControl(driver);
        pickerView = new PickerView(driver);
        basePageObject = new BasePageObject(driver);

    }

    @After
    public void quit() {
        System.out.println("\nGo to main page");
        header.clickButtonBack();

        System.out.println("\nMethod tear down");
        driver.quit();
    }







}
