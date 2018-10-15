package ru.mobileyougifted.testrun;

import io.appium.java_client.MobileBy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.mobileyougifted.helperpackage.BaseTest;

import static ru.mobileyougifted.helperpackage.BasePageObject.wait;

public class SampleTest extends BaseTest {



    @Test
    public void actionSheetPopUpMenuIsShown() throws Exception {
        driver.findElement(By.id("Action Sheets")).click();
        driver.findElement(By.id("Okay / Cancel")).click();

        Assert.assertTrue(driver.findElement(By.id("OK")).isEnabled());
        header.clickButtonBack();

    }

    @Test
    public void activityIndicatorsGrayIsShown() throws Exception {
        driver.findElement(By.id("Activity Indicators")).click();


        Assert.assertTrue(driver.findElement(By.
                xpath("(//XCUIElementTypeActivityIndicator[@name=\"In progress\"])[1]")).isEnabled());

    }


    @Test
    public void alertViewClickOtherAssertTextInPopUpIsShown() throws Exception {


        String assertText = "A Short Title Is Best";

        driver.findElement(By.id("Alert Views")).click();
        driver.findElement(By.id("Other")).click();


        Assert.assertTrue(driver.findElement(By.
                xpath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]")).getText()
                .contains(assertText));

    }


    @Test
    public void buttonsSystemContactAddButtonPlusIsShown() throws Exception {


        driver.findElement(By.id("Buttons")).click();

        Assert.assertTrue(driver.findElement(By.
                xpath("//XCUIElementTypeCell[2]/XCUIElementTypeButton")).isEnabled());

    }



    @Test
    public void datePickerSelectHoursEleven() throws Exception {

        String varHours = "10";

        driver.findElement(By.id("Date Picker")).click();

        driver.findElement(By.xpath("//XCUIElementTypePickerWheel[2]"))
                .sendKeys(varHours);

        Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypePickerWheel[2]")).getText()
                        .equals(varHours + " o’clock"));

    }


    @Test
    public void imageViewPictureIsShown() throws Exception {
        driver.findElement(By.id("Image View")).click();

        Assert.assertTrue(driver.findElement(By.name("Animated")).isEnabled());

    }


    @Test
    public void imageViewPanelUnderPictureIsShown() throws Exception {
        driver.findElement(By.id("Page Control")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//XCUIElementTypePageIndicator")).isEnabled());

    }


    @Test
    public void pickerViewChangeSecondWheelValue() throws Exception {

        String varNumberForWheel = "85";


        driver.findElement(By.id("Picker View")).click();

        driver.findElements(By.className("UIAPickerWheel"))
                .get(1).sendKeys(varNumberForWheel);


        Assert.assertTrue(driver.findElement(By.id("Green color component value")).getText()
                        .equals(varNumberForWheel));


    }



    @Test
    public void progressViewWaitAndCheckTintedBarIs100Percent() throws Exception {
        driver.findElement(By.id("Progress Views")).click();


        Assert.assertTrue(wait.until(ExpectedConditions.textToBePresentInElementValue(driver.
                findElements(By.name("Progress")).get(2), "100%")));

    }


















//    @Test
//    public void two() throws Exception {
//
//        driver.findElement(MobileBy.ByAccessibilityId.id("Steppers")).click();
//
//        Thread.sleep(4000);
//    }
//
//
//    @Test
//    public void assertEqualTitlePageControl() throws Exception {
//        String varTitleForEqual = "Page Control";
//
//        String titlePageControl = driver.findElement(By.id("Page Control")).getText();
//
//
//        Assert.assertTrue("Words have difference", titlePageControl.equals(varTitleForEqual));
//
//
//    }
}
