@TC14 @Regression
Feature: TC_14 User sees accurate number of active tasks

  Scenario: TC_14 User sees accurate number of active tasks
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User enters multiple tasks
    Then User verifies that the counter increments correctly
    And User closes the browser