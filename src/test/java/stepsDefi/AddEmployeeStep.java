package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsObject.AddEmployeePage;
import utilBase.Hooks;


public class AddEmployeeStep {
    public static WebDriver driver;
    public AddEmployeeStep(){
        this.driver = Hooks.driver;
    }
    AddEmployeePage employee;
    @Given("^I in home page OrangeHRM$")
    public void iInHomeLoginOrangeHRM() {
        employee = new AddEmployeePage(driver);
    }

    @When("^I input username and password$")
    public void iInputUsernameAndInputPassword() {
        employee = new AddEmployeePage(driver);
        employee.insUsPass("Admin","s3Kol4HQA!*");
    }
    @And("^I click login$")
    public void iClickLogin() {
        employee = new AddEmployeePage(driver);
        employee.btnLogin1();
    }
    @And("I add new user PIM")
    public void iInTheHomePage() {
        employee.addPim();
    }
    @And("^I input First Name, Midle Name, Last Name$")
    public void iInputNameUsernamePassword() {
        employee = new AddEmployeePage(driver);
        employee.addPimClick();
        employee.addNewEmployee("Tonya","Ult","Van");
        employee.slideUser();
    }
    @And("I set Username and Password")
    public void iSetUsernameAndPassword() {
        employee = new AddEmployeePage(driver);
        employee.addNewUserLogin("tonnyUV","Te$la1234","Te$la1234");
        employee.btnSave();
    }
    @Then("Get get the result user")
    public void getTheResultUser() {
        employee.verifPage();
    }
}

