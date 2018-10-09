package ru.mobileyougifted.testrun;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.mobileyougifted.helperpackage.BaseTest;

import static ru.mobileyougifted.helperpackage.BasePageObject.wait;

public class SampleTest extends BaseTest {

    @Test
    public void firstWheelChange65to85() throws Exception {
        driver.findElement(By.id("Picker View")).click();
        driver.findElements(By.className("UIAPickerWheel"))
                .get(0).sendKeys("85");
    }

    @Test
    public void two() throws Exception {
//        wait.until(ExpectedConditions.elementToBeClickable
//                (MobileBy.ByAccessibilityId.id("Picker View"))).click();
        driver.findElement(MobileBy.ByAccessibilityId.id("Steppers")).click();

        Thread.sleep(4000);
    }


    @Test
    public void assertEqualTitlePageControl() throws Exception {
        String varTitleForEqual = "Page Control";

        String titlePageControl = driver.findElement(By.id("Page Control")).getText();

        System.out.println("Sout title" + " " + titlePageControl);
        System.out.println("Sout titleForEqual" + " " + varTitleForEqual);


        Assert.assertTrue("Words have difference", titlePageControl.equals("Page Control"));


    }
}
