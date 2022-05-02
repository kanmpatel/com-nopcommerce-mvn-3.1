package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnePageCheckOutPahe extends Utility {
    By firstNamefield = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailAddressField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By stateField = By.id("BillingNewAddress_StateProvinceId");
    By cityField = By.id("BillingNewAddress_City");
    By addressField = By.id("BillingNewAddress_Address1");
    By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By billingConituneButton = By.xpath("//button[@onclick='Billing.save()']");

    By shippingMethod = By.id("shippingoption_2");
    By shippingMethod1 = By.id("shippingoption_1");
    By shippingMethodContiuneButton = By.xpath("//button[@onclick='ShippingMethod.save()']");

    By paymentMethod = By.id("paymentmethod_1");
    By payemtnMethodContiuneButton = By.xpath("//button[@onclick='PaymentMethod.save()']");

    By cardType = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By expireMonthField = By.id("ExpireMonth");
    By expireYearField =  By.id("ExpireYear");
    By cardCodeField =   By.id("CardCode");
    By paymentInfoConituneButton = By.xpath("//button[@onclick='PaymentInfo.save()']");

    By paymentMethodText = By.xpath("//li[@class='payment-method']/child::span[@class='value']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']/child::span[@class='value']");
    By totalAmountText = By.xpath("//span[@class='value-summary']/child::strong");
    By confirmButton = By.xpath("//button[@onclick='ConfirmOrder.save()']");
    //action use for enterBillingFirstName
    public void enterBillingFirstName(String text){
        sendTextToElement(firstNamefield,text);
    }

    //action use for enterBillingLastName
    public void enterBillingLastName(String text){
        sendTextToElement(lastNameField,text);
    }

    //action use for enterBillingLastName
    public void enterBillingEmailAddress(String text){
        sendTextToElement(emailAddressField,text);
    }

    //action use for selectCountryFromDropDown
    public void selectCountryFromDropDown(String text){
        selectByValueFromDropDown(countryField,text);
    }

    //action use for selectStateFromDropDown
    public void selectStateFromDropDown(String text){
        selectByValueFromDropDown(stateField,text);
    }

    //action use for enterBillingCity
    public void enterBillingCity(String text){
        sendTextToElement(cityField,text);
    }
    //action use for enterBillingAddress
    public void enterBillingAddress(String text){
        sendTextToElement(addressField,text);
    }
    //action use for enterBillingZipcode
    public void enterBillingZipcode(String text){
        sendTextToElement(zipCodeField,text);
    }
    //action use for enterBillingPhoneNumber
    public void enterBillingPhoneNumber(String text){
        sendTextToElement(phoneNumberField,text);
    }

    //action use for clickOnBillingContinueButton
    public void clickOnBillingContinueButton(){
        WebElement continueBtn1 = waitUntilVisibilityOfElementLocated(billingConituneButton,3000);
        continueBtn1.click();
    }

    //action use for clickOnBillingContinueButton
    public void clickOnshippingMethodRadioButton(){
        WebElement radioBtn1 = waitUntilVisibilityOfElementLocated(shippingMethod,3000);
        radioBtn1.click();
    }

    //action use for clickOnBillingContinueButton
    public void clickOnshippingMethodRadioButton1(){
        WebElement radioBtn2 = waitUntilVisibilityOfElementLocated(shippingMethod1,3000);
        radioBtn2.click();
    }

    //action use for clickOnBillingContinueButton
    public void clickOnSippingMethodContinueButton(){
        WebElement ShippingcontinueBtn = waitUntilVisibilityOfElementLocated(shippingMethodContiuneButton,3000);
        ShippingcontinueBtn.click();
    }

    //action use for clickOnPaymentMethodRadioButton
    public void clickOnPaymentMethodRadioButton(){
        WebElement radioBtn1 = waitUntilVisibilityOfElementLocated(paymentMethod,3000);
        radioBtn1.click();
    }

    //action use for clickOnPaymentMethodContinueButton
    public void clickOnPaymentMethodContinueButton(){
        WebElement payementContinueBtn1 = waitUntilVisibilityOfElementLocated(payemtnMethodContiuneButton,3000);
        payementContinueBtn1.click();
    }
    //action use for selectCardTypeFromDropDown
    public void selectCardTypeFromDropDown(String text){
        selectByValueFromDropDown(cardType,text);
    }

    //action use for enterCardHolderName
    public void enterCardHolderName(String text){
        sendTextToElement(cardHolderNameField,text);
    }

    //action use for enterCardNumber
    public void enterCardNumber(String text){
        sendTextToElement(cardNumberField,text);
    }

    //action use for selectExpiryMonthFromDropDown
    public void selectExpiryMonthFromDropDown(String text){
        selectByValueFromDropDown(expireMonthField,text);
    }

    //action use for selectExpiryYearFromDropDown
    public void selectExpiryYearFromDropDown(String text){
        selectByValueFromDropDown(expireYearField,text);
    }
    //action use for enterCardCode
    public void enterCardCode(String text){
        sendTextToElement(cardCodeField,text);
    }

    //action use for clickOnPaymentInfoContinueButton
    public void clickOnPaymentInfoContinueButton(){
        WebElement paymentContinueBtn3 = waitUntilVisibilityOfElementLocated(paymentInfoConituneButton,3000);
        paymentContinueBtn3.click();
    }
    //action use for getVerifyPaymentMethodText
    public String getVerifyPaymentMethodText(){
        return getTextFromElement(paymentMethodText);
    }

    //action use for getVerifyPaymentMethodText
    public String getVerifySippingMethodText(){
        return getTextFromElement(shippingMethodText);
    }

    //action use for getVerifyPaymentMethodText
    public String getVerifyTotalAmountText(){
        return getTextFromElement(totalAmountText);
    }

    //action use for clickOnPaymentInfoContinueButton
    public void clickOnConfirmButton(){
        WebElement confirmBtn = waitUntilVisibilityOfElementLocated(confirmButton,3000);
        confirmBtn.click();
    }


}
