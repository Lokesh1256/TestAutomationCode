package com.projectname.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameField = By.xpath("//input[@id='password']/../preceding-sibling::div/input");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[normalize-space()='Sign in']");
    private By dashboardText = By.id("dashboard");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isDashboardVisible() {
        return driver.findElement(dashboardText).isDisplayed();
    }
}
