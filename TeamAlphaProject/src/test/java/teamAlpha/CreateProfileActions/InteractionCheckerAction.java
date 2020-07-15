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
		interactioncheckerpage.interactionsChecker.click();

	}

	public void DrugName(String drug) {

		interactioncheckerpage.ClickAdd.sendKeys("Tylenol");        	
	}





	public void ChecksForInteractions() {
		interactioncheckerpage.interactionsChecker.click();
	}



}


