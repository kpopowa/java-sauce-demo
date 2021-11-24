package com.popowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemo {

    @Test
    public void sauceDemo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement enterUsername = driver.findElement(By.name("user-name"));
        enterUsername.sendKeys("standard_user");

        WebElement enterPassword = driver.findElement(By.name("password"));
        enterPassword.sendKeys("secret_sauce");

        WebElement pressLogInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        pressLogInButton.click();

        WebElement confirmLogIn = driver.findElement(By.xpath("//span[@class='title']"));
        Assert.assertTrue(confirmLogIn.isDisplayed());

        WebElement pressAddToCardInButton = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        pressAddToCardInButton.click();

        WebElement pressCartBadgeButton = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        pressCartBadgeButton.click();

        WebElement checkPrice = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        Assert.assertEquals(checkPrice.getText(), "$29.99");

        WebElement checkTitle = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        Assert.assertEquals(checkTitle.getText(), "Sauce Labs Backpack");

        driver.quit();
    }
}