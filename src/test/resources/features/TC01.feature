@TC01 @Regression
Feature: TC_01 User successfully lands to the webpage

  Scenario: TC_01 User successfully lands to the webpage
    Given User starts the Chrome Browser
    And User goes to the webpage "https://todomvc.com/examples/vue/"
    Then User verifies successfully landing to the page
    And User closes the browser