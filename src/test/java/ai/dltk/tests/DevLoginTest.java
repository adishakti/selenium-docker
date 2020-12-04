package ai.dltk.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ai.dltk.pages.LoginPage;
import ai.generic.BaseTest;

public class DevLoginTest extends BaseTest{
	
	 @Test
	    @Parameters({"devUser","devPassword","username","password"})
	    public void devlogin(@Optional("Abc") String devUser, String devPassword,String username, String password) {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.goTo();
	        loginPage.login(username,password);
	        loginPage.developerAccess();
	        loginPage.developerLogin(devUser, devPassword);
	    }

}
