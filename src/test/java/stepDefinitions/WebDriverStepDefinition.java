package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepDefinition {
    WebPage web =new WebPage();
    @Then("Kullanici Login portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        Actions action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Kullanici Login portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        web.login.click();

    }

    @And("Kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        ArrayList<String> windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("Kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String arg0) {
    }

    @And("Kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String arg0) {
    }

    @And("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
    }

    @And("Kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
    }

    @And("Kullanici Ok butonuna tiklayarak Popup'i kapatir")
    public void kullaniciOkButonunaTiklayarakPopupIKapatir() {
    }

    @And("Kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
    }

    @And("Kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
    }
}
