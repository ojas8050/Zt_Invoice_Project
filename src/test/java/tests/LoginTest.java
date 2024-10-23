package tests;

import Action.CommanAction;
import Constants.LoginConstants;
import Pages.LoginPage;
import Utils.Log;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginToApplication() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToSalesForce(LoginConstants.Username,LoginConstants.Password)
                .ClickOnLoginButton();

    CommanAction commanAction=new CommanAction(driver);
    commanAction.ClickOnOpportunities();
    Log.info("Clicked on Opportunities");
    Thread.sleep(3000);
    commanAction.ClivkonABClink();
    Log.info("click on acb link");
    commanAction.clickoneditbutton1();
    Log.info("click on edit button of opportunities");
    commanAction.ClickOnAccount();
    Log.info("Clicked on Account Object");
    commanAction.ClickOnDiseny();
        Log.info("Clicked on testing link");
        Thread.sleep(3000);

        commanAction.ClickOnEditButton0();

        Log.info("Clicked on edit button");
        Thread.sleep(3000);

        commanAction.ClickOnEmployees();

        Log.info("Click on employee onject");
        Thread.sleep(3000);

        commanAction.clickonojaslink();


        Log.info("Click on ojas link");
        Thread.sleep(3000);

        commanAction.clickoneditbutton2();
        Log.info("click on edit button of employees");
        Thread.sleep(3000);

        commanAction.ClickOnInvoice();
    Log.info("Clicked on Invoice");
        Thread.sleep(3000);

        commanAction.ClickonProjectHistory();
    Log.info("Clicked on ProjectHistory");
}}