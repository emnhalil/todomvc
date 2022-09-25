@TC13 @Regression
Feature: TC_13 User can`t see active tasks in completed list

  Scenario: TC_13 User can`t see active tasks in completed list
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User clicks the Completed Link to move to the Completed page
    Then User verifies that the Completed list is empty
    And User closes the browser