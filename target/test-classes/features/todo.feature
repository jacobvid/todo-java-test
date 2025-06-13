Feature: Todo Management

  Scenario: Add todo item
    Given I have opened the Todo application
    When I add "Buy milk" to the list
    Then the list should contain "Buy milk"
