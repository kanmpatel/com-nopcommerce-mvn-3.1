package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutAsGuestPage extends Utility {

    //find the element of registration button
    By registrationButton = By.xpath("//button[contains(text(),'Register')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    //action use for clickOnTermAndConditionCheckBox
    public void clickOnRegisterButton(){
        WebElement registerButton = waitUntilVisibilityOfElementLocated(registrationButton,3000);
        registerButton.click();
    }

    public String getVerfiyWebcomeText(){
        return getTextFromElement(welcomeText);
    }

    //action use for clickOnTermAndConditionCheckBox
    public void clickOnChecOutAsGuestButton(){
        WebElement registerButton = waitUntilVisibilityOfElementLocated(checkOutAsGuestButton,3000);
        registerButton.click();
    }

}
