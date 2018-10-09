package ru.mobileyougifted.helperpackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.remote.DesiredCapabilities;
import ru.mobileyougifted.pagepackage.Header;
import ru.mobileyougifted.pagepackage.MainPage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {




    public static AppiumDriver<MobileElement> driver;
    public static MainPage mainPage;
    public static Header header;


    @Before
    public void setUp() throws MalformedURLException {
        System.out.println("\nMethod set up");
        URL serverUrl = new URL ("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.3");

        capabilities.setCapability("deviceName", "iPhone 7");
        capabilities.setCapability("app", "/Users/Tester/Desktop/UICatalog.app");

        driver = new IOSDriver<MobileElement>(serverUrl,capabilities);

        mainPage = new MainPage(driver);
        header = new Header(driver);


    }

    @After
    public void quit() {
        System.out.println("\nMethod tear down");
        driver.quit();
    }




}
