package testPackage;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mainPackage.PageObjectClass;
import mainPackage.ReusableMethodClass;



@Listeners(mainPackage.ListersInterface.class)
public class TestClass  extends ReusableMethodClass{

		public static WebDriver driver;
		public static PageObjectClass pageObjectClass;
		
	@Test
	public static void scenarioTest() throws IOException {
		driver = launchBrowser(readPropertyFile("Browser"));
		pageObjectClass= new PageObjectClass(driver);
		staticWait(2000);
		maximizeWindow();
		getBrowser(readPropertyFile("URL"));
		staticWait(2000);
		Assert.assertEquals(getTitleMethod(),readPropertyFile("Title"));	
		takesScreenShot();
		Assert.assertTrue(isdisplayedMethod(pageObjectClass.getFlipKartLogo())); 
		sendKeys(pageObjectClass.getSearchTextBox(), readPropertyFile("Input"));
		submit(pageObjectClass.getSearchTextBox());
		staticWait(5000);
		click(pageObjectClass.getSearchFirstElement());
		staticWait(5000);
		switchWindowMethod();
		Assert.assertTrue(isdisplayedMethod(pageObjectClass.getAddToCartButton()));
		Assert.assertTrue(isdisplayedMethod(pageObjectClass.getBuyNowButton()));
		sendKeys(pageObjectClass.getDelivaryPinCode(), readPropertyFile("pincode"));
		staticWait(3000);
		click(pageObjectClass.getCheckLink());
		staticWait(3000);
		click(pageObjectClass.getAddToCartButton());
		staticWait(5000);
		Assert.assertTrue(isdisplayedMethod(pageObjectClass.getPlaceOrderButton()));
		staticWait(2000);
		click(pageObjectClass.getPlaceOrderButton());
		staticWait(2000);
		sendKeys(pageObjectClass.getEmailMobileNumber(), readPropertyFile("PhoneNumber"));
		staticWait(2000);
		click(pageObjectClass.getSignUpContinueButton());
		staticWait(7000);
		click(pageObjectClass.getLoginButton());
		staticWait(2000);
		click(pageObjectClass.getNewAddressLink());
		staticWait(4000);
		sendKeys(pageObjectClass.getNameTextBox(), readPropertyFile("Name"));
		staticWait(3000);
		sendKeys(pageObjectClass.getPhoneNumberTextBox(), readPropertyFile("PhoneNumber"));
		staticWait(3000);
		sendKeys(pageObjectClass.getPincodeTextbox(), readPropertyFile("PinCode"));
		staticWait(2000);
		sendKeys(pageObjectClass.getLocalityTextBox(), readPropertyFile("Locality"));
		staticWait(3000);
		sendKeys(pageObjectClass.getAddressTextBox(), readPropertyFile("Address"));
		staticWait(2000);
		click(pageObjectClass.getAddressTypeRadioButton());
		click(pageObjectClass.getSaveDeliveryButton());
		click(pageObjectClass.getContinueButton());
		click(pageObjectClass.getAcceptContinueButton());
		click(pageObjectClass.getCreditAtmRadioButton());
		click(pageObjectClass.getOrderSummaryCancelButton());
	}
	@AfterClass
	public static void quitMethod() {
		browserQuit();
	}

}
	