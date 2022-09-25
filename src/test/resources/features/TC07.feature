@TC07 @Regression
Feature: TC_07 User clears completed task

  Scenario: TC_07 User clears completed task
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User clicks the checkbox of the task
    And User clicks the Completed Link to move to the Completed page
    And User clicks the Clear completed button
    Then User verifies the completed task is removed
    And User closes the browser
