package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DesktopsPageObject;
import utilities.Utility;

public class DesktopStep extends Base {

	DesktopsPageObject desktop = new DesktopsPageObject(); 
	
	@Given("User is on Retail page")
	public void user_is_on_retail_page() {
	   
	}
	

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {
	  desktop.getDesktopTab();
	  Utility.takeScreenshot("DesktopScreenShot");
	  logger.info("User Clicks On Desktop");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
	   desktop.getShowlAllDeskops();
	   Utility.takeScreenshot("ShowAllDesktopsSS");
	   logger.info("Click onShow all Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
	desktop.getProducts();	
	Utility.takeScreenshot("SeeItemsPresentSS");
	logger.info("User Sees All Items");
	
	}
	
	@And("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String item) throws IOException {
	    desktop.getAddtoCartDesktops(item);
	    Utility.takeScreenshot("Add to Cart Canon 5D");
	    logger.info("Adding Cannon 5D to cart");
	}

	@And("User select quantity {string}")
	public void user_select_quantity(String quantity) throws IOException {
		desktop.getQuantity(quantity);
		Utility.takeScreenshot("User Selects quaantity");
		logger.info("User Selects quantity");
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() throws IOException {
	 desktop.getAddToCart();
	 Utility.takeScreenshot("Add to Cart");
	 logger.info("Add to cart");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String message) throws IOException {
		desktop.getSuccessMessage(message);
		Utility.takeScreenshot("User sees message");
		logger.info("user sees message");

}
	@And("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String color) throws IOException {
	  desktop.getSelectColor(color);
	  Utility.takeScreenshot("user selects color");
	  logger.info("user selects color");
	  
	}
	
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws IOException {
	  desktop.getCanonIcon();
	  Utility.takeScreenshot("user clicks on Canon 5D");
	  logger.info("user clicks on Canon 5D");
	  
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() throws IOException {
		desktop.getClickReview();
		Utility.takeScreenshot("user clicks on write a review");
		logger.info("user clicks on write review");
	}

	@And("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws IOException {
	  List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	  desktop.getReviewName(data.get(0).get("name"));
	  desktop.getInputReview(data.get(0).get("review"));
	  desktop.getRatinglist(data.get(0).get("rating"));
	  Utility.takeScreenshot("Review section");
	  logger.info("user filled out the review section");
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() throws IOException {
	 desktop.getReviewContinue();
	 Utility.takeScreenshot("user clicks on continue");
	 logger.info("user clicks on continue");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String reviewMessage) throws IOException {
		desktop.getReviewText(reviewMessage);
		Utility.takeScreenshot("user sees review message");
		logger.info("user sees reveiew message");
		

	}
}


  