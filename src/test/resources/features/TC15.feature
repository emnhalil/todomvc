@TC15 @Regression
Feature: TC_15 All other controls are disabled on editing a task

  Scenario: TC_15 All other controls are disabled on editing a task
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    When User double clicks on task label
    Then User verifies that the delete button and the mark checkbox are not available
    And User closes the browser