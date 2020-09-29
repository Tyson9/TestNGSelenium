package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {



    public static void main(String[] args) {
    /* Verify URL changed
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
    */

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("cHromE");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys()--> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@smith.com");


        //click on Retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //save actual url after clicking button
        String actualUrl = driver.getCurrentUrl();

        //verify that url changed
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //close your browser
        driver.quit();





    }
}
