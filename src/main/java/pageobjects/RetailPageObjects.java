package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.datatable.DataTable;



public class RetailPageObjects extends Base {

public RetailPageObjects () {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement loginEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement loginPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement submit;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement dashboard;

	@FindBy(xpath = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	private WebElement forgetPassword;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "//div[@class='form-group']/div/label[1]/input")
	private WebElement subscribe;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(linkText = "Edit your account information")
	private WebElement editAccount;

	@FindBy(linkText = "Change your password")
	private WebElement changePassword;

	@FindBy(linkText = "Modify your address book entries")
	private WebElement modifyAddress;

	@FindBy(linkText = "Modify your wish list")
	private WebElement modifyWishList;

	@FindBy(linkText = "View your order history")
	private WebElement orderHistory;

	@FindBy(linkText = "Downloads")
	private WebElement downloads;

	@FindBy(linkText = "Your Reward Points")
	private WebElement rewardPoint;

	@FindBy(linkText = "View your return requests")
	private WebElement returnRequest;

	@FindBy(linkText = "Your Transactions")
	private WebElement transactions;

	@FindBy(linkText = "Recurring payments")
	private WebElement recurringPayments;

	@FindBy(linkText = "Register for an affiliate account")
	private WebElement registerAffiliate;

	@FindBy(linkText = "Edit your affiliate information")
	private WebElement editAffiliate;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteField;

	@FindBy(css = "#input-tax")
	private WebElement taxIDField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentCheque;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paymentPaypal;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement paymentBank;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement affiliateContinue;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageBox;

	@FindBy(linkText = "Subscribe / unsubscribe to newsletter")
	private WebElement subscribeNewsletter;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumberField;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameField;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberField;

	@FindBy(css = "#input-firstname")
	private WebElement editFirstName;

	@FindBy(css = "#input-lastname")
	private WebElement editLastName;

	@FindBy(css = "#input-email")
	private WebElement editEmail;

	@FindBy(css = "#input-telephone")
	private WebElement editTelephone;


public void getAccountButton() {
	
	myAccountButton.click();
}

public void getLoginButton() {
	loginButton.click();
}
public void getSignin(String userName, String password) {
	loginEmail.sendKeys(userName);
	loginPassword.sendKeys(password);
}
public void getClickLogin() {
	submit.click();
}

public void getDash() {
	Assert.assertTrue(dashboard.isDisplayed());
	
}

public void getRegisterAffiliate() {
	registerAffiliate.click();
}
public void getCompany(String company) {
	companyName.sendKeys(company);
}
public void getWebsite(String website) {
	websiteField.sendKeys(website);
}
public void getTaxId(String taxID) {
	taxIDField.sendKeys(taxID);
}
public void getPayment(String paymentMethod) {
	while (paymentMethod.equals("Cheque")) {
		if (paymentCheque.isSelected())
			{
			break;
			}else {
				paymentCheque.click();
			}
	}
}
	
public void getPayee(String payeeName) {
	chequePayeeName.sendKeys(payeeName);
}

public void getClickBox() {
	aboutCheckBox.click();
}
public void getClickContinue() {
	affiliateContinue.click();
}
public void getAffiliateMessage() {
	Assert.assertTrue(messageBox.isDisplayed());
}

public void getEditAccount() {
	editAffiliate.click();
}

public void getRadioButton( ) {
	paymentBank.click();
}
public void getBankName(String bankName) {
	bankNameField.sendKeys(bankName);
}
public void getabaNumber(String abaNumber) {
	abaNumberField.sendKeys(abaNumber);
}
public void getSwiftCode(String swiftCode) {
	swiftCodeField.sendKeys(swiftCode);
}
public void getAccountName(String accountName) {
	accountNameField.sendKeys(accountName);
}
public void getAccountNumber(String accountNumber) {
	accountNumberField.sendKeys(accountNumber);
}
public void getEditAffAccount() {
	editAccount.click();
}
public void getFirstName1(String firstname) {
	editFirstName.clear();
	editFirstName.sendKeys(firstname);
}
public void getLastName1(String lastName ) {
	editLastName.clear();
	editLastName.sendKeys(lastName);
}
public void getEmail1(String email) {
	editEmail.clear();
	editEmail.sendKeys(email);
}
public void getTelephone1(String telephone) {
	editTelephone.clear();
	editTelephone.sendKeys(telephone);
}
}






