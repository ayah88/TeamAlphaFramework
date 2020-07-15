package teamAlpha.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import teamAlpha.CreateProfileActions.InteractionCheckerAction;

public class InteractionCheckerStepDef {


	InteractionCheckerAction interactioncheckeraction = new InteractionCheckerAction();


	@Given("^Customer in on Drugs Homepage$")
	public void customer_in_on_Drugs_Homepage() throws Throwable {

		System.out.println("pass");
	}

	@When("^Customer Clicks on interaction checker link$")
	public void customer_Clicks_on_interaction_checker_link() throws Throwable {
		interactioncheckeraction.clickInteractionChecker();
	}

	@Then("^Customer enters drug name and clicks Add$")
	public void customer_enters_drug_name_and_clicks_Add(String drug) throws Throwable {
		interactioncheckeraction.DrugName(drug);
	}

	@Then("^Customer checks for interactions$")
	public void customer_checks_for_interactions() throws Throwable {
		interactioncheckeraction.ChecksForInteractions();
	}

}

