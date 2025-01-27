package SeleniumHandlingInputs.HandlingInputs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class letcode {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http:letcode.in/edit");
		
		driver.manage().window().maximize();
		
		// Enter a name
		WebElement fullname  = driver.findElement(By.id("fullName"));
			fullname.sendKeys("Hajee Syed Aboothahir");
			
		// Append a text and press keyboard tab
		WebElement textandpress = driver.findElement(By.id("join"));
		textandpress.sendKeys(" person", Keys.TAB);
		
		//what is inside in textbox
		WebElement myvalue = driver.findElement(By.id("getMe"));
		String text = myvalue.getDomAttribute("value");
		
		 System.out.println(text);
		
		 //clear the text
		WebElement cleartext = driver.findElement(By.id("clearMe"));
		cleartext.clear();
		
		//to confirm edit field is disabled
		WebElement editfield = driver.findElement(By.id("noEdit"));
	    boolean confirm =	editfield.isEnabled();
	    System.out.println(confirm);	
	    
	    //to confirm field is readonly
	    WebElement readonly = driver.findElement(By.id("dontwrite"));
	    String readable = readonly.getDomAttribute("readonly");
	    System.out.println(readable);
	}

}
