package stepsDefi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsObject.SearchPage;
import utilBase.Hooks;

public class SearchStep {
    public static WebDriver driver;
    public SearchStep(){
        this.driver = Hooks.driver;
    }
    SearchPage search;
    @Given("User visit google page")
    public void userVisitGooglePage() {
        System.out.println("afadfsadf<<<<<<<<<<<<<<1");
        search = new SearchPage(driver);
    }
    @When("User input search keyword")
    public void userInputSearchKeyword() {
        System.out.println("asdfsdaf<<<<<<<<<<<<<<<2");
        search = new SearchPage(driver);
        search.inputText();
        search.enterText();
    }
    @Then("User should see search result")
    public void userShouldSeeSearchResult() {
        System.out.println("asdfgasf<<<<<<<<<<<<<<<3");
        search.validPage();
    }
}
