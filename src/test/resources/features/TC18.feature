@TC18 @Regression
Feature: TC_18 User verifies Clear Complete button is not enabled when the list is empty

  Scenario: TC_18 User verifies Clear Complete button is not enabled when the list is empty
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    Then User verifies Clear Complete button is not visible
    And User closes the browser
