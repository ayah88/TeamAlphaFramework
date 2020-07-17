package teamAlpha.CreateProfileActions;

import org.openqa.selenium.support.PageFactory;

import teamAlpha.StepDefinitions.Hooks;
import teamAlpha.pages.InteractionCheckerPage;

public class InteractionCheckerAction {



	InteractionCheckerPage interactioncheckerpage;

	public InteractionCheckerAction(){
		this.interactioncheckerpage = new InteractionCheckerPage();
		PageFactory.initElements(Hooks.driver, interactioncheckerpage);
	}



	public void clickInteractionChecker() {
		interactioncheckerpage.interactionsCheckerLink.click();

	}

	public void DrugName(String drug) {

		interactioncheckerpage.DrugNameField.sendKeys(drug);        	
	}
	public void ClickAddButton() {

		interactioncheckerpage.AddButton.click();        	
	}




	public void ChecksForInteractions() {
		interactioncheckerpage.CheckForInteractionsBtn.click();
	}



}


