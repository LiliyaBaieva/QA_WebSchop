package com.webShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHelper extends BaseHelper{

  public SelectHelper(WebDriver driver) {
    super(driver);
  }

  public void clickOnRegisterLink() {
    click(By.cssSelector(".ico-register"));
  }
}
