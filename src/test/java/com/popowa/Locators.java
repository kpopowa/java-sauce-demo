package com.popowa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators {

    @Test
            public void Locators(){

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

        driver.findElement(By.id("cart_contents_container"));
        driver.findElement(By.name("continue-shopping"));
        driver.findElement(By.className("social"));
        driver.findElement(By.tagName("div"));
        driver.findElement(By.linkText("Sauce Labs Backpack"));
        driver.findElement(By.partialLinkText("Labs Backpack"));
        driver.findElement(By.xpath("//div[@id='inventory_container]"));
        driver.findElement(By.xpath("//"));
    }
}
