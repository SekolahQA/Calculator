package stepsObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.base.BaseTClass;

import static org.openqa.selenium.Keys.ENTER;


public class SearchPage extends BaseTClass {
    public static WebDriver driver;
    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(xpath = "//h3[.='Sekolah QA Online 16+ Minggu dan Penyaluran Kerja']")
    WebElement validSearch;

    public void inputText(){
        searchBox.sendKeys("Sekolah QA");
    }
    public void enterText(){
        searchBox.sendKeys(ENTER);
    }

    public void validPage(){
        Assertions.assertEquals(validSearch.getText(),"Sekolah QA Online 16+ Minggu dan Penyaluran Kerja");
    }



}
