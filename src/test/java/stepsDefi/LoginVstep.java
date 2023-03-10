package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsObject.LoginVpage;
import utilBase.Hooks;

public class LoginVstep {

    public static WebDriver driver;

    public LoginVstep(){
        this.driver = Hooks.driver;
    }

    LoginVpage login;
    @Given("User on page Vulqa Cilsi")
    public void userOnPageVulqaCilsi() {
        login = new LoginVpage(driver);
    }

    @When("User click on login")
    public void userClickOnLogin() {
        login = new LoginVpage(driver);
        login.btnMasuk1();
    }

    @And("^User input (.*) and (.*)$")
    public void userInputUsernameAndPassword(String email, String password) {
        login = new LoginVpage(driver);
        login.txtEmailPass(email,password);
    }

    @And("User click on login button")
    public void userClickOnLoginButton() {
        login.btnMasuk2();
    }

    @Then("Get Valid login resource")
    public void getValidLoginResource() {
        login = new LoginVpage(driver);
        login.veriPage();
    }
}
