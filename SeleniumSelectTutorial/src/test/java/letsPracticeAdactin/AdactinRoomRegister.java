package letsPracticeAdactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class AdactinRoomRegister {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement username =	driver.findElement(By.id("username"));
	    username.sendKeys("Hajee123");
	    
	WebElement password =    driver.findElement(By.id("password"));
	    password.sendKeys("GCK0P8");
	    
	WebElement login =    driver.findElement(By.id("login"));
	    login.click();
	    
	WebElement location =   driver.findElement(By.id("location"));
	     Select loc = new Select(location);
	     loc.selectByValue("Paris");
	     
	 WebElement hotel =    driver.findElement(By.id("hotels"));
	     Select hot = new Select(hotel);
	     hot.selectByValue("Hotel Sunshine");

	 WebElement roomtype =    driver.findElement(By.id("room_type"));
	     Select room = new Select(roomtype);
	     room.selectByValue("Deluxe");
		
	  WebElement roomnos =   driver.findElement(By.id("room_nos"));
	      Select nos = new Select(roomnos);
	      nos.selectByValue("4");
	      
	   WebElement checkin =   driver.findElement(By.id("datepick_in"));
	      checkin.clear();
	      checkin.sendKeys("23/07/2023");
	      
	  WebElement checkout = driver.findElement(By.id("datepick_out"));
	      checkout.clear();
	      checkout.sendKeys("27/07/2023");
	      
	   WebElement adultroom =   driver.findElement(By.name("adult_room"));
	   
	    Select adult = new Select(adultroom);
	    adult.selectByIndex(3);
	    
	   WebElement childroom = driver.findElement(By.id("child_room"));
	     Select child = new Select(childroom);
	     child.selectByIndex(1);
	     
	   Thread.sleep(5000);  
	     
	   WebElement search =  driver.findElement(By.id("Submit"));
	      search.click();
	   WebElement find = driver.findElement(By.id("radiobutton_0"));
	   find.click();
	   
	   WebElement continue1 =   driver.findElement(By.id("continue"));
	   continue1.click();
	   
	  WebElement firstname = driver.findElement(By.id("first_name"));
	      firstname.sendKeys("Hajee syed");
	      
	   WebElement lastname =   driver.findElement(By.id("last_name"));
	       lastname.sendKeys("Aboothahir");
	       
	    WebElement address =   driver.findElement(By.id("address"));
	       address.sendKeys("NO;126, Royal palace street, Broadway,Chennai-6000028");
	       
	    WebElement carddetails =   driver.findElement(By.id("cc_num"));
	      carddetails.sendKeys("4714258596367894");
	      
	   WebElement cardtype =   driver.findElement(By.id("cc_type"));
	      Select type = new Select(cardtype);
	      type.selectByValue("VISA");
	      
	   WebElement cardmonth =   driver.findElement(By.id("cc_exp_month"));
	      Select month = new Select(cardmonth);
	      month.selectByValue("6");
	      
	   WebElement cardyear =   driver.findElement(By.id("cc_exp_year"));
	      Select year = new Select(cardyear);
	      year.selectByVisibleText("2022");
	      
	    WebElement cvvno =  driver.findElement(By.id("cc_cvv"));
	    	cvvno.sendKeys("234");
	    
	    WebElement booknow =	driver.findElement(By.id("book_now"));
	    booknow.click();
	    System.out.println("Order no is 6O9OAF052N");

		

	}

}
