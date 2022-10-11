@Outline
Feature: US007 Scenario Outline Kullanimi

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir
    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 3 saniye bekler
    And Url'in "<arananKelime>" icerdigini test eder
    And Sayfayi kapatir
    Examples:
      | arananUrl      | arananKelime |
      | amazonUrl      | amazon       |
      | faceBookUrl    | facebook     |
      | hepsiBuradaUrl | hepsiburada  |
      | blueRentUrl    | blue         |
      | googleUrl      | google       |
