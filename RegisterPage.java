package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class RegisterPage {
    WebDriver driver;
    //1.Create page object/object repository in the form of By Locators.

    By registerButton = By.cssSelector("a[class='ico-register']");
    By radioButtonFemale = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By DateOfbirth =By.name("DateOfBirthDay");
    By DateOfmonth =By.name("DateOfBirthMonth");
    By DateOfyear =By.name("DateOfBirthYear");
    By emailId = By.id("Email");
    By companyName =By.id("Company");
    By NewsLetter = By.id("Newsletter");
    By password = By.id("Password");
    By confirmpassword = By.id("ConfirmPassword");
    By RegisterButton =By.xpath("//button[@id='register-button']");


    //2.Create Constructor of RegisterPage.

    public RegisterPage(WebDriver driver) { this.driver =driver;}



    //3.Page actions and Page methods
    public String getPageTitle() throws InterruptedException {
        String rpTitle = driver.getTitle();
        Thread.sleep(3000);
        System.out.println("Register page title is" + rpTitle);
        return rpTitle;
    }
    public boolean verifyRegisterButton() throws InterruptedException {
       Thread.sleep(3000);
        return driver.findElement(registerButton).isDisplayed();

    }

    public void doRegister(String FirstName,String LastName,String Day,String Month,String Year,String Email,
                           String Company,String Password,String ConfirmPassword) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(registerButton).click();
        driver.findElement(radioButtonFemale).click();
        Thread.sleep(3000);
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
        Thread.sleep(3000);
        driver.findElement(DateOfbirth).sendKeys(Day);
        driver.findElement(DateOfmonth).sendKeys(Month);
        driver.findElement(DateOfyear).sendKeys(Year);
        Thread.sleep(3000);
        driver.findElement(emailId).sendKeys(Email);
        Thread.sleep(3000);
        driver.findElement(companyName).sendKeys(Company);
        driver.findElement(NewsLetter).click();
        Thread.sleep(3000);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(confirmpassword).sendKeys(ConfirmPassword);
        driver.findElement(RegisterButton).click();

      //  System.out.println("credentials are.. "+ firstName + lastName + DateOfBirth + DateOfMonth +DateOfYear
            //    + Email + CompanyName + Password + ConfirmPassword );

    }




}

