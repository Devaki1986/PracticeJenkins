Feature: Test login

 #Background: webdriver setup
	# Given user setup driver 
	
    @cucumber
    Scenario: login page gmail
    Given User is in home page
    When User enter the details
    Then User validate the details
    
 #@api
    Scenario: API Get
    Given User send the Get Request
    When user get the response
    Then user validate the response for get
    
   
    Scenario: API post
    Given User send the post Request
    When user get the response
    Then user validate the response for post
    
 # @Background
# Scenario: User generates token for Authorisation

#Given I am an authorized user


@api
Scenario: the Authorized user can Add and Remove a book.

Given A list of books are available
When I add a book to my reading list
#Then the book is added
#When I remove a book from my reading list
#Then the book is removed

#@cucumber
 # Scenario Outline: login page
  #  Given User already in login "<page>"
   # When User enter the details
   # Then User validate the details
   # Examples:
   # |page|
    #|https://www.sololearn.com/en/compiler-playground/java|
    #|https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-remote-driver/4.16.1|
    #|https://stackoverflow.com/questions/74533830/io-cucumber-java-pendingexception-todo-implement-me|  
    
    
    
