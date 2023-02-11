Feature: US1004 ebaybuy sayfasında kelime arama

  Scenario:TC08 kullanıcı ebay da istediği kelimeyi aratıp test eder

    Given kullanıcı "amazonUrl" sayfasına gider
    Then "nutella" için arama yapar
    And sonucun "nutella" içerdiğini test eder
    Then  sayfayı kapat

    #burada tüm step definitions tanımlı gibi gözüksede test çalışmaz çünkü
    #çünkü arama yapar ve sonucu test eder tepler amazona göre locate edildi
    #yani locate bulamaz yeni ebaypage oluşturmak lazım
