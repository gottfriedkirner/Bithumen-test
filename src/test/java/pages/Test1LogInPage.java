package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class Test1LogInPage extends PageObject {

	@FindBy(xpath = ".//*[@id='loginform_username']")
	private WebElementFacade usernameField;

	@FindBy(xpath = ".//*[@id='loginform_password']")
	private WebElementFacade passwordField;

	@FindBy(xpath = ".//*[@id='loginform_submit']")
	private WebElementFacade loginButton;
	
	@FindBy(xpath = ".//input[contains(@name,'megjegyez')]")
	private WebElementFacade checkBox;
	
	@FindBy(xpath = "//*[@class='navigation'][2]")
	private WebElementFacade letoltesButton;
	

	
	public void enterUsername() {
		element(usernameField).waitUntilVisible();
		usernameField.click();
		usernameField.sendKeys("Hulk440257");
	}

	public void enterPassword() {
		element(passwordField).waitUntilVisible();
		passwordField.click();
		passwordField.sendKeys("BP26AKDUupGu");
	}
	
	public void clickCheckBox() {
		element(checkBox).waitUntilVisible();
		checkBox.click();
		
	}

	public void tapOnLogin() {
		element(loginButton).waitUntilVisible();
		loginButton.click();
	}
	
	public void tapOnLetoltes() {
		element(letoltesButton).waitUntilVisible();
		letoltesButton.click();
	}

	/*public void checkLoginPageIsLoaded() {
		Assert.assertTrue("Login page should have loaded but it has not!", WileyLogo.isDisplayed());
	}*/
}
