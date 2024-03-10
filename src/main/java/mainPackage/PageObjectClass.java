package mainPackage;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {

		
		public static WebDriver driver;
		
		public PageObjectClass(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);			
		}
		
		@FindBy(xpath="//img[@title='Flipkart']")
		private WebElement FlipKartLogo;

		public WebElement getFlipKartLogo() {
			return FlipKartLogo;
		}
		
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchTextBox;

		public WebElement getSearchTextBox() {
			return searchTextBox;
		}
		@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
		private WebElement searchFirstElement;

		public WebElement getSearchFirstElement() {
			return searchFirstElement;
		}
		@FindBy(xpath="//span[@class='B_NuCI']")
		private WebElement productDetailText;
		
		
		public WebElement getProductDetailText() {
			return productDetailText;
		}
		
		@FindBy(xpath="//input[@id='pincodeInputId']")
		private WebElement delivaryPinCode;

		public WebElement getDelivaryPinCode() {
			return delivaryPinCode;
		}
		@FindBy(xpath="//span[@class='_2P_LDn']")
		private WebElement checkLink;

		public WebElement getCheckLink() {
			return checkLink;
		}

		@FindBy(xpath="//button[text()='Add to cart']")
		private WebElement addToCartButton;

		public WebElement getAddToCartButton() {
			return addToCartButton;
		} 
		@FindBy(xpath="//button[text()='Buy Now']")
		private WebElement buyNowButton;

		public WebElement getBuyNowButton() {
			return buyNowButton;
		}
		@FindBy(xpath="//a[contains(@class,'2Kn22P')]")
		private WebElement cartProductElement;

		public WebElement getCartProductElement() {
			return cartProductElement;
		}
		
		@FindBy(xpath="//span[text()='Place Order']/parent::button")
		private WebElement placeOrderButton;

		public WebElement getPlaceOrderButton() {
			return placeOrderButton;
		}
		@FindBy(xpath="//input[contains(@class,'17N0em')]")
		private WebElement emailMobileNumber;
		
		public WebElement getEmailMobileNumber() {
			return emailMobileNumber;
		}
		@FindBy(xpath="//span[text()='CONTINUE']/parent::button")
		private WebElement signUpContinueButton;


		public WebElement getSignUpContinueButton() {
			return signUpContinueButton;
		}
		
		@FindBy(xpath="//span[text()='Login']/parent::button")
		private WebElement loginButton;
		
		public WebElement getLoginButton() {
			return loginButton;
		}

		@FindBy(xpath="//*[text()='Add a new address']")
		private WebElement addNewAddressLink;

		public WebElement getNewAddressLink() {
			return addNewAddressLink;
		}
		@FindBy(xpath="//input[@name='name']")
		private WebElement nameTextBox;

		public WebElement getNameTextBox() {
			return nameTextBox;
		}
		@FindBy(xpath="//input[@name='phone']")
		private WebElement phoneNumberTextBox;

		public WebElement getPhoneNumberTextBox() {
			return phoneNumberTextBox;
		}
		@FindBy(xpath="//input[@name='pincode']")
		private WebElement pincodeTextbox;

		public WebElement getPincodeTextbox() {
			return pincodeTextbox;
		}
		@FindBy(xpath="//input[@name='addressLine2']")
		private WebElement localityTextBox;

		public WebElement getLocalityTextBox() {
			return localityTextBox;
		}
		@FindBy(xpath="//textarea[@name='addressLine1']")
		private WebElement addressTextBox;

		public WebElement getAddressTextBox() {
			return addressTextBox;
		}
		@FindBy(xpath="//input[@id='HOME']")
		private WebElement addressTypeRadioButton;

		public WebElement getAddressTypeRadioButton() {
			return addressTypeRadioButton;
		}
		@FindBy(xpath="//button[text()='Save and Deliver Here']")
		private WebElement saveDeliveryButton;

		public WebElement getSaveDeliveryButton() {
			return saveDeliveryButton;
		}
		@FindBy(xpath="//button[text()='CONTINUE']")
		private WebElement continueButton;

		public WebElement getContinueButton() {
			return continueButton;
		}
		
		@FindBy(xpath="//button[text()='Accept & Continue']")
		private WebElement acceptContinueButton;

		public WebElement getAcceptContinueButton() {
			return acceptContinueButton;
		}
		@FindBy(xpath="//div[contains(@class,'_3sKosA')]//label")
		private List<WebElement> paymentOption;

		public List<WebElement> getPaymentOption() {
			return paymentOption;
		}
		@FindBy(xpath="//input[@id='CREDIT']")
		private WebElement creditAtmRadioButton;

		public WebElement getCreditAtmRadioButton() {
			return creditAtmRadioButton;
		}
		@FindBy(xpath="//div[text()='Order Summary']/parent::div/following-sibling::button")
		private WebElement orderSummaryCancelButton;

		public WebElement getOrderSummaryCancelButton() {
			return orderSummaryCancelButton;
		}
	


}
