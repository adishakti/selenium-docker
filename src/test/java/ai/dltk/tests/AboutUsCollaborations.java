package ai.dltk.tests;

import ai.dltk.pages.AboutUsPage;
import ai.dltk.pages.LoginPage;
import ai.generic.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AboutUsCollaborations extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void Collaborations(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        AboutUsPage aboutUs = new AboutUsPage(driver);
        aboutUs.Collaborations();
    }
}
