package com.webShop.fw;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppManager {
  String browser;
  public WebDriver driver;

  SelectHelper select;

  UserHelper user;

  public AppManager(String browser) {
    this.browser = browser;
  }

  public void init(){
    if(browser.equalsIgnoreCase("chrome")){
      driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("firefox")) {
      driver = new FirefoxDriver();
    } else if (browser.equalsIgnoreCase("edge")) {
      EdgeOptions options = new EdgeOptions();
      options.addArguments("remote-allow-origins=*");
      driver = new EdgeDriver(options);
    }

//  Открыть сайт, развернуть браузер на весь экран
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    select = new SelectHelper(driver);
    user = new UserHelper(driver);
  }

  public void stop(){
    driver.quit();
  }

  public SelectHelper getSelect() {
    return select;
  }

  public UserHelper getUser() {
    return user;
  }

}















