package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BlueRentalCarStepDefinition {
    Actions action = new Actions(Driver.getDriver());
    BlueRentalCarsPage blueRent = new BlueRentalCarsPage();
    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
       blueRent.blueRentLogin.click();
    }

    @Then("Gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRent.blueRentUser.sendKeys("gecersiz@gmail.com");
    }

    @Then("Gecersiz password girer")
    public void gecersizPasswordGirer() {
        action.sendKeys(Keys.TAB).sendKeys("12345").perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("Sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRent.invalidLogin.isDisplayed());
        //Assert.assertTrue(blueRent.invalidGirisYazisi.isDisplayed());
    }


}
