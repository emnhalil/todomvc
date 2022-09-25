@TC03 @Regression
Feature: TC_03 User verifies the text in the listed task is the same as the one entered

  Scenario: TC_03 User verifies the text in the listed task is the same as the one entered
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    When User types a task and presses Enter
    Then User verifies that the text of the added task is the same as the one entered
    And User closes the browser