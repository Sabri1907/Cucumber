package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class AmazonStepDefinition {
    @Given("Kullanici Amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("Kullanici nutella aratir")
    public void kullaniciNutellaAratir() {

        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"))
                .getText().contains("nutella"));

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
