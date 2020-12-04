package ai.dltk.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ai.dltk.pages.LoginPage;
import ai.dltk.pages.CommunityPage;
import ai.generic.BaseTest;

public class CommunityAITest extends BaseTest{


    @Test
    @Parameters({"username","password"})
    public void CommunityAI(@Optional("Abc") String username, String password) {
    	CommunityPage commPage = new CommunityPage(driver);
    	commPage.goTo();
    	commPage.login(username,password);
        commPage.ArtificalIntelligence();
    }
}