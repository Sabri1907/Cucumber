@US003
Feature: Parametre Kullanimi
  @grp1
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonUrl" sayfasina gider
    When Kullanici "nutella" aratir
    Then Sonuclarin "nutella" icerdigini test eder
    #And Sayfayi kapatir
  @grp2
  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "blueRentUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "blue" icerdigini test eder
    #And Sayfayi kapatir
  @grp2
  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "googleUrl" sayfasina gider
    Then Kullanici 2 saniye bekler
    Then Url'in "google" icerdigini test eder
    #And Sayfayi kapatir

  @grp1
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceBookUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Url'in "facebook" icerdigini test eder
    And Sayfayi kapatir
