package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObject;
import utilities.Utility;

public class HomePageStep extends Base {

	HomePageObject homePage = new HomePageObject();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() throws IOException {
	  homePage.getClickCurrency();
	 Utility.takeScreenshot("clickCurrency");
	logger.info("clickCurrency");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws IOException {
	   homePage.getChooseEuro();
	   Utility.takeScreenshot("chooseEuro");
	   logger.info("chooseEuro");
	   
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
	homePage.getAffirmEuro();
	Utility.takeScreenshot("valueChangetoEuro");
	logger.info("valueChangetoEuro");
		
	
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws IOException {
	  homePage.getClickOnCArt1();
	  Utility.takeScreenshot("clickOnOpenCart");
	  logger.info("clickOnOpenCart");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) throws IOException {
		homePage.getSuccessMessage(string);
		Utility.takeScreenshot("messageDisplay");
		logger.info("messageDisplay");
	}

}
