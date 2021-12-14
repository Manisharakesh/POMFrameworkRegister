package com.demo.nopcommerce.tests;

import com.demo.nopcommerce.base.BasePage;
import com.demo.nopcommerce.pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Properties;


public class RegisterPageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    RegisterPage registerPage;

@BeforeTest
    public void openRegisterPage() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);

    }
  // @Test(priority = 1)
  //  public void verifyRegister() throws InterruptedException {
  // Thread.sleep(3000);
    //   Assert.assertTrue(registerPage.verifyRegisterButton(),"Register button is not displayed");

    @Test(priority = 1)
    public void verifyRegisterPageTitleTest() throws InterruptedException {
    Assert.assertEquals(registerPage.getPageTitle(), "nopCommerce demo store. Register","Register title page does not match");

    }
    @Test(priority = 2)
    public void RegisterPageTest() throws InterruptedException {
         Thread.sleep(3000);
     registerPage.doRegister(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Day"), prop.getProperty("Month"), prop.getProperty("Year"), prop.getProperty("Email"),
             prop.getProperty("Company"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword") );


}

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



    }



