@TC20 @Regression
Feature: TC_20 When user adds a new task the text clears from the input box

  Scenario: TC_20 When user adds a new task the text clears from the input box
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    When User types a task and presses Enter
    Then User verifies that the input box is cleared
    And User closes the browser