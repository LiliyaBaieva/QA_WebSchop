package com.webShop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


  @Test
  public void loginTest(){
    app.getUser().clickOnLoginLink();
    app.getUser().fillOnLoginForm("seiz1@gmail.com", "12345678");
    app.getUser().clickOnLoginButton();
    Assert.assertTrue(app.getUser().isLogOutLinkPresent());
  }

}
