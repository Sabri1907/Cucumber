package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonunabasar")
    public void new_butonunabasar() {
        dataTablesPage.newButon.click();
    }
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {
        dataTablesPage.firtname.sendKeys(firstname);
    }
    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        dataTablesPage.lastname.sendKeys(lastname);
    }
    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }
    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }
    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }
    @Then("starDate bolumune {string} yazar")
    public void star_date_bolumune_yazar(String starDate ) {
        dataTablesPage.startDate.sendKeys(starDate);
    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButon.click();
    }
    @When("kullanici  {string} ile aramayapar")
    public void kullaniciIleAramayapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElemet.getText().contains(firstname));
    }
}