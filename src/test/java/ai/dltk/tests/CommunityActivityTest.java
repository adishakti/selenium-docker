package ai.dltk.tests;

import ai.dltk.pages.CommunityPage;
import ai.generic.BaseTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CommunityActivityTest extends BaseTest{


    @Test
    @Parameters({"username","password"})
    public void CommunityActivity(@Optional("Abc") String username, String password) {
    	CommunityPage commPage = new CommunityPage(driver);
    	commPage.goTo();
    	commPage.login(username,password);
        commPage.activity();
    }
}