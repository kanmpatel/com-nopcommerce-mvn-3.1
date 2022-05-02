package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    By verifyProductText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.xpath("//dd[@id=\"product_attribute_input_3\"]//input");
    By os = By.xpath("//dd[@id=\"product_attribute_input_4\"]//input");
    By software = By.id("product_attribute_5_11");
    By amountText = By.xpath("//span[@id=\"price-value-1\"]");
    By addToCartButtonOfBuildComputer = By.id("add-to-cart-button-1");
    //find element of add to cart text
    By verifyAddToCartText = By.xpath("//p[contains(text(),'The product has been added to your ')]");
    //find the element of close button
    By closeButton = By.xpath("//span[@class=\"close\"]");
    //find the element of shopping cart
    By shoppingCart = By.xpath("//li[@id=\"topcartlink\"]");
    //find the element of go to cart button
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");


    public String getVerfiyProductText(){
        return getTextFromElement(verifyProductText);
    }

    public void selectProcessoFromDropDown(String text){
        selectByValueFromDropDown(processor,text);
    }

    public void selectramFromDropDown(String text){
        selectByValueFromDropDown(ram,text);
    }

    public void selectAnyRadioButtonFromHdd(String valueAttributeValue){
        List<WebElement> hddList = getTheListOfElement(hdd);
        for(WebElement element : hddList){
            if(element.getAttribute("value").equalsIgnoreCase(valueAttributeValue)){
                element.click();
                break;
            }
        }
    }

    public void selectAnyRadioButtonFromOs(String valueAttributeValue){
        List<WebElement> osList = getTheListOfElement(os);
        for(WebElement element1 : osList){
            if(element1.getAttribute("value").equalsIgnoreCase(valueAttributeValue)){
                element1.click();
                break;
            }
        }
    }

    public void selectSoftware(){
        clickOnElement(software);
    }

    public String getVerifyTotalAmountText(){
        return getTextFromElement(amountText);
    }

    //action use for click for clickOnAddToCartButton
    public void clickOnAddToCartButtonOfBuildComputer() {
        WebElement clickAddToCart1 = waitUntilVisibilityOfElementLocated(addToCartButtonOfBuildComputer,3000);
        clickAddToCart1.click();
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
