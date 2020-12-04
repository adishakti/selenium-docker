package ai.dltk.tests;

import ai.dltk.pages.LoginPage;
import ai.dltk.pages.WhitePapersPage;
import ai.generic.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WhitePapersDetectingEmotions extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void detectingEmotions(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        WhitePapersPage whitePaper = new WhitePapersPage(driver);
        whitePaper.detectingMotions();
    }
}
