package com.juaracoding.page;

import com.juaracoding.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    //Locator Page Factory
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement btnLogin;

    //add product
    //menu
    @FindBy (xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    private WebElement menu;

    @FindBy (xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
    private WebElement pilih;

    @FindBy (xpath = "//select[@id='pa_color']")
    private WebElement color;

    @FindBy (xpath = "//select[@id='pa_size']")
    private WebElement size;


    //

    //logout
//    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
//    private WebElement profile;
//    @FindBy(xpath = "//a[normalize-space()='Logout']")
//    private WebElement btnLgout;

    public void login(){
        username.sendKeys("usep");
        password.sendKeys("juaracoding");
        btnLogin.click();
    }
    // ubah menjadi method parameter
    public void loginForm(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void addProduct(){
        menu.click();
        pilih.click();
        color.click();
        size.click();

    }

//    public void logOut(){
//        profile.click();
//        DriverSingleton.delay(3);
//        btnLgout.click();
//    }



//    public void logout(){
//        profile.click();
//        DriverSingleton.delay(2);
//        btnLgout.click();
//    }

}
