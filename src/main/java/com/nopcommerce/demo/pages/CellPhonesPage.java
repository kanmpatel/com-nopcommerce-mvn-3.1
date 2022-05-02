package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CellPhonesPage extends Utility {
    //find the element of cellphones text
    By verifyCellPhonesText = By.xpath("//h1[contains(text(),'Cell phones')]");
    //find the ListView List
    By productView = By.xpath("//div[@class=\"product-viewmode\"]//a");
    //find the product name List
    By nokiaLumiaLink = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");


    public String getVerfiyCellPhonesText(){
        return getTextFromElement(verifyCellPhonesText);
    }
    //this method is used to any product view list
    public void clickOnAnyViewTab(String productViewList){
        //get all product view list in list interface
        List<WebElement> productViewTab = getTheListOfElement(productView);
        //click on product view list of selected text
        for(WebElement element : productViewTab){
            if(element.getText().equalsIgnoreCase(productViewList)){
                element.click();
                break;
            }
        }
    }

    //this method click on product name
    public void clickOnNokiaLumiaProduct() throws InterruptedException {
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(3000);
          clickOnElement(nokiaLumiaLink);
//        WebElement nokiaLink =  waitUntilVisibilityOfElementLocated(nokiaLumiaLink,3000);
//        nokiaLink.click();
    }




}
