package uk.org.wcht.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.browserselector.BrowserSelector;
import uk.org.wcht.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    //getting "baseUrl" & "browser values from cinfig.properties
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    //open browser
    @BeforeMethod(groups = {"Regression","Sanity","Smoke"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //close browser
    @AfterMethod(groups = {"Regression","Sanity","Smoke"})
    public void tearMethod() {
        driver.quit();
    }
}
