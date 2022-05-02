package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NokiaLumiaPage extends Utility {

    //find the verify Text
    By verifyNokiaLumiaText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    //find the price element
    By nokiaLumiaPrice = By.xpath("//div[@class='product-price']/child::span[@id='price-value-20']");
    //find the element of Quality field
    By qaualityField = By.id("product_enteredQuantity_20");
    //find the element of add to cart button
    By addToCartButton = By.id("add-to-cart-button-20");
    //find element of add to cart text
    By verifyAddToCartText = By.xpath("//p[contains(text(),'The product has been added to your ')]");
    //find the element of close button
    By closeButton = By.xpath("//span[@class=\"close\"]");
    //find the element of shopping cart
    By shoppingCart = By.xpath("//li[@id=\"topcartlink\"]");
    //find the element of go to cart button
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    //this method use to find nokia lumia text
    public String getNokiaLumiaText(){
        return getTextFromElement(verifyNokiaLumiaText);
    }

    //this method use to find nokia lumia price text
    public String getNokiaLumiaPriceText(){
        return getTextFromElement(nokiaLumiaPrice);
    }

    //this method is use the enter the quality of product to be purchase
    public void enterTheQualityOfProductToBePurchase(String text) throws InterruptedException {
        Thread.sleep(3000);
        WebElement quality = findElementsOnBrowser(qaualityField);
        quality.clear();
        sendTextToElement(qaualityField,text);
    }
    //action use for click for clickOnAddToCartButton
    public void clickOnAddToCartButton() {
        WebElement clickAddToCart = waitUntilVisibilityOfElementLocated(addToCartButton,3000);
        clickAddToCart.click();
    }
    //action use for getVerifyAddToCartText
    public String getVerifyAddToCartText() {
        return getTextFromElement(verifyAddToCartText);
    }
    //action use for clickOnCloseIcon
    public void clickOnCloseIcon(){
        clickOnElement(closeButton);
    }
    //action use for mouseHoverOnShoppingCartButton
    public void mouseHoverOnShoppingCartButton(){
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCartButton(){
        WebElement addtocart = waitUntilVisibilityOfElementLocated(goToCartButton,3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(addtocart).click().build().perform();
    }
}
