package com.automation.test;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class VerifySortOrderHightoLow extends BaseTest {

    @Test
    public void VerifySortOrder(){

        loginPage.openWebsite();

        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));

        Assert.assertTrue(homePage.isHomePageDisplayed());

        System.out.println("BEFORE SORTING");

        homePage.firstProductPrice();

        homePage.changeSortOrderHighToLow();

        System.out.println("AFTER SORTING");

        homePage.firstProductPrice();
    }
}
