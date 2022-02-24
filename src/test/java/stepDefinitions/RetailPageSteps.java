package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.RetailPageObjects;
import utilities.Utility;

public class RetailPageSteps extends Base {
	
	RetailPageObjects retail = new RetailPageObjects();
	

	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() throws IOException {
	   retail.getAccountButton();
	   Utility.takeScreenshot("clickMyAccount");
	   logger.info("clickMyAccount");
	}

	@And("User click on Login")
	public void user_click_on_login() throws IOException {
		retail.getLoginButton();
		Utility.takeScreenshot("clickLogin");
		logger.info("clickLogin");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) throws IOException {
	  retail.getSignin(userName, password);
	  Utility.takeScreenshot("enterUsernamePass");
	  logger.info("enterUsernamePass");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() throws IOException {
	retail.getClickLogin();
	Utility.takeScreenshot("clickLogin");
	logger.info("clickLogin");
	}

	@And("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
	  retail.getDash();
	  Utility.takeScreenshot("userLoggedin");
	  logger.info("userLoggedin");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws IOException {
	    retail.getRegisterAffiliate();
	    Utility.takeScreenshot("clickRegisterAffiliate");
	    logger.info("clickRegisterAffiliate");
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws IOException, InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		retail.getCompany(data.get(0).get("company"));
		retail.getWebsite(data.get(0).get("website"));
		retail.getTaxId(data.get(0).get("taxID"));
		retail.getPayee(data.get(0).get("payeeName"));
		Utility.takeScreenshot("fillAffiliateForm");
		logger.info("fillAffiliateForm");
		Thread.sleep(2000);
	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() throws IOException {
	   retail.getClickBox();
	   Utility.takeScreenshot("checkAboutUs");
	   logger.info("checkAboutUs");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() throws IOException {
	   retail.getClickContinue();
	   Utility.takeScreenshot("clickContinue");
	   logger.info("clickContinue");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
	retail.getAffiliateMessage();
	Utility.takeScreenshot("seeSuccessMessage");
	}
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws IOException {
	retail.getEditAccount();
	Utility.takeScreenshot("editAffiliate");
	logger.info("editAffiliate");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws IOException {
	retail.getRadioButton();
	Utility.takeScreenshot("clickOnRadio");
	logger.info("clickOnRadio");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws IOException {
		
		List<Map<String, String>> bankInfo = dataTable.asMaps(String.class, String.class);
		retail.getBankName(bankInfo.get(0).get("bankName"));
		retail.getabaNumber(bankInfo.get(0).get("abaNumber"));
		retail.getSwiftCode(bankInfo.get(0).get("swiftCode"));
		retail.getAccountName(bankInfo.get(0).get("accountName"));
		retail.getAccountNumber(bankInfo.get(0).get("accountNumber"));
		Utility.takeScreenshot("fillBankInfo");
		logger.info("fillBankInfo");
	}
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() throws IOException {
		retail.getEditAffAccount();
		Utility.takeScreenshot("editAccountInfo");
		logger.info("editAccountInfo");
	
	}

	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws IOException {
	 List<Map< String, String>> modiInfo = dataTable.asMaps(String.class, String.class);
	 retail.getFirstName1(modiInfo.get(0).get("firstname"));
	 retail.getLastName1(modiInfo.get(0).get("lastName"));
	 retail.getEmail1(modiInfo.get(0).get("email"));
	 retail.getTelephone1(modiInfo.get(0).get("telephone"));
	 Utility.takeScreenshot("modifyInfo");
	 logger.info("modifyInfo");
	 
	 
	 
	}


	
}
