package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamBurgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@data-test='inventory-item-name']")
    List<WebElement> products;

    @FindBy(tagName = "select")
    WebElement Sorter;

    @FindBy(xpath = "//div[@data-test='inventory-item-price']")
    List<WebElement> prices;



    public boolean isHomePageDisplayed() {
        return shoppingCartLink.isDisplayed();
    }

    public void clickOnAddToCartOfFirstItem() {
        addToCartBtnList.get(0).click();
    }

    public void clickOnShoppingCartLink() {
        shoppingCartLink.click();
    }

    public String getCartIconQty() {
        return shoppingCartLink.findElement(By.xpath("./span")).getText();
    }

    public void clickOnHamburgerMenu() {
        hamBurgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public  void firstProduct(){ System.out.println(products.get(0).getText());}

    public void firstProductPrice(){ System.out.println(prices.get(0).getText().substring(1));}

    public void changeSortOrderZToA(){ Select sort = new Select(Sorter); sort.selectByValue("za"); products.clear();prices = driver.findElements(By.xpath("//div[@data-test='inventory-item-name']"));}

    public void changeSortOrderHighToLow(){ Select sort = new Select(Sorter); sort.selectByValue("hilo"); products.clear();prices = driver.findElements(By.xpath("//div[@data-test='inventory-item-price']"));}




}
