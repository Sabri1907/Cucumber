Feature: US004 ConfigReader Olmadan Parametre Kullanimi

  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "https://www.amazon.com" adresine gider
    Then Kullanici 3 saniye bekler
    Then Url'in "amazon" icerdigini test eder
    And Sayfayi kapatir