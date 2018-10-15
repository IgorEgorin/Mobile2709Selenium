package ru.mobileyougifted.testrun;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.mobileyougifted.helperpackage.BaseTest;

public class PageObjectTestRun extends BaseTest {



    @Test
    public void actionSheetPopUpMenuIsShown() {
        mainPage.clickOnTitleActionSheets()
                .clickInButtonOkayCancelActionSheets();

        Assert.assertTrue(actionSheets.buttonOkPopUpMenuActionSheetsIsEnabled());

    }



    @Test
    public void activityIndicatorsGrayIsShown() {
        mainPage.clickOnTitleActivityIndicators();


        Assert.assertTrue(activityIndicators.buttonOkPopUpMenuActionSheetsIsEnabled());

    }



    @Test
    public void alertViewClickOtherAssertTextInPopUpIsShown() {


        String assertText = "A Short Title Is Best";

        mainPage.clickOnTitleAlertViews().
                clickInButtonOtherAlertViews();

        Assert.assertTrue(alertViews.getTextContainsInsidePopUpAlertViews()
                .contains(assertText));

    }

    @Test
    public void buttonsSystemContactAddButtonPlusIsShown() {


        mainPage.clickOnTitleButtons();

        Assert.assertTrue(buttons.imageSystemContactAddOnButtonsPageIsEnabled());

    }

    @Test
    public void datePickerSelect59Minutes() throws Exception {

        String varMinutes = "59";


        mainPage.clickOnTitleDatePicker()
                .setValueWheelThreeDatePicker(varMinutes);

        Assert.assertTrue(datePicker.getTextFromWheelThree()
                .equals(varMinutes + " minutes"));

    }

    @Test
    public void imageViewPictureIsShown() throws Exception {

        mainPage.clickOnTitleImageView();

        Assert.assertTrue(imageView.imagesEnableOnImageViewPage());

    }


    @Test
    public void pageControlBarUnderPictureIsShown() throws Exception {

        mainPage.clickOnTitlePageControl();

        Assert.assertTrue(pageControl.barUnderImageIsEnabledOnPageControl());

    }

    @Test
    public void pickerViewChangeSecondWheelValue() throws Exception {

        String varNumberForWheel = "85";


        mainPage.clickOnTitlePickerView()
                .setPickerWheelTwo(varNumberForWheel);


        Assert.assertTrue(pickerView.getValueFromWheelTwo()
                .equals(varNumberForWheel));



    }


}
