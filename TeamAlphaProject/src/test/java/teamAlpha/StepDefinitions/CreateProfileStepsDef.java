package teamAlpha.StepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import teamAlpha.CreateProfileActions.CreateProfileActions;

public class CreateProfileStepsDef {
	
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	

	CreateProfileActions createprofileactions = new CreateProfileActions();

	@Given("^Customer is on Drugs homepage$")
	public void customer_is_on_Drugs_homepage() throws Throwable {
		
		System.out.println("pass");

/*
		ExtentTest createProfile = null; 

		createProfile = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer is on Drugs homepage");

		System.out.println("Title of the homepage is : "+Hooks.driver.getTitle());
		createProfile.pass("Customer is on homepage");
		System.out.println("Hi");
		System.out.println("Hi");*/
	}
	
	
	@When("^Customer clicks on more link$")
	public void customer_clicks_on_more_link() throws Throwable {
		createprofileactions.clickMoreLink();
	}

	@When("^Customer mousehover on More link dropdown$")
	public void customer_mousehover_on_More_link_dropdown() throws Throwable {
		createprofileactions.More();
	}

	@Then("^Customer clicks on My Med List$") 
	public void Customer_clicks_My_Med_List() {
		createprofileactions.MyMedListString();
	}

	@And("^Customer clicks on Add Profile$")
	public void Customer_clicks_Add_Profile() {
		createprofileactions.AddProfile();
	}


	
	
	@When("^Customer enters  \"([^\"]*)\" and Customer enters \"([^\"]*)\" and Customer enters \"([^\"]*)\"$")
	public void customer_enters_and_Customer_enters_and_Customer_enters(String profilename, String contactname,String phonenumber) throws Throwable {
		System.out.println("profilename : " + profilename + "contactname : " + contactname + "phonenumber :" + phonenumber);
		createprofileactions.sendProfilename(profilename);
		createprofileactions.ContactName(contactname);
		createprofileactions.PhoneNumber(phonenumber);
	}


	@Then("Customer clicks on Save")
	public void customer_clicks_on_save() {
		createprofileactions.Save();
		System.out.println("saved");
	}
}



