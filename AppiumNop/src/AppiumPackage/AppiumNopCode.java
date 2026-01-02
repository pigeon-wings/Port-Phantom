package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Resources;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumNopCode {

	   protected static AndroidDriver driver;
	   public static WebDriverWait wait;

	
	 
	@SuppressWarnings("deprecation")
	@BeforeEach 
	    public static void setUp() throws MalformedURLException, URISyntaxException {
		   UiAutomator2Options options = new UiAutomator2Options();
		        options.setUdid("LAAP1909003552");		        
		        options.setCapability("appium:appPackage", "com.nopstation.nopcommerce.nopstationcart");
		        options.setCapability("appium:appActivity", "com.bs.ecommerce.main.SplashScreenActivity");
		        options.setCapability("platformName", "Android");
		        options.setCapability("appium:platformVersion", "8.1.0");
		        options.setCapability("appium:automationName", "uiautomator2");
		        		        
		        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);
		        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		        
		        
	    }
	
	
	

	@SuppressWarnings("deprecation")
	@Test
public static void test_part1() {
		  
	        try {
	     
	        	setUp();
	            
	            
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/privacyPolicyLayout']"))).click();
	            //driver.findElement().click();
	    
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnAccept']"))).click();
	          //  driver.findElement().click();
	            Thread.sleep(1000);
	        //  WebElement ourCategories= driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvTitle' and @text='OUR CATEGORIES']"));
	            Dimension size = driver.manage().window().getSize();
	            int star_x = (int) (size.width * 0.90);
	            int end_x = (int) (size.width * 0.09);
	            int star_y = (int) (size.height*0.5);
	          //  TouchAction touchAction = new TouchAction(driver);
	           // touchAction.press(star_x, star_y).moveTo(end_x, star_y).release().perform();
	           // TouchAction touchAction = new TouchAction(driver);
	          // touchAction.tap(PointOption.point(475, 57)).perform();
	            TouchAction action = new TouchAction(driver);


	          // WebElement el = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"YOUR_RECYCLERVIEW_ID\")).setAsVerticalList().scrollIntoView("
	            		                          //  + "new UiSelector().text(\""+text+"\"));")));
	            //String elec="Electronics";
	            boolean search_content=true;
	            
	            while(search_content){
	                 
	            try
	            {
	                //stop when desired element is displayed
	            	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvProductName' and @text='Electronics']")).click(); 
	            	search_content=false;
	            }
	            catch (Exception e)
	            {
	                //swipe left|right when desired element is not displayed
	                action.press(PointOption.point(star_x,star_y))
		            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
		            .moveTo(PointOption.point(end_x, star_y))
		            .release();
	                action.perform();
	                Thread.sleep(500);
	            }
	            }

	          
	          Thread.sleep(1000);
	         
	            int star_x_ver = (int) (size.height * 0.70);
	            int end_x_ver = (int) (size.height * 0.30);
	            int anchor = (int) (size.width * 0.5);
	           
	           
	           

	          //  WebElement click_mat_bed= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/ivProductThumb']"));
	            //driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvProductName' and @text='"+mat_bed+"']")).click();
	           // (//android.widget.ImageView[@content-desc="Placeholder"])[5]
	            
	            search_content=true;
	            while(search_content){
	                 
		            try
		            {
		                //stop when desired element is displayed
		            	 String mat_bed="Mattress Bedroom";
		            	 
		            	 WebElement mat_element = driver.findElement(By.xpath(".//android.widget.TextView[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvProductName' and @text='"+mat_bed+"']/ancestor::android.widget.FrameLayout[@index='0']"));
		            	// @resource-id='com.nopstation.nopcommerce.nopstationcart:id/tvProductName' and 
		            	// Actions mat_click = new Actions(driver);
		            	//mat_click.moveToElement(mat_element).click().release().perform();
		            	mat_element.click();
	
		            search_content=false;
		            
		            }
		            catch (Exception e)
		            {
		                //swipe up|down when desired element is not displayed
		            	 action.press(PointOption.point(anchor, star_x_ver))
		 	            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
		 	            .moveTo(PointOption.point(anchor, end_x_ver))
		 	            .release()
		 	            .perform();
		            	 Thread.sleep(500);
		            	
		            }
		            }
	            Thread.sleep(1000);
	            
	            
	            
	            star_x_ver = (int) (size.height * 0.80);
	            end_x_ver = (int) (size.height * 0.20);
	            anchor = (int) (size.width * 0.5);
	            search_content=true;
	            
	            while(search_content){
	                 
		            try
		            {
		            	driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnPlus']")).click();
		            	driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart']")).click();
		            	search_content=false;
		            }
		            catch (Exception e)
		            {
		                //swipe up|down when desired element is not displayed
		            	 action.press(PointOption.point(anchor, star_x_ver))
		 	            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
		 	            .moveTo(PointOption.point(anchor, end_x_ver))
		 	            .release()
		 	            .perform();
		            	 Thread.sleep(500);
		            	
		            }
		            }
	            
	            Thread.sleep(1000);
	           
//	           int two=1;
//	   		 
//	   		  star_x_ver = (int) (size.height * 0.80);
//	             end_x_ver = (int) (size.height * 0.20);
//	             anchor = (int) (size.width * 0.5);
//	             search_content=true;
//	             
//	             while(search_content){
//	                  
//	   	            try
//	   	            {
//	   	            	
//	   	           WebElement dr= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnPlus']"));
//	   	           search_content=false;
//	   	           for(int i=0;i<two;i++) {
//	   	           dr.click();	          
//	   	            	}
//	   	            	
//	   	            }
//	   	            catch (Exception e)
//	   	            {
//	   	                //swipe up|down when desired element is not displayed
//	   	            	 action.press(PointOption.point(anchor, star_x_ver))
//	   	 	            .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
//	   	 	            .moveTo(PointOption.point(anchor, end_x_ver))
//	   	 	            .release()
//	   	 	            .perform();
//	   	            	 Thread.sleep(500);
//	   	            	
//	   	            }
//	   	            }
//	             System.out.println("There is now :"+two+"product added");
//	             Thread.sleep(1000);
//	             
//	         
//
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	
	}

	   @AfterEach
	    public static void tearDown() throws InterruptedException {
		   Thread.sleep(10000);
	        driver.quit();
	    }
	
		public static void main(String[] args) throws MalformedURLException, URISyntaxException {
	
			
			test_part1();
		}

}
