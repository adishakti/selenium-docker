package ai.dltk.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ai.dltk.pages.CommunityPage;
import ai.dltk.pages.LoginPage;
import ai.generic.BaseTest;

public class CommunityIOTTest extends BaseTest{


    @Test
    @Parameters({"username","password"})
    public void CommunityIOT(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        CommunityPage commPage = new CommunityPage(driver);
        commPage.InternetofThings();
    }
}