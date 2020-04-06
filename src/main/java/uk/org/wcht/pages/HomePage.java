package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {

    By yourAccountLink = By.linkText("Your account");
    By yourHomeDropDownLink = By.linkText("Your home");
    By aboutUsDropDownLink = By.linkText("About us");


    public void clickOnYourAccountLink() {
        clickOnElement(yourAccountLink);
    }

    public void mouseHoverOnYourHomeDropDownLink() {
        mouseHoverToElement(yourHomeDropDownLink);
    }

    public void mouseHoverAndClickAboutUsDropDownLink() {
        mouseHoverToElementAndClick(aboutUsDropDownLink);
    }

}
