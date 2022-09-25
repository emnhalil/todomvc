@TC02 @Regression
Feature: TC_02 User successfully adds a task

  Scenario: TC_02 User successfully adds a task
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    When User types a task and presses Enter
    Then User verifies that the task is successfully added to the active task list
    And User closes the browser