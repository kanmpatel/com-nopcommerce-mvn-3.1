package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeskTopPage extends Utility {
    By shortBy = By.id("products-orderby");
    By desktopProductPriceList = By.xpath("//div[@class='item-box']/child::div/descendant::span");
    By deskTopAddToCartButton = By.xpath("//div[@data-productid=\"1\"]/descendant::div[@class=\"details\"]/descendant::button[@class=\"button-2 product-box-add-to-cart-button\"]");


    //this action is use for selectShortByFilterFromDropDown
    public void selectShortByFilterFromDropDown(String text){
        selectByValueFromDropDown(shortBy,text);
    }

    public List<Double> getTheListOfProductPrice(){
        List<WebElement> originalPriceList = getTheListOfElement(desktopProductPriceList);
        //create the list object
        List<String> shortPriceList = new ArrayList();
        //remove $ sign and add the shortpricelist
        //add all web element value to list object
        for (WebElement element : originalPriceList) {
            String name = element.getText();
            shortPriceList.add(String.valueOf(name.replace("$", ""))); //500.00 , 1,200.00 , 12,59.00
        }
        //remove , sign add the double type List
        List<Double> shortPriceList1 = new ArrayList();
        for (String price : shortPriceList) {
            shortPriceList1.add(Double.valueOf(price.replace(",", ""))); // 500.00 , 1200.00 , 1259.00
        }
        return shortPriceList1;
    }


    //action use for clickOnPaymentInfoContinueButton
    public void clickOnDeskTopAddToCartButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(deskTopAddToCartButton);
    }




}
