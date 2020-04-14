package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage=new HomePage();

    @Test(priority = 5, groups = {"Regression","Sanity"})
    public void verifyUserShouldClickOnYourAccountLink(){
        homePage.clickOnYourAccountLink();
    }
    @Test (priority = 1,groups = {"Regression","Smoke"})
    public void VerifyUserShouldMouseHoverOnYourHomeDropDownLink(){
        homePage.mouseHoverOnYourHomeDropDownLink();
    }
    @Test (priority = 3,groups = {"Regression"})
    public void VerifyUserShouldmouseHoverAndClickAboutUsDropDownLink(){
        homePage.mouseHoverAndClickAboutUsDropDownLink();
    }
}
