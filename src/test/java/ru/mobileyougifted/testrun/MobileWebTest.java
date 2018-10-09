//package ru.mobileyougifted.testrun;
//
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//
//
//import ru.mobileyougifted.helperpackage.BaseTest;
//
//
//
//
//
//public class MobileWebTest extends BaseTest {
//
//
//
//
//    @Ignore
//    @Test
//    public void uiCatalog() throws Exception {
//
//
////        mainPage.clickTitleTextFields();
//
//        WebElement element = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Switches\"]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//
////        mainPage.clickTitleDataPicker();
////
////        header.waitButtonBackInHeaderToload()
////              .clickButtonBack();
//        Thread.sleep(10000);
//    }
//
//
//    @Ignore
//    @Test
//    public void proverkaTwo() throws Exception {
//
//
//        driver.findElement(By.id("Picker View")).click();
//
//        WebElement slider = driver.findElement(By.
//                        xpath("//XCUIElementTypePickerWheel[@name=\"Blue color component value\"]"));
//        slider.sendKeys("0.2");
//
//        Thread.sleep(3000);
//    }
//
//
////    @Ignore
////    @Test
////    public void proverkaThree() throws Exception {
////
////
////
////        Dimension size = driver.manage().window().getSize();
////
////        int width = (int) (size.width / 2);
////        int startPoint = (int) (size.getHeight() * startPercentage);
////        int endPoint = (int) (size.getHeight() * finalPercentage);
////
////        new TouchAction(driver).press(width, startPoint).waitAction(Duration.ofMillis(5000))
////                .moveTo(width,endPoint).release().perform();
////
////
////
////        Thread.sleep(5000);
////    }
//
//    @Test
//    public void proverkaFour() throws Exception {
//
//
//        driver.findElement(By.id("Picker View")).click();
//        driver.findElement(By.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]"))
//                .sendKeys("85");
//
//        Thread.sleep(5000);
//
//    }
//
//
//
//
//}
