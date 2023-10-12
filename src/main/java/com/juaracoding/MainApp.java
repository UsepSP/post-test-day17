package com.juaracoding;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class MainApp {
    private static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        String url ="https://shop.demoqa.com/my-account/";
        driver.get(url);

        //step login
        LoginPage loginPage = new LoginPage();
        loginPage.loginForm("usep","juaracoding");
        System.out.println("login valid");
        loginPage.addProduct();



        //step add product

        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

}