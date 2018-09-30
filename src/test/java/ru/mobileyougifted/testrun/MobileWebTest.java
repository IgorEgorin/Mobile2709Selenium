package ru.mobileyougifted.testrun;

import org.junit.Test;
import ru.mobileyougifted.helperpackage.BaseTest;
import ru.mobileyougifted.pagepackage.Header;
import ru.mobileyougifted.pagepackage.MainPage;


public class MobileWebTest extends BaseTest {




    @Test
    public void uiCatalog() throws Exception {


        MainPage mainPage = new MainPage(driver);
        Header header = new Header(driver);


        mainPage.clickTitleDataPicker();

        header.waitButtonBackInHeaderToload()
              .clickButtonBack();

        Thread.sleep(5000);
    }




}
