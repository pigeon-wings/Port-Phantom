package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class appium_scenario_two {
	 

	
	public static AndroidDriver drivers;
	public static WebDriverWait wait;
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		// TODO Auto-generated method stub
	 // AppiumNopCode class1 = new AppiumNopCode();
		
	 // AppiumNopCode appiumNopCode = new AppiumNopCode();
		
	  
		// appium_scenario_two class2 = new appium_scenario_two();
		
	
	  test_part2();
		 
	}
	
	
	@Test
	 public static void test_part2() {
	
		  try {
//				Mike go to shopping cart by clicking top cart icon 
			  AppiumNopCode.test_part1();
				drivers=AppiumNopCode.driver;
				wait=AppiumNopCode.wait;
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/menu_cart"))).click();
			  Thread.sleep(1000);
			  
	
	//Mike click checkout button from shopping cart page
			 
			WebElement button_checkout=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")));
			button_checkout.click();
			 Thread.sleep(1000);
		//  Mike select checkout as guest from shopping cart page  
		  
			 WebElement button_guest_checkout=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")));
			 button_guest_checkout.click();
				 Thread.sleep(1000);
		  
		  

		  
		  }catch(Exception e) {
				 e.printStackTrace();
				 System.out.println(e+" error");
			 }  
  
	 }
	 
	 

	   @AfterEach
	    public static void tearDown() throws InterruptedException {
		   Thread.sleep(10000);
	        drivers.quit();
	    }

		
}


