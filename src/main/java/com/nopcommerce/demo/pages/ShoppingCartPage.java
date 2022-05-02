package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    //find the text of shopping cart text
    By verifyShoppingText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    //find the element of quality text
    By verifyQuantity = By.xpath("//td[@class=\"quantity\"]/descendant::input");
    //find the element of total
    By verfiyTotal = By.xpath("//td[@class=\"subtotal\"]/descendant::span");
    //find the elements of term & conditions
    By termServices = By.id("termsofservice");
    //find the element of checkOut button
    By checkOutButton = By.xpath("//div[@class=\"checkout-buttons\"]/child::button");

    By qaualityField = By.xpath("//td[@class=\"quantity\"]/child::input");

    By updateCartButton = By.id("updatecart");

    //action use for getVerfiyShoppingText
    public String getVerfiyShoppingText(){
        return getTextFromElement(verifyShoppingText);
    }
    //action use for getVerifyQuantity
    public String getVerifyQuantity(){
        WebElement quantity = findElementsOnBrowser(verifyQuantity);
        return quantity.getAttribute("value");
    }
    //action use for getVerfiyTotal
    public String getVerfiyTotal(){
        return getTextFromElement(verfiyTotal);
    }
    //action use for clickOnTermAndConditionCheckBox
    public void clickOnTermAndConditionCheckBox(){
        WebElement clickTermCondition = waitUntilElementToBeClickable(termServices,3000);
        clickTermCondition.click();
    }

    //action use for clickOnTermAndConditionCheckBox
    public void clickOnCheckOutButton(){
        WebElement checkOut = waitUntilVisibilityOfElementLocated(checkOutButton,3000);
        checkOut.click();
    }

    //this method is use the enter the quality of product to be purchase
    public void enterTheQualityOfProductToBePurchase(String text) throws InterruptedException {
        Thread.sleep(3000);
        WebElement quality = findElementsOnBrowser(qaualityField);
        quality.clear();
        sendTextToElement(qaualityField,text);
    }

    //action use for clickOnTermAndConditionCheckBox
    public void clickOnUpdateShoppingCartButton(){
        WebElement updateBtn = waitUntilVisibilityOfElementLocated(updateCartButton,3000);
        updateBtn.click();
    }
}
