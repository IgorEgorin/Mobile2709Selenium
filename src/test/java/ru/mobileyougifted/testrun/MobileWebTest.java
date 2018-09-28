package ru.mobileyougifted.testrun;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.PreconditionAndOverrideMainMethods;
import ru.mobileyougifted.pagepackage.MainPage;


public class MobileWebTest extends PreconditionAndOverrideMainMethods {




    @Test
    public void uiCatalog() throws Exception {

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnTitleDataPicker();
//        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Date Picker\"]")).click();


        Thread.sleep(5000);
    }




}
