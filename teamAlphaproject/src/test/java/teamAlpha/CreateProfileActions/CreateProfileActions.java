package teamAlpha.CreateProfileActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import teamAlpha.StepDefinitions.Hooks;
import teamAlpha.pages.CreateProfilePage;

public class CreateProfileActions {
	
	CreateProfilePage createprofilepage;
	//WebElement webelement;

	Actions action = new Actions(Hooks.driver);

	public CreateProfileActions() {


		this.createprofilepage = new CreateProfilePage();

		PageFactory.initElements(Hooks.driver, createprofilepage);
	}
	public void clickMoreLink( ) {
		createprofilepage.More.click();
		
	}

	public void More() throws InterruptedException {
		WebElement more2 = createprofilepage.More;
		action.moveToElement(more2);
		Thread.sleep(2000);
	}

	public void MyMedListString() {
		createprofilepage.MyMedList.click();
	}
	public void AddProfile() {
		createprofilepage.AddProfile.click();
	}

	public void sendProfilename(String name) {

		createprofilepage.ProfileName.sendKeys("aalko");

	}

	public void ContactName(String contactN) {

		createprofilepage.ContactName.sendKeys("Ayah");
	}

	public void PhoneNumber(String number) {

		createprofilepage.PhoneNumber.sendKeys("9737585566");
	}
	public void Save() {
		createprofilepage.Save.click();
	}
	
	

	}

		
