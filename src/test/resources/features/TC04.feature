@TC04 @Regression
Feature: TC_04 User successfully edit a task

  Scenario: TC_04 User successfully edit a task
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    When User double clicks on task label
    And User edits the task
    Then User verifies that the task is edited
    And User closes the browser