@parametre
Feature: US002 Parametre Kullanimi
  Background: Ortak Alan
    Given Kullanici Amazon sayfasina gider

  Scenario: TC01 Kullanici Amazonda parametreli arama yapar
    Then Kullanici "nutella" aratir
    And Sonuclarin "nutella" icerdigini test eder
    #And Sayfayi kapatir

  Scenario: TC02 Kullanici Amazonda parametreli arama yapar
    Then Kullanici "selenium" aratir
    And Sonuclarin "selenium" icerdigini test eder
    #And Sayfayi kapatir

  Scenario: TC03 Kullanici Amazonda parametreli arama yapar
    Then Kullanici "java" aratir
    And Sonuclarin "java" icerdigini test eder
    #And Sayfayi kapatir

  Scenario: TC04 Kullanici Amazonda parametreli arama yapar
    Then Kullanici "sql" aratir
    And Sonuclarin "sql" icerdigini test eder
    And Sayfayi kapatir

    # Feature dosyasinda parametreli arama yaptigimizda "" icine aldigimiz string degeri stepDefinition'da
  # bir kez parametreli method olusturur ve yeni bir arama yapmak istedigimizde tekrar method method
  # olusturmadan aramak istedigimiz kelimeyi feature dosyasimizdaki "" tirnak icindeki
  # kelimeyi degistirmemiz yeterli olur. Boylece kodumuz dinamik olur.
