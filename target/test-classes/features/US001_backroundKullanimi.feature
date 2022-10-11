Feature: US001 Backround Kullanimi

  Background: Ortak Kisim
    Given Kullanici Amazon sayfasina gider
    # Testlerde ortak olan baslangic kisimlarini Background kismina yazariz ve testlerden sileriz.


  Scenario: TC01 Kullanici Amazon'da nutella aratir

    Then Kullanici nutella aratir
    And Sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanici Amazon'da Selenium aratir

    Then Kullanici Selenium aratir
    And Sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanici Amazon'da iphone aratir

    Then Kullanici iphone aratir
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir