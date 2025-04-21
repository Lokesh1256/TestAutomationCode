package com.projectname.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            String env = System.getProperty("environment", "qa"); // default to "qa"
            FileInputStream fis = new FileInputStream("src/test/resources/config/" + env + ".properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static String getBranchName() {
        return System.getProperty("branch_name", "default_branch");
    }
}
