package com.nopcommerce.demo.testsuite.computer;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    DeskTopPage deskTopPage = new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    OnePageCheckOutPahe onePageCheckOutPahe = new OnePageCheckOutPahe();
    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();


    @Test
    public void verifyPageNavigateOnDeskTop() throws InterruptedException {
        //1.1
        //mouse hover on computer navigation
        homePage.mouseHoverOnComputerMenu();
        //1.2
        //mouse hover on destop bar and click desktop link
        homePage.clickOnSubMenuOfComputer("Desktops");
        //get the all price beforeList
        List<Double> expectedProductPriceList = deskTopPage.getTheListOfProductPrice();
        Collections.sort(expectedProductPriceList);
        //2.3 click on name A to Z filter
        deskTopPage.selectShortByFilterFromDropDown("10");
        Thread.sleep(3000);
        List<Double> actualProductPriceList = deskTopPage.getTheListOfProductPrice();
        Assert.assertEquals(expectedProductPriceList,actualProductPriceList);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 mouse hover on computer navigation
        homePage.mouseHoverOnComputerMenu();
        //2.2 mouse hover on destop bar and click desktop link
        homePage.clickOnSubMenuOfComputer("Desktops");
        //2.3 click on name A to Z filter
        deskTopPage.selectShortByFilterFromDropDown("5");
        //2.4 click on add to cart of build your own computer product
        deskTopPage.clickOnDeskTopAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        String expectedProductText = "Build your own computer";
        String actualProductText = buildYourOwnComputerPage.getVerfiyProductText();
        Assert.assertEquals(expectedProductText,actualProductText);
        //2.6 select 2.2 GHz Intel Pentium Dual-Core E2200
        buildYourOwnComputerPage.selectProcessoFromDropDown("1");
        //2.7 select 8GB [+$60.00]"
        buildYourOwnComputerPage.selectramFromDropDown("5");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectAnyRadioButtonFromHdd("7");
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectAnyRadioButtonFromOs("9");
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectSoftware();
        //2.11 verify the price "$1475.00
        String expectedAmountText = "$1475.00";
        String actualAmountText = buildYourOwnComputerPage.getVerifyTotalAmountText();
        //Assert.assertEquals(expectedAmountText,actualAmountText);
        //2.12 click on add the card
        buildYourOwnComputerPage.clickOnAddToCartButtonOfBuildComputer();
        //2.13
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedAddToCartText = "The product has been added to your shopping cart";
        String actalAddToCartText = buildYourOwnComputerPage.getVerifyAddToCartText();
        Assert.assertEquals(expectedAddToCartText,actalAddToCartText);
        //close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickOnCloseIcon();
        //2.14
        //MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverOnShoppingCartButton();
        buildYourOwnComputerPage.clickOnGoToCartButton();
        //2.15
        //verify text shopping cart
        String expectedShoppingCartText = "Shopping cart";
        String actalShoppingCartText = shoppingCartPage.getVerfiyShoppingText();
        Assert.assertEquals(expectedShoppingCartText,actalShoppingCartText);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.enterTheQualityOfProductToBePurchase("2");
        //click on update shopping cart
        shoppingCartPage.clickOnUpdateShoppingCartButton();
        //2.17 Verify the Total $1475.00
        String expectedTotalText = "$1475.00";
        String actalTotalText = shoppingCartPage.getVerfiyTotal();
       // Assert.assertEquals(expectedTotalText,actalTotalText);
        //2.18
        //click the checkbox of terms & conditions
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        //2.19 click on checkout
        shoppingCartPage.clickOnCheckOutButton();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedWelcomeText = "Welcome, Please Sign In!";
        String actalWelcomeText = checkoutAsGuestPage.getVerfiyWebcomeText();
        Assert.assertEquals(expectedWelcomeText,actalWelcomeText);
        //2.21 Click on “CHECKOUT AS GUEST” Tab
        checkoutAsGuestPage.clickOnChecOutAsGuestButton();
        //2.22
        // Fill the all mandatory field
        onePageCheckOutPahe.enterBillingFirstName("john");
        onePageCheckOutPahe.enterBillingLastName("sena");
        onePageCheckOutPahe.enterBillingEmailAddress("sena111@gmail.com");
        onePageCheckOutPahe.selectCountryFromDropDown("212");
        onePageCheckOutPahe.selectStateFromDropDown("0");
        onePageCheckOutPahe.enterBillingCity("nehsan");
        onePageCheckOutPahe.enterBillingAddress("nehsan road");
        onePageCheckOutPahe.enterBillingZipcode("123 456");
        onePageCheckOutPahe.enterBillingPhoneNumber("1234567890");
        //2.23 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnBillingContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        onePageCheckOutPahe.clickOnshippingMethodRadioButton1();
        //2.25 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnSippingMethodContinueButton();
        //2.26 Select Radio Button “Credit Card”
        onePageCheckOutPahe.clickOnPaymentMethodRadioButton();
        //2.26 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnPaymentMethodContinueButton();
        //2.27 Select “Master card” From Select credit card dropdown
        onePageCheckOutPahe.selectCardTypeFromDropDown("MasterCard");
        //2.28 Fill all the details
        onePageCheckOutPahe.enterCardHolderName("john sena");
        onePageCheckOutPahe.enterCardNumber("5555555555554444");
        onePageCheckOutPahe.selectExpiryMonthFromDropDown("5");
        onePageCheckOutPahe.selectExpiryYearFromDropDown("2024");
        onePageCheckOutPahe.enterCardCode("123");
        //2.29 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnPaymentInfoContinueButton();
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethodText = "Credit Card";
        String actalPaymentMethodText = onePageCheckOutPahe.getVerifyPaymentMethodText();
        Assert.assertEquals(expectedPaymentMethodText,actalPaymentMethodText);
        //2.32 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethodText = "Next Day Air";
        String actalShippingMethodText = onePageCheckOutPahe.getVerifySippingMethodText();
        Assert.assertEquals(expectedShippingMethodText,actalShippingMethodText);
        //2.37 Verify $2,950.00
        String expectedTotalAmountText = "$2,950.00";
        String actualTotalAmountText = onePageCheckOutPahe.getVerifyTotalAmountText();
        //Assert.assertEquals(expectedTotalAmountText,actualTotalAmountText);
        //2.38 Click on “confirm”
        onePageCheckOutPahe.clickOnConfirmButton();
        //2.39 Verify the Text “Thank You”
        String expectedThankYouText = "Thank you";
        String actualThankYouText = checkOutCompletedPage.getThankYouText();
        Assert.assertEquals(expectedThankYouText,actualThankYouText);
        //	2.40 Verify the message “Your order has been successfully processed!”
        String expectedOrderSuccessText = "Your order has been successfully processed!";
        String actualOrderSuccessText = checkOutCompletedPage.getOrderSuccessfulText();
        Assert.assertEquals(expectedOrderSuccessText,actualOrderSuccessText);
        //	2.41 Click on “CONTINUE”
        checkOutCompletedPage.clickOnCompletedOrderContinueButton();
        //2.42 Verify the text “Welcome to our store”
        String expectedHomePageText = "Welcome to our store";
        String actualHomePageText = homePage.getHomePageText();
        Assert.assertEquals(expectedHomePageText,actualHomePageText);

    }

}
