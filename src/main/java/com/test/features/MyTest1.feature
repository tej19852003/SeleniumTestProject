@first1
Feature:MyTest1

  @smoke
  Scenario:thisismyfirstscenario
    When Firstline
    Then Secondline

  @smoke @regression
  Scenario:this is my second scenario
    When Firstline
    Then Secondline