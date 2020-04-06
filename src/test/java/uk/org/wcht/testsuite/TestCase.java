package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class TestCase extends TestBase {
    HomePage homePage=new HomePage();

    @Test
    public void verifyUserShouldClickOnYourAccountLink(){
        homePage.clickOnYourAccountLink();
    }
    @Test
    public void VerifyUserShouldMouseHoverOnYourHomeDropDownLink(){
        homePage.mouseHoverOnYourHomeDropDownLink();
    }
    @Test
    public void VerifyUserShouldmouseHoverAndClickAboutUsDropDownLink(){
        homePage.mouseHoverAndClickAboutUsDropDownLink();
    }
}
