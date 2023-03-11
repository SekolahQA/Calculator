package stepsObject;

import com.cucumber.base.BaseTClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class AddEmployeePage extends BaseTClass {
    public static WebDriver driver;
    public AddEmployeePage(WebDriver driver) {
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

    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement addUs;

    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    WebElement addClick;

    @FindBy(name = "firstName")
    WebElement instFirstN;

    @FindBy(name = "middleName")
    WebElement instMidleN;

    @FindBy(name = "lastName")
    WebElement instLastN;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement inSave;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement slide;

    @FindBy(xpath = "//div[@class='orangehrm-employee-form']/div[@class='oxd-form-row']/div[1]//input[@class='oxd-input oxd-input--active']")
    WebElement setUser;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement setPassword1;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement setPassword2;

    @FindBy(xpath = "//h6[.='Personal Details']")
    WebElement verrrrri;

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    WebElement myInfoClick;

    @FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[1]//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement nationality;


    @FindBy(xpath = "//div[contains(text(),'Indonesian')]")
    WebElement choseNa;

    @FindBy(xpath = "//form[@class='oxd-form']//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[1]//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement selected;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement status;

    @FindBy(xpath = "//label[normalize-space()='Male']")
    WebElement gendar;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement est;

    @FindBy(xpath = "//input[@type='radio']/following-sibling::span[1]")
    WebElement listanak;

    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--focus']")
    WebElement klik1;
    @FindBy(xpath = "//div[text()='Other']")
    WebElement klik2;
    @FindBy(css = ".oxd-divider:nth-child(6)")
    WebElement stata;

    @FindBy(xpath = "//div[.='Indonesian']")
    private WebElement nationalityIndo;

    public void clickNationalityIndo() {
        nationalityIndo.click();
    }

    @FindBy(xpath = "//div[.='Single']")
    private WebElement maritalStatusSingle;

    public void clickMaritalStatusSingle() {
        maritalStatusSingle.click();
    }
    @FindBy(xpath = "//div[.='-- Select --']")
    private WebElement selectIndo;
    public void clickSelectIndo(){
        selectIndo.click();
    }
    @FindBy(xpath = "//div[.='-- Select --']")
    private WebElement selectSingle;
    public void clickSelectSingle() {
        selectSingle.click();
    }

    public void insUsPass(String username, String password){
        inUser.sendKeys(username);
        inPass.sendKeys(password);
    }

    public void btnLogin1(){
        loginBtn.click();
    }

    public void btnSave(){
        inSave.click();
    }

    public void slideUser(){
        slide.click();
    }

    public void addPim(){
        addUs.click();
    }
    public void addPimClick(){
        addClick.click();
    }

    public void addNewEmployee(String fname, String mname, String lname){
        instFirstN.sendKeys(fname);
        instMidleN.sendKeys(mname);
        instLastN.sendKeys(lname);
    }

    public void addNewUserLogin(String username, String password, String password1){
        setUser.sendKeys(username);
        setPassword1.sendKeys(password);
        setPassword2.sendKeys(password1);
    }

    public void verifPage(){
        Assertions.assertEquals("Personal Details",verrrrri.getText());
    }

    public void myInfoCheck(){
        myInfoClick.click();
    }

    public void clickNationality(){
        nationality.click();
        nationality.sendKeys("Indonesia");
        nationality.sendKeys(ENTER);
    }

    public void scrolDown(){
        Select drpCountry = new Select(selected);
        List<WebElement> nation = drpCountry.getOptions();
        System.out.println("Total >>>>>>>>>>>"+drpCountry.getFirstSelectedOption().getText());
//        drpCountry.selectByVisibleText("Afghan");

    }

    public void choseNationality(){
        choseNa.click();
    }

    public void genDer(){
        gendar.click();
    }

    public void selectNation(){

        // Verify the dropdown is enabled and visible.
        if(status.isEnabled() && status.isDisplayed())
        {
            System.out.println("Dropdown is enabled and visible");
        }
        else {
            System.out.println("Dropdown is not visible");
        }
        Select select = new Select(status);
        if(select.isMultiple())
        {
            System.out.println("Dropdown list accepts multiple choices");
        }
        else {
            System.out.println("Dropdown list does not accept multiple choices");
        }
        int listSize = select.getOptions().size();
        System.out.println("List size: " +listSize);

    }

    public void handle(){
        status.click();

        System.out.println(status.getText());
        Select se = new Select(status);
        List<WebElement> asda = se.getOptions();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+asda.size());
    
        se.selectByVisibleText("Single");
        se.selectByIndex(2);


    }

    public void esteh(){
        String result = est.getText();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+result);
        est.click();
        stata.click();
        listanak.getText();
        String adsf = listanak.getText();
        System.out.println(adsf+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<dsfsadfsadfsdf");
        Select es = new Select(listanak);
        List<WebElement> mambo = es.getOptions();
        mambo.get(1).click();
        mambo.set(1,listanak);
        System.out.println(mambo);
        es.selectByVisibleText("Single");
        es.selectByIndex(1);
    }

    public void setMar1(){
        klik1.click();
        Select mar1 = new Select(klik2);
        List<WebElement> mar2 = mar1.getOptions();

        System.out.println(mar2.size()+"<<<<<<<<<<<<<<<<<<<<<<<adsfdsfsdf");
        mar1.selectByVisibleText("Single");
    }




}
