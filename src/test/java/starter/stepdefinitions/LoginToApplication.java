package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.Dashboard;
import pages.HomePage;

public class LoginToApplication {

    @Steps
    HomePage home;

    @Steps
    Dashboard dash;

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        home.openApplication();
    }

    @When("user enter admin as username")
    public void user_enter_admin_as_username() {
        home.enterUsername();
    }

    @When("user enter admin123 as pasword")
    public void user_enter_admin123_as_pasword() {
        home.enterPassword();
        home.clickOnLoginButton();
    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
        dash.verifyAdmin();
    }
}
