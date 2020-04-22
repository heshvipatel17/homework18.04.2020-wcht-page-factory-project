package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Your account")
    WebElement _yourAccountLink;

    @FindBy(linkText = "Your home")
    WebElement _yourHomeDropDownLink;

    @FindBy(linkText = "About us")
    WebElement _aboutUsDropDownLink;


    public void clickOnYourAccountLink() {
        Reporter.log(" Click on your account link " + _yourAccountLink.toString() + "<br>");
        clickOnElement(_yourAccountLink);
        log.info("Click on your account link " + _yourAccountLink.toString());
    }

    public void mouseHoverOnYourHomeDropDownLink() {
        Reporter.log("Click on your home link " + _yourHomeDropDownLink.toString() + "<br>");
        mouseHoverToElement(_yourHomeDropDownLink);
        log.info("Click on your home link " + _yourHomeDropDownLink.toString());
    }

    public void mouseHoverAndClickAboutUsDropDownLink() {
        Reporter.log("Click on about us link " + _aboutUsDropDownLink.toString() + "<br>");
        mouseHoverToElementAndClick(_aboutUsDropDownLink);
        log.info("Click on about us link " + _aboutUsDropDownLink.toString());
    }

}
