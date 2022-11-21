Feature: US004 ConfigReader Olmadan Parametre Kullanimi

  @night
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "https://www.amazon.com" adresine gider
    Then Kullanici 3 saniye bekler
    Then Url'in "hepsi" icerdigini test eder
    And Sayfayi kapatir