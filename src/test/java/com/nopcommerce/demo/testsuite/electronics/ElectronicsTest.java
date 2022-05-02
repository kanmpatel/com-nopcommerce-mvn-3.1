package com.nopcommerce.demo.testsuite.electronics;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    OnePageCheckOutPahe onePageCheckOutPahe = new OnePageCheckOutPahe();
    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();


    @Test
    public void verifyPageNavigateOnCellPhones(){
        //1.1 Mouse Hover on “Electronics”Tab
        homePage.mouseHoverOnElectronicsMenu();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnSubMenuOfElectronics("Cell phones");
        //1.3 Verify the text “Cell phones”
        String expectedCellPhonesText = "Cell phones";
        String actualCellPhonesText = cellPhonesPage.getVerfiyCellPhonesText();
        Assert.assertEquals(expectedCellPhonesText,actualCellPhonesText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        //2.3 Verify the text “Cell phones”
        verifyPageNavigateOnCellPhones();
        //2.4 Click on List View Tab
        cellPhonesPage.clickOnAnyViewTab("List");
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumiaProduct();
        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedNokiaLumiaText = "Nokia Lumia 1020";
        String actalNokiaLumiaText = nokiaLumiaPage.getNokiaLumiaText();
        Assert.assertEquals(expectedNokiaLumiaText,actalNokiaLumiaText);
        //2.7 Verify the price “$349.00”
        String expectedNokiaLumiaPriceText = "$349.00";
        String actalNokiaLumiaPriceText = nokiaLumiaPage.getNokiaLumiaPriceText();
        Assert.assertEquals(expectedNokiaLumiaPriceText,actalNokiaLumiaPriceText);
        //2.8 Change quantity to 2
        nokiaLumiaPage.enterTheQualityOfProductToBePurchase("2");
        //2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickOnAddToCartButton();
        //2.10
        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedAddToCartText = "The product has been added to your shopping cart";
        String actalAddToCartText = nokiaLumiaPage.getVerifyAddToCartText();
        Assert.assertEquals(expectedAddToCartText,actalAddToCartText);
        //close the bar clicking on the cross button.
        nokiaLumiaPage.clickOnCloseIcon();
        //2.11
        //MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverOnShoppingCartButton();
        nokiaLumiaPage.clickOnGoToCartButton();
        //2.12
        //verify text shopping cart
        String expectedShoppingCartText = "Shopping cart";
        String actalShoppingCartText = shoppingCartPage.getVerfiyShoppingText();
        Assert.assertEquals(expectedShoppingCartText,actalShoppingCartText);
        //2.13 Verify the quantity is 2
        String expectedQuantityText = "2";
        String actalQuantityText = shoppingCartPage.getVerifyQuantity();
        Assert.assertEquals(expectedQuantityText,actalQuantityText);
        //2.14 Verify the Total $698.00
        String expectedTotalText = "$698.00";
        String actalTotalText = shoppingCartPage.getVerfiyTotal();
        Assert.assertEquals(expectedTotalText,actalTotalText);
        //2.15
        //click the checkbox of terms & conditions
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        //2.16 click on checkout
        shoppingCartPage.clickOnCheckOutButton();
        //2.18 Click on “REGISTER” tab
        checkoutAsGuestPage.clickOnRegisterButton();
        //2.19 Verify the text “Register”
        String expectedRegisterText = "Register";
        String actalRegisterText = registerPage.getVerfiyRegisterText();
        Assert.assertEquals(expectedRegisterText,actalRegisterText);
        //2.20 Fill the mandatory fields
        registerPage.selectGenderFromRadioButton("Male");
        registerPage.enterFirstName1("john");
        registerPage.enterLastName("patel");
        registerPage.selectDateOfBirthDay("7");
        registerPage.selectDateOfBirthMonth("July");
        registerPage.selectDateOfBirthYear("1998");
        registerPage.enterEmailAddress("patel14455@gmail.com");
        registerPage.enterPassword("patel1234");
        registerPage.enterConfirmPassword("patel1234");
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegistrationButton();
        //2.22 Verify the message “Your registration completed”
        String expectedRegisterSuccessfulText = "Your registration completed";
        String actalRegisterSuccessfulText = registerResultPage.getVerfiyRegisterSuccessText();
        Assert.assertEquals(expectedRegisterSuccessfulText,actalRegisterSuccessfulText);
        //2.23 Click on “CONTINUE” tab
        registerResultPage.clickOnContinueButton();
        //2.24
        //verify text shopping cart
        String expectedShoppingCartText1 = "Shopping cart";
        String actalShoppingCartText1 = shoppingCartPage.getVerfiyShoppingText();
        Assert.assertEquals(expectedShoppingCartText1,actalShoppingCartText1);
        //2.25
        //click the checkbox of terms & conditions
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        //2.26
        //click on checkout
        shoppingCartPage.clickOnCheckOutButton();
        //2.27
        // Fill the all mandatory field
        onePageCheckOutPahe.enterBillingFirstName("john");
        onePageCheckOutPahe.enterBillingLastName("sena");
        onePageCheckOutPahe.selectCountryFromDropDown("212");
        onePageCheckOutPahe.selectStateFromDropDown("0");
        onePageCheckOutPahe.enterBillingCity("nehsan");
        onePageCheckOutPahe.enterBillingAddress("nehsan road");
        onePageCheckOutPahe.enterBillingZipcode("123 456");
        onePageCheckOutPahe.enterBillingPhoneNumber("1234567890");
        onePageCheckOutPahe.clickOnBillingContinueButton();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        onePageCheckOutPahe.clickOnshippingMethodRadioButton();
        //2.30 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnSippingMethodContinueButton();
        //2.31 Select Radio Button “Credit Card”
        onePageCheckOutPahe.clickOnPaymentMethodRadioButton();
        //2.31 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnPaymentMethodContinueButton();
        //2.32 Select “visa” From Select credit card dropdown
        onePageCheckOutPahe.selectCardTypeFromDropDown("visa");
        //2.33 Fill all the details
        onePageCheckOutPahe.enterCardHolderName("john sena");
        onePageCheckOutPahe.enterCardNumber("4444333322221111");
        onePageCheckOutPahe.selectExpiryMonthFromDropDown("5");
        onePageCheckOutPahe.selectExpiryYearFromDropDown("2024");
        onePageCheckOutPahe.enterCardCode("123");
        //2.34 Click on “CONTINUE”
        onePageCheckOutPahe.clickOnPaymentInfoContinueButton();
        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedPaymentMethodText = "Credit Card";
        String actalPaymentMethodText = onePageCheckOutPahe.getVerifyPaymentMethodText();
        Assert.assertEquals(expectedPaymentMethodText,actalPaymentMethodText);
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedShippingMethodText = "2nd Day Air";
        String actalShippingMethodText = onePageCheckOutPahe.getVerifySippingMethodText();
        Assert.assertEquals(expectedShippingMethodText,actalShippingMethodText);
        //2.37 Verify $698.00
        String expectedTotalAmountText = "$698.00";
        String actualTotalAmountText = onePageCheckOutPahe.getVerifyTotalAmountText();
        Assert.assertEquals(expectedTotalAmountText,actualTotalAmountText);
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
        //2.43 Click on “Logout” link
        homePage.clickOnLogOutButton();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualCurrentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.nopcommerce.com/",actualCurrentUrl);


    }

}
