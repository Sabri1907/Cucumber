package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("Kullanici Amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {

       amazonPage.aramaKutusu.sendKeys("nutella"+Keys.ENTER); //
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuWE.getText().contains("nutella"));

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium"+Keys.ENTER);

    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuWE.getText().contains("Selenium"));
    }

    @Then("Kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone"+Keys.ENTER);
    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.aramaSonucuWE.getText().contains("iphone"));
    }

    @Then("Kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);
    }

    @And("Sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.aramaSonucuWE.getText().contains(arananKelime));

    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }




    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String arg0) {
        Driver.getDriver().get("https://www.amazon.com");
    }
}
