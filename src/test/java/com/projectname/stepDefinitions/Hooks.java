package com.projectname.stepDefinitions;
import com.projectname.factory.DriverFactory;
import com.projectname.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
	
	@Before
	public void setUp() {
	    ConfigReader.loadProperties();
	    DriverFactory.initDriver();
	}


	    @After
	    public void tearDown() {
	        DriverFactory.quitDriver();
	    }
}
