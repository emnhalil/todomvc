@TC19 @Regression
Feature: TC_19 User verifies Clear Complete button's enables correctly after several uses

  Scenario: TC_19 User verifies Clear Complete button's enables correctly after several uses
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User enters multiple tasks
    And User clicks the checkbox of 3  tasks
    Then User verifies Clear Complete button is visible
    And User clicks the Clear completed button
    Then User verifies Clear Complete button is not visible
    And User clicks the Active Link to move to the Active tasks list
    And User clicks the checkbox of the task
    Then User verifies Clear Complete button is visible
    And User closes the browser