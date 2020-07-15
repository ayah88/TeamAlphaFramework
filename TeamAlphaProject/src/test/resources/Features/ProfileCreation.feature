#Feature:  Creating a Medicine Profile 
  #As a QE I want to create a  medicine profile on Drugs


  #Scenario: Successful creating Medicine Profile
    #
    #Given Customer is on Drugs homepage
    #When Customer clicks on More link dropdown
    #Then Customer clicks on My Med List
    #And  Customer clicks on Add Profile
    #When Customer enters profilename and customer enters contactname and customer enters phonenumber
    #Then Customer clicks on Save  
    
   #
   
   
 Scenario Outline: Successful creating Medicine Profile
 Given Customer is on Drugs homepage
 When Customer clicks on more link
 When Customer mousehover on More link dropdown
 Then Customer clicks on My Med List 
 And  Customer clicks on Add Profile 
 When Customer enters  "<profilename>" and Customer enters "<contactname>" and Customer enters "<phonenumber>"
 Then Customer clicks on Save 
 Examples:
   |profilename|contactname|phonenumber|
   |aalko   |Ayah  |   9737585566|
   