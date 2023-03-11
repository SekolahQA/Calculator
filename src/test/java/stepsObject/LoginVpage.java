package stepsObject;

import com.cucumber.base.BaseTClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVpage extends BaseTClass {
    public static WebDriver driver;
    public LoginVpage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='navbar-nav navbar-right']//a[normalize-space()='Masuk']")
    WebElement btnmasuk;

    @FindBy(name = "email")
    WebElement inputMail;

    @FindBy(name = "password")
    WebElement insertPass;

    @FindBy(xpath = "//button[normalize-space()='MASUK']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@class='hello-user']")
    WebElement verifa;


    public void txtEmailPass(String email,String password){
        inputMail.sendKeys(email);
        insertPass.sendKeys(password);
    }

    public void btnMasuk2(){
        btnLogin.click();
    }

    public void btnMasuk1(){
        btnmasuk.click();
    }

    public void veriPage(){
        Assertions.assertEquals("Dashboard",verifa.getText());
        String result = verifa.getText();
        System.out.println(result);
    }




}
