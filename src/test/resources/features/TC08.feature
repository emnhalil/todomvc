@TC08 @Regression
Feature: TC_08 User verifies that the completed tasks are moved to the complete page

  Scenario: TC_08 User verifies that the completed tasks are moved to the complete page
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User clicks the checkbox of the task
    And User clicks the Completed Link to move to the Completed page
    Then User should be able to see the task on the list
    And User closes the browser