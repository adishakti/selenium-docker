package ai.dltk.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ai.dltk.pages.LoginPage;
import ai.dltk.pages.UseCasePage;
import ai.generic.BaseTest;

public class UseCasePredictElectricityTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void UseCasePredictAgeGender(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        UseCasePage UseCasPage = new UseCasePage(driver);
        UseCasPage.PredictAgeGender();
    }
}