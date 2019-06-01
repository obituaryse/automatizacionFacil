package com.trend.sys.steps;

import com.trend.sys.UATBase;
import com.trend.sys.pages.Google;
import com.trend.sys.pages.HomePageUAT;
import com.trend.sys.pages.IndexPageUAT;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.inject.Inject;

/**
 * Created by Pamela
 */
public class TestHomeSteps extends UATBase {

    IndexPageUAT indexPageUAT;

    HomePageUAT homePageUAT;

    Google google;

    @Before
    public void setupForTest() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
    }

    @After
    public void shutDown(Scenario scenario) {

        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");

        driver.quit();
    }

    @Given("the user enters Index page")
    public void setup() {
        indexPageUAT = new IndexPageUAT(driver);
        assertThat(indexPageUAT.checkIfThePageIsIndexPage()).isTrue();
    }

    @When("user navigates to home page")
    public void userNavigatesToHome() {
        homePageUAT = indexPageUAT.clickOnHomeButton();
        assertThat(homePageUAT.checkIfThePageIsHomePage()).isTrue();
    }

    @Then("user should be able to see home page")
    public void checkForAllHeaders() {
        assertThat(homePageUAT.checkIfHomePageTextAvailable()).isTrue();
    }

    @Given("^the user login in google$")
    public void theUserLoginInGoogle() {
        /*pageGoogle = new Google(driver);
        pages.*/
        google = new Google(driver);
        google.goTo();
    }

    @And("^write something in label$")
    public void writeSomethingInLabel() {
        //pageGoogle.writteSomething();
        google.getGoogleSearch().searchFor("holas");
    }

    @And("^put the button search$")
    public void putTheButtonSearch() {
        //pageGoogle.pushButton();
        //google.getGoogleSearch().
    }

    @Given("^ejecutar for XD$")
    public void ejecutarForXD() {
        String gp = "GPPPSR";
        String pl = "SRSMART";
        String cat = "";
        String com = "MV_NRO_AMI";
        String layo = "1";
        for (int i = 136; i <= 138; i++) {
            System.out.println("\tINSERT INTO INTEGRATION_ESB.CF_PARAMETER_VALUES\n" +
                    "\t(ROW_KEY, CONFIGURATION_CODE, PARAMETER_CODE, PARAMETER_VALUE, REGISTER_DATE, STATUS_CODE)\n" +
                    "\tVALUES\n" +
                    "\t(vROW_KEY + "+i+", 'PHONEBOOK_RATE_TYPE_PRV', 'PLAN_GROUP', '"+gp+"', SYSDATE, 'AC');\n" +
                    "\tINSERT INTO INTEGRATION_ESB.CF_PARAMETER_VALUES\n" +
                    "\t(ROW_KEY, CONFIGURATION_CODE, PARAMETER_CODE, PARAMETER_VALUE, REGISTER_DATE, STATUS_CODE)\n" +
                    "\tVALUES\n" +
                    "\t(vROW_KEY + "+i+", 'PHONEBOOK_RATE_TYPE_PRV', 'PLAN_CODE', '"+pl+"', SYSDATE, 'AC');\n" +
                    "\tINSERT INTO INTEGRATION_ESB.CF_PARAMETER_VALUES\n" +
                    "\t(ROW_KEY, CONFIGURATION_CODE, PARAMETER_CODE, PARAMETER_VALUE, REGISTER_DATE, STATUS_CODE)\n" +
                    "\tVALUES\n" +
                    "\t(vROW_KEY + "+i+", 'PHONEBOOK_RATE_TYPE_PRV', 'CATEGORY_CODE', '"+cat+"', SYSDATE, 'AC');\n" +
                    "\tINSERT INTO INTEGRATION_ESB.CF_PARAMETER_VALUES\n" +
                    "\t(ROW_KEY, CONFIGURATION_CODE, PARAMETER_CODE, PARAMETER_VALUE, REGISTER_DATE, STATUS_CODE)\n" +
                    "\tVALUES\n" +
                    "\t(vROW_KEY + "+i+", 'PHONEBOOK_RATE_TYPE_PRV', 'COMPONENT_CODE', '"+com+"', SYSDATE, 'AC');\n" +
                    "\tINSERT INTO INTEGRATION_ESB.CF_PARAMETER_VALUES\n" +
                    "\t(ROW_KEY, CONFIGURATION_CODE, PARAMETER_CODE, PARAMETER_VALUE, REGISTER_DATE, STATUS_CODE)\n" +
                    "\tVALUES\n" +
                    "\t(vROW_KEY + "+i+", 'PHONEBOOK_RATE_TYPE_PRV', 'VALUE_RATE_TYPE_PRV', '"+layo+"', SYSDATE, 'AC');");
        }

    }
}
