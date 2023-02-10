Feature:US1001 amazon arama

  @amazon
Scenario:TC01 amazon nutella arama
  When kullanıcı amazon sayfasına gider
  And nutella için arama yapar
  Then sonucun nutella içerdiğini test eder
    And  sayfayı kapat