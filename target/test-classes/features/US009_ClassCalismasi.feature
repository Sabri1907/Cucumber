Feature: US1009 Datatables sitesine 5 farkli giris yapalim
  @datatable
  Scenario Outline: TS14 kullanici 5 farkli kayit girisi yapabilmeli
    When Kullanici "dataTablesUrl" sayfasina gider
    Then new butonunabasar
    And isim bolumune "<firstname>" yazar
    And Kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>" yazar
    And Kullanici 1 saniye bekler
    And position bolumune "<position>" yazar
    And Kullanici 1 saniye bekler
    And office bolumune "<office>" yazar
    And Kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
    And Kullanici 1 saniye bekler
    And starDate bolumune "<starDate>" yazar
    And Kullanici 1 saniye bekler
    And salary bolumune "<salary>" yazar
    And Kullanici 1 saniye bekler
    And Create tusuna basar
    And Kullanici 1 saniye bekler
    When kullanici  "<firstname>" ile aramayapar
    And Kullanici 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And Kullanici 1 saniye bekler
    And Sayfayi kapatir
    Examples:
      | firstname | lastname | position | office | extension | starDate   | salary |
      | alim      | alim     | qa       | ankara | UI        | 2021-10-11 | 11000  |
      | ismail    | Can      | testter  | ankara | api       | 2021-05-05 | 11000  |
      | huseyin   | kacmaz   | BA       | berlin | -         | 2021-10-12 | 40000  |