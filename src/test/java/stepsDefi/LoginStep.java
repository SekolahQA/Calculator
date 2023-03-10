package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsObject.LoginPage;
import utilBase.Hooks;

public class LoginStep {
    public static WebDriver driver;
    public LoginStep(){
        this.driver = Hooks.driver;
    }
    LoginPage login;

    @Given("User on page employee sdcillsy")
    public void userOnPageEmployeeSdcillsy() {
        login = new LoginPage(driver);
    }
    @When("^User fill form (.*) and (.*)$")
    public void userFillFormUsernameAndPassword(String username, String password) {
        login = new LoginPage(driver);
        login.insUsPass(username,password);
    }
    @And("User click on loginad")
    public void userClickOnLoginad() {
        login = new LoginPage(driver);
        login.btnLogin1();
    }
    @Then("Get user Valid login resource")
    public void getUserValidLoginResource() {
        login = new LoginPage(driver);
        login.validPage();
    }
}
