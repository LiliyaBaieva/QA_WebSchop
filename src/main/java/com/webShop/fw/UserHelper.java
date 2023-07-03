package com.webShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{

  public UserHelper(WebDriver driver) {
    super(driver);
  }


  public void fillOnRegisterForm(
      boolean male, String name, String lastName, String email, String password,
      String confirmPassword) {
    isGenderMale(male);
    //first name
    type(By.id("FirstName"), name);
    //second name
    type(By.id("LastName"), lastName);
    // email
    type(By.id("Email"), email);
    // password

    type(By.id("Password"), password);
    // confirm password
    type(By.id("ConfirmPassword"), confirmPassword);
  }

  public void isGenderMale(boolean male){
    if(male){
      click(By.id("gender-male"));
    }
    click(By.id("gender-female"));
  }

  public boolean isRegisterComplited() {
    String result = driver.findElement(By.cssSelector(".result")).getText();
    if(!result.contains("Your registration completed")){
      return false;
    }
    return true;
  }

  public void clickOnRegisterButton() {
    click(By.id("register-button"));
  }

  public void clickOnLoginLink() { //
    if(!isElementPresent(By.cssSelector(".ico-login"))){
      click(By.cssSelector(".ico-logout"));
    }
    click(By.cssSelector(".ico-login"));
  }

  public void fillOnLoginForm(String email, String password) {
    type(By.id("Email"), email);
    type(By.id("Password"), password);
  }

  public void clickOnLoginButton() {
    click(By.xpath("//*[@class='button-1 login-button']"));
  }

  public boolean isLogOutLinkPresent() {
    return isElementPresent(By.cssSelector(".ico-logout"));
  }
}
