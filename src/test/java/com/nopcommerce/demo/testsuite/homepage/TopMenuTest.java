package com.nopcommerce.demo.testsuite.homepage;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu){
        //click on the ‘navigation’ link
        homePage.clickOnMenuList(menu);
    }

    @Test
    public void verifyPageNavigation(){
        //1.3. create the @Test method name verifyPageNavigation.
        String navigationName = homePage.getTheTopMenuNavigationText("Electronics");
        // use selectMenu method to select the Menu and click on it
        selectMenu(navigationName);
        //verify the page navigation.
        String expectedVerifyText = "Electronics";
        String actualVerifyText = electronicsPage.getVerfiyElectronicsText();
        Assert.assertEquals(expectedVerifyText,actualVerifyText);



    }

}
