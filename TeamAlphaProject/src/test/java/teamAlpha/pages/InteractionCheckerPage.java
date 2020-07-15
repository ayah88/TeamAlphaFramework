package teamAlpha.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InteractionCheckerPage {
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Interactions Checker')]")
	public WebElement clickInteractionChecker;

	@FindBy(how=How.XPATH,using="//input@[value='Add']")
	public WebElement ClickAdd ;
	

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Check for Interactions')]")
    public WebElement interactionsChecker ;
	
	@FindBy(how=How.XPATH,using="//*[@id=livesearch-interaction]")
    public WebElement DrugName ;
	

}
