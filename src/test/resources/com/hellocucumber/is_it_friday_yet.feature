Feature: Is it Friday yet ?
  Everybody wants to know when it's friday

  Scenario: Sunday isn't Friday
    Given today is sunday
    When I ask whether it's Friday yet
    Then I should be told "nope"