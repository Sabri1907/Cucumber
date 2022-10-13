Feature: US004 ConfigReader Olmadan Parametre Kullanimi
  @grp5
  Scenario: TC04 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "https://www.amazon.com" adresine gider
    Then Kullanici 3 saniye bekler
    Then Url'in "trend" icerdigini test eder
    And Sayfayi kapatir