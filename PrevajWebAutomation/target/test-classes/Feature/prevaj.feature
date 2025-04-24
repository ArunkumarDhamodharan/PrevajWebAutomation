Feature: Home Page Functionality

  # Header Section

@HeaderTC01	
  Scenario: Verify Home menu navigation
    Given I am on the Home page
    When I click on the Home menu
    Then Home page should reload
@HeaderTC02
  Scenario: Verify Site Logo navigation
    Given I am on the Home page
    When I click on the Site Logo
    Then the Home page should reload
@HeaderTC03
  Scenario: Verify all header links redirection
    Given I am on the Home page
    When I click on each header link
    Then I should be redirected to their respective pages
@HeaderTC04
  Scenario: Verify the Book Meeting button functionality
    Given I am on the Home page
    When I click on the Book Meeting button
    Then I should see the popup window
@HeaderTC05
  Scenario: Verify the Book Meeting popup close icon
    Given the Book Meeting popup is displayed
    When I click on the close icon
    Then the popup window should close and the Home page should be visible
@HeaderTC06
  Scenario: Verify the Call Us Now button functionality
    Given I am on the Home page
    When I click on the Call Us Now button
    Then I should see a call popup alert
    
    

  # Footer Section
  
 @Footer01
  Scenario: Verify social media links in footer
    Given I am on the Home page
    When I click on each social media link in the footer
    Then I should be redirected to the respective social media pages
 @Footer02
  Scenario: Verify the Newsletter section visibility
    Given I am on the Home page
    Then the Newsletter section should be displayed in the footer area
 @Footer03
  Scenario: Verify subscription functionality in the Newsletter section
    Given I am on the Home page
    When I enter a valid email ID in the Newsletter section and click on the Subscribe button
    Then I should see the confirmation message
 @Footer04
  Scenario: Verify the Privacy Policy link
    Given I am on the Home page
    When I click on the Privacy Policy link
    Then I should see the Privacy Policy page
    
    
    
    
 # Get a Consultation

  @GetAConsult01
  Scenario: Successful form submission
    When I fill in all the fields with valid data
    And I click on  Submit button
    Then I should see a success message confirming the form submission

  @GetAConsult02
  Scenario: Form submission with empty fields
    When I leave all fields blank
    And I click on the Submit button
    Then I should see error messages for all required fields

  @GetAConsult03
  Scenario: Form submission with invalid email
    When I fill in all fields with valid data except an invalid email
    And I click  the Submit button
    Then I should see an error message for invalid email format

  @GetAConsult04
  Scenario: Form submission with invalid phone number
    When I fill in all fields with valid data except an invalid phone number
    And I click Submit button
    Then I should see an error message for invalid phone number format
    
    
    
    
  # Page Redirection Section
  
  @PageRedirection01
  Scenario: Verify the Book a Meeting button redirection
    Given I am on the Home page
    When I click on the Book a Meeting button
    Then I should see the popup window
    
  @PageRedirection02
  Scenario: Verify the Who We Are section text link redirection
    Given I am on the Home page
    When I click on the text links in the Who We Are section
    Then I should  redirected to the respective pages
    
  @PageRedirection03
  Scenario: Verify the Why Prevaj section YouTube video
    Given I am on the Home page
    When I click on the Why Prevaj section YouTube video
    Then the YouTube video should play
    
  @PageRedirection04
  Scenario: Verify redirection from Our Advanced Level End To End Services section
    Given I am on the Home page
    When I click on the links in the Our Advanced Level End To End Services section
    Then I should be redirected  the respective pages
    
  @PageRedirection05
  Scenario: Verify Technologies We Work With section redirection
    Given I am on the Home page
    When I click on the links in the Technologies We Work With section
    Then I should be redirected to  respective pages

  @PageRedirection06
  Scenario: Verify Industries section page redirection
    Given I am on the Home page
    When I click on the links in the Industries section
    Then  should be redirected to the respective pages

  @PageRedirection07
  Scenario: Verify the Let’s Discuss Your Project section contact us button
    Given I am on the Home page
    When I click on the contact us button in the Let’s Discuss Your Project section
    Then I should be redirected to  Lets Talk form page

 @PageRedirection08
  Scenario: Verify the Our Clients section
    Given I am on the Home page
    Then I should see the logos of all clients in the Our Clients section

   @PageRedirection09
  Scenario: Verify the What do our clients say about us? section
    Given I am on the Home page
    Then I should see all ratings and reviews in the What do our clients say about us? section

  @PageRedirection10
  Scenario: Verify the Our Core Members section linked page redirection
    Given I am on the Home page
    When I click on the links in the Our Core Members section
    Then I should be redirected to the respective pages

 @PageRedirection11
  Scenario: Verify the Get a Consultation button in Let’s Discuss Your Project section
    Given I am on the Home page
    When I click on the Get a Consultation button in the Let’s Discuss Your Project section
    Then I should be redirected to the Lets Talk form page
    
 #Lets Talk form 
 
 @LetsTalk01
 Scenario: Verify all fields are present
    When I check the presence of all required and optional fields
    Then all fields should be visible on the form
    
 @LetsTalk02
  Scenario: Submit the form with valid data in required fields
    When I fill all required fields with valid data
    And I click the Submit button
    Then the form should be submitted to successfully
    
 @LetsTalk03
  Scenario: Submit the form with all fields filled, including optional fields
    When I fill all fields, including optional fields, with valid data
    And I click on the Submit button
    Then the form should  submitted successfully
    
 @LetsTalk04
  Scenario: Submit the form with invalid data in mandatory fields
    When I fill mandatory fields with invalid data
    And I click  Submit button
    Then I should see appropriate error messages for invalid data
    
 @LetsTalk05
  Scenario: Submit the form with all required fields left blank
    When I leave all required fields blank
    And I click a Submit button
    Then I should see appropriate error messages for missing required fields
    
 @LetsTalk06
  Scenario: Submit the form with valid data except for an invalid email
    When I fill all fields with valid data except for an invalid email
    And I click to Submit button
    Then I should see an error message for the invalid email field
    
    
 
 #Social media rediretion 
 
 @SocialMedia01
 Scenario: Verfy the contact section social media icons pgae redirection 
 
 Given i click the social media icon one by one 
 When each and every social media icon have go respective page 
 Then I should see the all page redirection have successfull
 
 
 #Blog Section 
 
 @BlogSection01
  Scenario: Search with numbers
    Given I am on the blog page
    When I enter numbers in the search field and click on the search icon
    Then I should see Sorry, no results  found displayed

@BlogSection02
  Scenario: Search with special characters
    Given I am on the blog page
    When I enter special characters in the search field and click on the search icon
    Then I should see Sorry, no results were found displayed

@BlogSection03
  Scenario: Search without input
    Given I am on the blog page
    When I click on the search icon without giving any input
    Then I should see the page reload

@BlogSection04
  Scenario: Search with empty spaces
    Given I am on the blog page
    When I enter empty spaces in the search field and click on enter
    Then I should see  page reload

@BlogSection05
  Scenario: Search with alphabets
    Given I am on the blog page
    When I enter alphabets in the search field and click on the search icon
    Then I should get related results
    
    
 #Categries Section
 	
 @Categries01
 Scenario: Verify category filter functionality
    When I click on the category any categries 
    Then I should see blog related results
    
    

    
    
    