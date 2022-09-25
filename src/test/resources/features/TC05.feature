@TC05 @Regression
Feature: TC_05 User successfully delete a task

  Scenario: TC_05 User successfully delete a task
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    When User clicks on Delete button
    Then User verifies that the task is successfully deleted
    And User closes the browser