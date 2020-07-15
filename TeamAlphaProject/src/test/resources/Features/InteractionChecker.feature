
Feature: checking A Drugs interactions 
 # As a QE I want to be able to check drug's interactions.

 # Scenario: Successfully checking Drugs interactions
   # Given Customer in on Drugs Homepage
   # When Customer Clicks on interaction checker link
   #Then Customer enters drug name and clicks Add
    #Then Customer checks for interactions
    
  Scenario Outline: Successfully checking Drugs interactions
    Given Customer in on Drugs Homepage
    When Customer Clicks on interaction checker link
    Then Customer enters "<drugname>" and clicks Add
    Then Customer checks for interactions
   
    Examples: 
      | drugname  |