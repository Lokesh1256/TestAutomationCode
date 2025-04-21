package com.projectname.stepDefinitions;

import com.projectname.factory.DriverFactory;
import com.projectname.pages.LoginPage;
import com.projectname.utils.ConfigReader;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
	private static final Logger logger = LogManager.getLogger(LoginPage.class);
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage;

    @Given("user launches the application")
    public void launchApplication() {
    	logger.info("----------------------------"+ConfigReader.getProperty("url"));
    	ExtentCucumberAdapter.getCurrentStep().info("----------------------------"+ConfigReader.getProperty("url"));
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("user enters username {string} and password {string}")
    public void enterCredentials(String username, String password){
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }

    @Then("user should see the dashboard")
    public void verifyDashboard() {
    	System.out.println("Dashboard verification started");
    	    Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    	}
    }
