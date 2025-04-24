 Feature: Verify blog page navigation for each post

@BlogPost01
  Scenario: Ensure each blog post navigates to its respective page
    Given I am on the blog page
    When I navigate to the blog post section
    And I click on each blog post
    Then I should see that all blog posts navigate to their respective pages