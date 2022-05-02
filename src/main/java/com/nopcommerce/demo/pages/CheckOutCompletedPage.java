package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutCompletedPage extends Utility {
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderSuccessfulText = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By completeOrderContinueButton = By.xpath("//button[@onclick='setLocation(\"/\")']");
    public String getOrderSuccessfulText() {
        return getTextFromElement(orderSuccessfulText);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    //action use for clickOnPaymentInfoContinueButton
    public void clickOnCompletedOrderContinueButton(){
        WebElement completedOrderContinueBtn = waitUntilVisibilityOfElementLocated(completeOrderContinueButton,3000);
        completedOrderContinueBtn.click();
    }


}
