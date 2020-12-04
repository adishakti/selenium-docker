package ai.dltk.tests;

import ai.dltk.pages.DIYPage;
import ai.dltk.pages.LoginPage;
import ai.generic.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DIYReviewInspector extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void ReviewInspector(@Optional("Abc") String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo();
        loginPage.login(username,password);
        DIYPage diy = new DIYPage(driver);
        diy.ReviewInspector();
    }
}
