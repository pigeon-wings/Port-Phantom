package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BillingDetails {
	public static AndroidDriver driver;
	public static WebDriverWait wait;
	private static WebElement spinnerQuantity;
	public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {

//		 Actions action = new Actions(driver);
//		 action.moveToElement((WebElement) By.xpath(SelectCountry_xpath));
//		 action.build().perform();
		billing_filling();
		 
	}
	
	
	
	
	
	@Test
	 public static void billing_filling() throws InterruptedException {
	
	//variables of xpath for billing address fill up
	String FirstName_id="com.nopstation.nopcommerce.nopstationcart:id/etFirstName";
	String LastName_id="com.nopstation.nopcommerce.nopstationcart:id/etLastName";
	String Email_xpath="//android.widget.EditText[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/etEmail']";
	String SelectCountry_xpath="//android.widget.Spinner[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/countrySpinner']";

	String SelectState_id="com.nopstation.nopcommerce.nopstationcart:id/stateSpinner";
	String Company_id="com.nopstation.nopcommerce.nopstationcart:id/etCompanyName";
	String City_xpath="//android.widget.EditText[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/etCity']";
	String StreetAddess_xpath="//android.widget.EditText[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress']";
	String zpCode_id="com.nopstation.nopcommerce.nopstationcart:id/etZipCode";
	String Phone_xpath="//android.widget.EditText[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/etPhone']";
	String Fax_id="com.nopstation.nopcommerce.nopstationcart:id/etFax";
	String ContinueButton_1_xpath="//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnContinue']";
	//Variables for input
	String f_name_input="Hazi";
	String l_name_input="Mohshin";
	String email_input="bs"+"@gmail.com";
	String country_input="United States of America";
	String state_input=	"Maryland";	
	String company_input="bs";
	String city_input="Dhaka";
	String street_input="Mirpur, House no-5";
	String zip_input="1216";
	String phone_input="01314273431";
	String fax_input="fax123";
	
	
	
	
	
	
	//billing data fill up
	appium_scenario_two.test_part2();
	wait=appium_scenario_two.wait;
	driver=appium_scenario_two.drivers;
	 WebElement fName=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(FirstName_id)));
	// fName.click();
	 //fName.clear();
	 fName.sendKeys(f_name_input);
	 WebElement lName=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LastName_id)));
	 lName.sendKeys(l_name_input);
	 WebElement email_pattern=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Email_xpath)));
	 email_pattern.sendKeys(email_input);
	 
	 
	 
		WebElement country_click=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectCountry_xpath)));
		country_click.click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+country_input+"));"));
		WebElement cl=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//android.widget.TextView[@resource-id='android:id/text1' and @text='"+country_input+"']")));
		cl.click();

	 
		WebElement state_click=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(SelectState_id)));
		state_click.click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+state_input+"\"));"));
		
		WebElement sl=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//android.widget.TextView[@resource-id='android:id/text1' and @text='"+state_input+"']")));
		sl.click();
	
		boolean search_content=true;
		while(search_content){
		try {

			 WebElement company_name =  driver.findElement(By.id(Company_id));
 		search_content=false;
 		 company_name.sendKeys(company_input);
		}
		catch(Exception e){
			TouchAction action = new TouchAction(driver);
			 Dimension size = driver.manage().window().getSize();
		    int star_x_ver = (int) (size.height * 0.70);
            int end_x_ver = (int) (size.height * 0.30);
            int anchor = (int) (size.width * 0.5);
           
			 action.press(PointOption.point(anchor, star_x_ver))
	            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
	            .moveTo(PointOption.point(anchor, end_x_ver))
	            .release()
	            .perform();
         	 Thread.sleep(500);
 		
		}
		}
		

		 WebElement city_name =  driver.findElement(By.xpath(City_xpath));
		 city_name.sendKeys(city_input);
	 WebElement st_addr=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(StreetAddess_xpath)));
	 st_addr.sendKeys(street_input);

	 

 
	 search_content=true;
	while(search_content){
	try {
		 WebElement zip_code =  driver.findElement(By.id(zpCode_id));
		 search_content=false;
		 zip_code.sendKeys(zip_input);
		
	}
	catch(Exception e){
		TouchAction action = new TouchAction(driver);
		 Dimension size = driver.manage().window().getSize();
	    int star_x_ver = (int) (size.height * 0.70);
        int end_x_ver = (int) (size.height * 0.30);
        int anchor = (int) (size.width * 0.5);
       
		 action.press(PointOption.point(anchor, star_x_ver))
            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
            .moveTo(PointOption.point(anchor, end_x_ver))
            .release()
            .perform();
     	 Thread.sleep(500);
		
	}
	}
	
	
	 WebElement phone_num=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Phone_xpath)));
	 phone_num.sendKeys(phone_input);
	 
 WebElement fax_num=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Fax_id)));
fax_num.sendKeys(fax_input);
	 
WebElement continue_bill_addr=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ContinueButton_1_xpath)));
continue_bill_addr.click(); 
	 
	 
	 
	 
	 
		 Thread.sleep(1000);

	}



	    


	
}
