Feature: US005 Class Work Hotel Login
  Scenario: TC01 Kullanici gecersiz bilgilerle giris yapamaz
    Given Kullanici "blueRentUrl" sayfasina gider
    Then Login yazisina tiklar
    And Kullanici 2 saniye bekler
    Then Gecersiz username girer
    And Kullanici 2 saniye bekler
    Then Gecersiz password girer
    And Login butonuna basar
    Then Sayfaya giris yapilamadigini kontrol eder
    And Sayfayi kapatir
