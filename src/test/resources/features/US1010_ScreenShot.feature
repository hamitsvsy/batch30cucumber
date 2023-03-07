
@screenShot
Feature: US1010 test failed olursa screenshot çalışmalı

  Scenario: TC14 Amazon test
    When kullanıcı "amazonUrl" sayfasına gider
    Then baslığın "Amazon" içerdiğini test eder
    And sayfayı kapat

  Scenario: TC15 Amazon test
    When kullanıcı "editorUrl" sayfasına gider
    Then baslığın "editor" içerdiğini test eder
    And sayfayı kapat

  Scenario: TC16 Amazon test
    When kullanıcı "bestbuyUrl" sayfasına gider
    Then baslığın "bestbuy" içerdiğini test eder
    And sayfayı kapat