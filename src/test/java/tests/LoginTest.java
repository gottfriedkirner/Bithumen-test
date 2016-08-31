package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import bConst.Constants;
import steps.LogInSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages(defaultUrl = Constants.BITHUMEN_URL)
	public Pages pages;
	
	@Steps
	LogInSteps logInSteps;
	@Steps
	Constants constants;
	
	
	
	
	@Test
	public void openBithumen(){
		logInSteps.setUpAndLogIn();;
		
	}

}
