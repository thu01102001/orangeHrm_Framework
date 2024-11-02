package com.orangehrm.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Level_01_Login {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
    }

    @Test
    public void TC_01_Register_Empty_Data() {
        driver.get("http://localhost:90/orangehrm/web/index.php/auth/login");

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
