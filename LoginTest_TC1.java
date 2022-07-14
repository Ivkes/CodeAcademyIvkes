package tests;


import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest_TC1 extends BaseTest
{
    
public LoginPage loginPage;
String  standardUsername="standard_user";
String password="secret_sauce";
String expText="PRODUCTS";
public HomePage homePage;


@Test
public void loginTC1()
{
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage= new HomePage(driver);
    loginPage.basePage();
    loginPage.login(standardUsername, password);
    homePage.verifyLI(expText);

    try{
        Thread.sleep(5000);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
}
}
