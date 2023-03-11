package stepsObject;

import com.cucumber.base.BaseTClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTClass {

    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(name = "username")
    WebElement inUser;

    @FindBy(name = "password")
    WebElement inPass;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement verrrrri;

    public void insUsPass(String username, String password){
        inUser.sendKeys(username);
        inPass.sendKeys(password);
    }

    public void btnLogin1(){
        loginBtn.click();
    }

    public void validPage(){
        String result = verrrrri.getText();
        Assertions.assertEquals("Dashboard",verrrrri.getText());
//        System.out.println(result+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
