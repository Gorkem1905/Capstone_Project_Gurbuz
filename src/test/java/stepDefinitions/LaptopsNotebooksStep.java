package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LaptopsNoteBooksPageObject;
import utilities.Utility;

public class LaptopsNotebooksStep extends Base{

	LaptopsNoteBooksPageObject laptops = new LaptopsNoteBooksPageObject();
	
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	   
	}

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws IOException {
	    laptops.getShowLaptop();
	    Utility.takeScreenshot("click on laptop");
	    logger.info("click on laptop");
	   
	    
	}

	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws IOException {
	laptops.getClickLaptopAll();
	Utility.takeScreenshot("click on showall");
	logger.info("click on showall");
	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() throws IOException {
	    laptops.getClickMac();
	    Utility.takeScreenshot("click on mac");
	    logger.info("click on mac");
	   
	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String itemPrice) throws IOException {
	    laptops.getCartMessage(itemPrice);
	    Utility.takeScreenshot("itemprice");
	    logger.info(itemPrice);
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() throws IOException {
	    laptops.getClickCart();
	    Utility.takeScreenshot("clickcart");
	    logger.info("clickcart");
	    
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws IOException {
	laptops.getClickRemove();
	Utility.takeScreenshot("click on X");
	logger.info("click on X");
	
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String emptyMessage) throws IOException {
	  laptops.getVerifyRemove(emptyMessage); 
	  Utility.takeScreenshot("emptymessage");
	  logger.info("emptymessage");
	}
	
	@And("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String compareButton) throws IOException {
	  laptops.getCompareButton(compareButton);
	  Utility.takeScreenshot("compareButton");
	  logger.info("compareButton");
	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws IOException {
	   laptops.getProductCompare();
	   Utility.takeScreenshot("productCompare");
	   logger.info("productCompare");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
	    laptops.getCompChart();
	    Utility.takeScreenshot("comparisonChart");
	    logger.info("comparisonChart");
	   
	}
	@And("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws IOException {
	    laptops.getHeartSony();
	    Utility.takeScreenshot("sony Heart Icon");
	    logger.info("sony Heart Icon");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String message) throws IOException {
	    laptops.getLoginMessage(message);
	    Utility.takeScreenshot("user Message");
	    logger.info("user message");
	}
	
	@When("User click on {string} item")
	public void user_click_on_item(String string) throws IOException {
	laptops.getClickMacPro();
	Utility.takeScreenshot("click on item");
	logger.info("click on item");
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String proPrice) throws IOException {
	 laptops.getPrice(proPrice);
	 Utility.takeScreenshot("price tag present");
	 logger.info("price tag present");
	}
}
