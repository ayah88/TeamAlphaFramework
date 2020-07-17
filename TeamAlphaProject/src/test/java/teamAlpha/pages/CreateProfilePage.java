package teamAlpha.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateProfilePage {
	
	
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"header\"]/div/div/div/nav/ul/li[6]/a"))
	public WebElement More;
	
	@FindBy(how=How.XPATH,using=("//*[@id=\"header\"]/nav/ul/li[7]/a"))
	public WebElement More1;


	@FindBy(how=How.XPATH,using=("//*[@id=\"header\"]/nav/ul/li[7]/ul/li[1]/a"))
	public WebElement MyMedList;

	@FindBy(how=How.XPATH,using="//div[@class='form-buttons']")
	public WebElement AddProfile;

	@FindBy(how=How.XPATH,using="//input[@name='profile.name']")
	public WebElement ProfileName;

	@FindBy(how=How.XPATH,using="//input[@name='profile.contact_physician_name']")
	public WebElement ContactName;

	@FindBy(how=How.XPATH,using="//input[@name='profile.contact_physician_phone']")
	public WebElement PhoneNumber;

	@FindBy(how=How.XPATH,using="//a[@class='button button-save']")
	public WebElement Save;



	
	
}



