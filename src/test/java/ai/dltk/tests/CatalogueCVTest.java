package ai.dltk.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ai.dltk.pages.CataloguePage;
import ai.dltk.pages.LoginPage;
import ai.generic.BaseTest;

public class CatalogueCVTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void CatalogueCV(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        CataloguePage catPage = new CataloguePage(driver);
        catPage.ComputerVision();
    }
}