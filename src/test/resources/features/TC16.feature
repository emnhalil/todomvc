@TC16 @Regression
Feature: TC_16 Canceling task edit

  Scenario: TC_16 Canceling task edit
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    And User types a task and presses Enter
    And User makes a change on the text
    And User presses esc button to cancel the change
    Then User verifies that no change is made
    And User closes the browser