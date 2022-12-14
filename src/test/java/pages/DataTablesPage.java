package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class DataTablesPage {
    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButon;
    @FindBy (xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firtname;
    @FindBy (xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement lastname;
    @FindBy (xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy (xpath = "//input[@id='DTE_Field_office']")
    public WebElement office;
    @FindBy (xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extn;
    @FindBy (xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDate;
    @FindBy (xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;
    @FindBy (xpath = "//button[@class='btn']")
    public WebElement createButon;
    @FindBy (xpath = "//input[@type='search']")
    public WebElement search;
    @FindBy (xpath = "//td[@class='sorting_1']")
    public WebElement aramaSonucIlkElemet;
}