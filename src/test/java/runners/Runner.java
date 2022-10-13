package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@grp5", // Calistirmak istedigimiz tag'i yazariz. Hepsini calistirmak icin @All,
        // istedigimiz iki tag'i calistirmak icin de grp1 or grp2 seklinde yazariz..
        dryRun = false
)
public class Runner {
    /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runner dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder
    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */
}