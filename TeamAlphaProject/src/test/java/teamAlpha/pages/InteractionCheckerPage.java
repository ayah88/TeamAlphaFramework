package teamAlpha.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InteractionCheckerPage {
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Interactions Checker')]")
	public WebElement clickInteractionChecker;

	@FindBy(how=How.XPATH,using="//*[@id=\"livesearch-interaction-basic\"]")
	public WebElement DrugNameField ;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"drug-interactions-search\"]/div/input[2]")
	public WebElement AddButton ;


	@FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div/div/div/nav/ul/li[3]/a") /*absolute xpath structure*/
    public WebElement interactionsCheckerLink ;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"livesearch-interaction\"]") /*absolute xpath structure*/
    public WebElement CheckForInteractionsBtn ;

}
