package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage extends Utility {
    //find the element of top menu list
    By topMenuNavigationList = By.xpath("//ul[@class=\"top-menu notmobile\"]/li");
    //find the list of element of electronics Menu
    By electronicsMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li[2]/child::a");
    //find the element of electronics submenu
    By electronicsSubMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li[2]/descendant::a");
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li[1]/child::a");
    By computerSubMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li[1]/descendant::a");

    By homePageText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    By logOutButton = By.linkText("Log out");

    //this method is used to get the text from navigation list
    public String getTheTopMenuNavigationText(String topMenuText){
        //store the list in list interface
        List<WebElement> listOfMenuNavigation = getTheListOfElement(topMenuNavigationList);
        String text = "";
        //iterate the for loop until find the matching get text
        for(WebElement element : listOfMenuNavigation){
            if(element.getText().equalsIgnoreCase(topMenuText)){
                text = element.getText();
                break;
            }
        }
        return text;
    }
    //this action is used to click on any menu navigation list
    public void clickOnMenuList(String topMenutext){
        //store the list in list interface
        List<WebElement> listOfMenu = getTheListOfElement(topMenuNavigationList);
        //iterate the for loop until find the matching menu is not click
        for(WebElement element : listOfMenu){
            if(element.getText().equalsIgnoreCase(topMenutext)){
                element.click();
                break;
            }
        }
    }

    //this action is used to mouseHover on Electronics
    public void mouseHoverOnElectronicsMenu(){

        mouseHoverToElement(electronicsMenu);
    }

    //this action is select to any submenu of electronics menu
    public void clickOnSubMenuOfElectronics(String subMenuText){
        mouseHoverOnElectronicsMenu();
        List<WebElement> subMenuList = getTheListOfElement(electronicsSubMenu);
        for(WebElement element : subMenuList){
            if(element.getText().equalsIgnoreCase(subMenuText)){
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().build().perform();
                break;
            }
        }
    }

    //this action is used to mouseHover on Electronics
    public void mouseHoverOnComputerMenu(){
        mouseHoverToElement(computerMenu);
    }

    //this action is select to any submenu of electronics menu
    public void clickOnSubMenuOfComputer(String subMenuText1){
        mouseHoverOnComputerMenu();
        List<WebElement> subMenuList1 = getTheListOfElement(computerSubMenu);
        for(WebElement element1: subMenuList1){
            if(element1.getText().equalsIgnoreCase(subMenuText1)){
                Actions actions = new Actions(driver);
                actions.moveToElement(element1).click().build().perform();
                break;
            }
        }
    }



    public String getHomePageText() {
        return getTextFromElement(homePageText);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }


}
