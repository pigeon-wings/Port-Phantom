package AppiumPackage;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class purchase_filling {
	public static AndroidDriver driver;
	public static WebDriverWait wait;
	public static boolean search_content;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		purch_filling();
	}
	
	
	@Test
	 public static void purch_filling() throws InterruptedException {
		
		//location variables
		
		String nd_air_xpath="(//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvShippingMethodAmount\"])[4]";
		String continue_button_air_page_xpath="(//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnContinue'])[2]";
		String cm_order_selection_xpath="//android.widget.TextView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvPaymentMethodDetails' and @text='Pay by cheque or money order']";
		String continue_button_order_page_xpath="(//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnContinue'])[2]";
		String next_button_xpath="//android.widget.Button[@text='Next']";
		String confirm_button_id="com.nopstation.nopcommerce.nopstationcart:id/checkoutButton";
		
		
		BillingDetails.billing_filling();
		wait=BillingDetails.wait;
		driver=BillingDetails.driver;
		
		search_content =true;
		while(search_content){
		try {

			 WebElement nd_air_cl =  driver.findElement(By.xpath(nd_air_xpath));
 		search_content=false;
 		nd_air_cl.click();
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
		
	    search_content=true;
		while(search_content){
		try {

			 WebElement air_continue_cl =  driver.findElement(By.xpath(continue_button_air_page_xpath));
 		search_content=false;
 		air_continue_cl.click();
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
		
		 search_content=true;
			while(search_content){
			try {

				 WebElement cm_continue_cl =  driver.findElement(By.xpath(cm_order_selection_xpath));
	 		search_content=false;
	 		cm_continue_cl.click();
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
		
		
		
		
			  search_content=true;
				while(search_content){
				try {

					 WebElement order_cl =  driver.findElement(By.xpath(cm_order_selection_xpath));
		 		search_content=false;
		 		order_cl.click();
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
				
				 search_content=true;
					while(search_content){
					try {

						 WebElement continue_order_cl =  driver.findElement(By.xpath(continue_button_order_page_xpath));
			 		search_content=false;
			 		continue_order_cl.click();
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


					WebElement next_button_cl =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(next_button_xpath)));
				 	next_button_cl.click();
	
		
					WebElement confirm_button_cl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(confirm_button_id)));
					confirm_button_cl.click();
		
		
		
		
		
		
		
	}

}
