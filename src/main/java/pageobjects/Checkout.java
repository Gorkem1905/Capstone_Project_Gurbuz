package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;

public class Checkout extends Base {

	public Checkout() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//p[@class='text-right']/a[1]")
	private WebElement viewCart;
	@FindBy(xpath = "//p[@class='text-right']/a[2]")
	private WebElement checkout;

	@FindBy(css = "input[value = 'Continue']")
	private WebElement contunie;

	@FindBy(xpath = "//input[@id='button-shipping-address']")
	private WebElement deliverydetailsContunie;

	@FindBy(xpath = "//textarea[@name='comment']")
	private WebElement deliveryComment;

	@FindBy(xpath = "//input[@id='button-shipping-method']")
	private WebElement shippingMethodContunie;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath = "button-payment-method")
	private WebElement paymnentContunie;

	@FindBy(xpath = "//input[@value='Confirm Order']")
	private WebElement confirmOrder;

	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement orderpacedMessage;

	@FindBy(linkText = "Shopping Cart")
	private WebElement clickShoppingCart;

	@FindBy(xpath = "//div[@id='accordion']/div[1]//h4/a")
	private WebElement clickCouponCode;

	@FindBy(css = "input[name='coupon']")
	private WebElement enterCouponCode;

	@FindBy(css = "input[value='Apply Coupon']")
	private WebElement clickApplyCoupon;

	@FindBy (xpath ="//div[@class='alert alert-danger alert-dismissible']/text()")
	private WebElement couponWarningMessage;
	
	@FindBy(xpath = "//div[@id='accordion']/div[2]//h4/a")
	private WebElement clickEstimateShipping;

	@FindBy(css = "#input-country")
	private WebElement selectCountry;

	@FindBy(css = "#input-zone")
	private WebElement selectRegion;

	@FindBy(css = "#input-postcode")
	private WebElement enterPostcode;

	@FindBy(css = "#button-quote")
	private WebElement clickButtuonQuote;

	@FindBy(xpath = "//input[@name= 'shipping_method']")
	private WebElement clickShippingMethod;

	@FindBy(xpath = "//input[@id= 'button-shipping']")
	private WebElement clickApplyShipping;

	@FindBy(xpath = "//div[@id='accordion']/div[3]//h4/a")
	private WebElement clickGiftCerticate;

	@FindBy(xpath = "//input[@name ='voucher']")
	private WebElement sendGiftCerticateCode;

	@FindBy(xpath = "//input[@id ='button-voucher']")
	private WebElement clickApplyCertificate;

	@FindBy(xpath = "//a[contains(text(),'Checkout')]")
	private WebElement clickCheckout;

}