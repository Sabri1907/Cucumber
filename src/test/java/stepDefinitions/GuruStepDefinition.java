package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {
    GuruPage guru = new GuruPage();
    @Then("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {
        int index=0;
        for (int i = 0; i <guru.basliklar.size() ; i++) {
            if (guru.basliklar.get(i).getText().equals(baslik)){ // Featire'dan gelen string degeri i
                                                                 // degerine esitledik
                System.out.println(guru.basliklar.get(i).getText()); // Feature'dan gelen basligi yazdirdik
                index=i+1; // Feature'dan gelen i degerine esitledigimiz string'i ayni degere sahip sutunlari da
                // yazdirabilmek icin bos bir konteynir olusturup ona atadik. List'te index 0'dan basladigi icin ve
                // webTable locate'imiz 1'den basladigi icin i degerini 1 arttirdik.
                List<WebElement> sutunElement =
                        Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));
                // Sonrasinda webTable'daki body'yi locate edip esitledigimiz index'i baslik altindaki sutunu
                // getirebilmesi icin bu listede koyduk
                for (WebElement each:sutunElement) {
                    System.out.println(each.getText());
                    }
                //sutunElement.forEach(t-> System.out.println(t.getText()));
            }

        }

    }
}
