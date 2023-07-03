package com.webShop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

  @Test
  public void registrationTest(){

    //  Перейти на страницу регистрации
    app.getSelect().clickOnRegisterLink();

    //  Зарегистрироваться
    app.getUser().fillOnRegisterForm(false, "Maia", "Seiz", "seiz2@gmail.com", "12345678", "12345678");
    app.getUser().clickOnRegisterButton();

  //  Убедиться, что вы зарегистрированы
    Assert.assertTrue(app.getUser().isRegisterComplited());
  }



//  Условия:
//  Использовать модель Value Object
//  Использовать сборщик Gradle


}
