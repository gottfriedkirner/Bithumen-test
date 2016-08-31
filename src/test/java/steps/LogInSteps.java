package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Test1LogInPage;

public class LogInSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;

	Test1LogInPage logInPage;

	@StepGroup
	public void setUpAndLogIn() {
		openBrowser();
		writeUsername();
		writePassword();
		tapOnLoginButton();
		tapOnCheckBox();
		ClickOnLetoltes();
		//checkIfLoginIsSuccessful();
	}

	@Step
	public void openBrowser() {
		logInPage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void writeUsername() {
		logInPage.enterUsername();

	}

	@Step
	public void writePassword() {
		logInPage.enterPassword();
	}

	@Step
	public void tapOnLoginButton() {
		logInPage.clickCheckBox();
		waitABit(5000);
	}
	
	@Step
	public void tapOnCheckBox() {
		logInPage.tapOnLogin();
		waitABit(5000);
	}
	
	@Step
	public void ClickOnLetoltes() {
		logInPage.tapOnLetoltes();
		waitABit(5000);
	}

	/*@Step
	public void checkIfLoginIsSuccessful() {
		logInPage.checkLoginPageIsLoaded();
	}*/

}
