package stepsDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsObject.AddEmployeePage;
import utilBase.Hooks;

public class UpdateEmployeeStep {
    public static WebDriver driver;
    public UpdateEmployeeStep(){
        this.driver = Hooks.driver;
    }

    AddEmployeePage update;

    @When("^I input new username and password$")
    public void iInputNewUsernameAndPassword() {
        update = new AddEmployeePage(driver);
        update.insUsPass("tonnyUV","Te$la1234");
        update.btnLogin1();
    }

    @And("^I click my info$")
    public void iClickMyInfo() {
        update = new AddEmployeePage(driver);
        update.myInfoCheck();
    }

    @And("^I input Nationality, marital status gender$")
    public void iInputNationalityMaritalStatusGender() throws InterruptedException {
        update = new AddEmployeePage(driver);
        update.clickSelectIndo();
        update.clickNationalityIndo();
        update.clickSelectSingle();
        update.clickMaritalStatusSingle();

//        update.esteh();
        update.genDer();
//        update.handle();
//        update.setMar1();

    }
    @Then("Get the result user Punc out")
    public void getTheResultUserPuncOut() {
        update.verifPage();
    }
}
