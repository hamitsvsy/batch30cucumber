Feature: US1003 kullanıcı istediği kelime için arama yapıp sonucu test eder
    @parametre
  Scenario: TC07 istenen kelimenin olduğu test etme
    Given kullanıcı "amazonUrl" sayfasına gider
    And  "armut" için arama yapar
    And  sonucun "armut" içerdiğini test eder
    And  sayfayı kapat

