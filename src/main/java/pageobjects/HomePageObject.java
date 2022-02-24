package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utility;

public class HomePageObject extends Base {

	public HomePageObject() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Tablets")
	private WebElement tabletsTab;

	@FindBy(linkText = "Phones & PDAs")
	private WebElement phoneTab;
	
	@FindBy(linkText = "MP3 Players")
	private WebElement Mp3Tab;
	
	@FindBy(linkText = "Show All MP3 Players")
	private WebElement showAllMp3;
	
	@FindBy(partialLinkText = "test 11")
	private WebElement test11;
	
	@FindBy(partialLinkText = "test 12")
	private WebElement test12;

	@FindBy(partialLinkText = "test 15")
	private WebElement test15;
	
	@FindBy(partialLinkText = "test 16")
	private WebElement test16;
	
	@FindBy(partialLinkText = "test 17")
	private WebElement test17;

	@FindBy(partialLinkText = "test 18")
	private WebElement test18;

	@FindBy(partialLinkText = "test 19")
	private WebElement test19;

	@FindBy(partialLinkText = "test 20")
	private WebElement test20;

	@FindBy(partialLinkText = "test 21")
	private WebElement test21;

	@FindBy(partialLinkText = "test 22")
	private WebElement test22;

	@FindBy(partialLinkText = "test 23")
	private WebElement test23;

	@FindBy(partialLinkText = "test 24")
	private WebElement test24;

	@FindBy(partialLinkText = "test 4")
	private WebElement test4;

	@FindBy(partialLinkText = "test 5")
	private WebElement test5;

	@FindBy(partialLinkText = "test 6")
	private WebElement test6;

	@FindBy(partialLinkText = "test 7")
	private WebElement test7;

	@FindBy(partialLinkText = "test 8")
	private WebElement test8;

	@FindBy(partialLinkText = "test 9")
	private WebElement test9;
	
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopTab;

	@FindBy(partialLinkText = "Macs")
	private WebElement laptopTabMac;

	@FindBy(partialLinkText = "Windows")
	private WebElement laptopTabWindows;

	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement showAllLaptops;
	
	
	@FindBy(linkText = "Show All Desktops")
	private WebElement showlAllDeskops;

	@FindBy(linkText = "Desktops")
	private WebElement desktopsTabs;

	@FindBy(partialLinkText = "PC")
	private WebElement desktopTabPC;
	
	@FindBy(linkText = "Components")
	private WebElement componentsTabs;
	
	@FindBy(partialLinkText = "Mice and Trackballs")
	private WebElement miceAndTrackballs;
	
	@FindBy(partialLinkText = "Monitors")
	private WebElement monitors;
	
	@FindBy(partialLinkText = "Printers")
	private WebElement printers;
	
	@FindBy(partialLinkText = "Scanners")
	private WebElement scanners;
	
	@FindBy(partialLinkText = "Web Cameras")
	private WebElement webCameras;
	
	@FindBy(linkText = "Show All Components")
	private WebElement showAll;
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currency;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement currencyEuro;

	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroSign;

	@FindBy(xpath = "//button[@name='GBP']")
	private WebElement currencyGbp;

	@FindBy(xpath = "//button[@name='USD']")
	private WebElement currencyUsd;

	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement phoneIcon;

	@FindBy(xpath = "//span[contains(text(),'123456789')]")
	private WebElement phoneIconText;

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerOption;

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginOption;

	@FindBy(xpath = "//span[contains(text(),'Wish List')]")
	private WebElement wishList;

	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;

	@FindBy(xpath = "//div[@id='content']//p")
	private WebElement shoppingcartMessage;

	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkout;

	@FindBy(css = "input[name='search']")
	private WebElement searchText;

	@FindBy(id = "cart-total")
	private WebElement cartIcon;

	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement headerTestEnvironment;

	@FindBy(css = "nav[class='navbar']")
	private WebElement navigationBar;

	@FindBy(xpath = "//footer//div[@class='row']//a")
	private WebElement footerLinks;

	@FindBy(linkText = "About Us")
	private WebElement aboutUs;

	@FindBy(linkText = "Delivery Information")
	private WebElement deliveryInfo;

	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicy;

	@FindBy(linkText = "Terms & Conditions")
	private WebElement termsCondition;

	@FindBy(linkText = "Contact Us")
	private WebElement contactUs;

	@FindBy(linkText = "Returns")
	private WebElement returns;

	@FindBy(linkText = "Site Map")
	private WebElement siteMap;

	@FindBy(linkText = "Brands")
	private WebElement brands;

	@FindBy(linkText = "Gift Certificates")
	private WebElement giftCerticate;

	@FindBy(linkText = "Affiliate")
	private WebElement affiliate;

	@FindBy(linkText = "Specials")
	private WebElement specials;

	@FindBy(linkText = "My Account")
	private WebElement footerMyAccount;

	@FindBy(linkText = "Order History")
	private WebElement orderHistory;

	@FindBy(linkText = "Wish List")
	private WebElement footerWishList;

	@FindBy(linkText = "Newsletter")
	private WebElement newsletter;

	@FindBy(xpath = "//h3[contains(text(),'Featured')]")
	private WebElement homeFeatured;
	
	
	public void getClickCurrency() {
		currency.click();
	}
	public void getChooseEuro() {
		currencyEuro.click();
	}
	public void getAffirmEuro() {
		String expectedSign = "€";
		String actually = euroSign.getText();
		Assert.assertEquals(expectedSign, actually);
	}
	public void getClickOnCArt1() {
		shoppingCart.click();
	}
	public void getSuccessMessage(String string) {
		Assert.assertEquals(string, shoppingcartMessage.getText());
	}
}
		
	
	