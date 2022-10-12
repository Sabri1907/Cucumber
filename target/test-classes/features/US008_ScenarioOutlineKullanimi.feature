Feature: Scenario Outline Kullanimi

  @BRC
  Scenario Outline: : TC11 kullanici gecersiz bilgilerle giris yapar
    Given Kullanici "blueRentUrl" adresine gider
    Then Login yazisina tiklar
    And Gecersiz "<gecersizUsername>" girer
    And Gecersiz "<password>" girer
    And Login butonuna basar
    Then Sayfaya giris yapilamadigini kontrol eder
    And Kullanici 2 saniye bekler
    And  Sayfayi kapatir

    Examples: :
  | gecersizEmail   | gecersizPass |
  |a@gmail.com      |    12346|
  |b@gmail.com      |    13246|
  |c@gmail.com      |    78974|
  |d@gmail.com      |    78564|
  |e@gmail.com      |    41454|

