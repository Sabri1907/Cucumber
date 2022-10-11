Feature: US006 Kullanici Amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir

    Given Kullanici Amazon sayfasina gider
    Then Kullanici "<istenenKelime>" aratir
    And Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And Sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |

    # TestNg'deki dataProvider kullanimindaki gibi Cucumber'da Scenario Outline kullaniriz.
    # Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz.
    # Feature dosyasinda yazdigimiz komutta eger "" kullanirsak stepDefinition'da parametreli bir
    # method olusturur. Ve artik stepDefinition'i kullanmadan feature dosyasinda "" icindeki
    # string'i degistirerek istedigimiz kelimeyi aratabilirim.
    # Scenerio Outline'da ise yine "" icinde birden fazla kellime aratacaksam "<>" seklindeki
    # kullanim ile "<>" icine yazdigim herhangi bir kelimeyi Scenario Outline'in asagida olusturdugu
    # Examples altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz.