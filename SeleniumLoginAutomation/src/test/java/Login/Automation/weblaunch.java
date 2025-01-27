package Login.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class weblaunch {
	private static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        login.click();
	} 
	
	// Verify successful login
    String pageTitle = driver.getTitle(); {
   if (pageTitle.equals("Swag Labs")) {
       System.out.println("Login successful!");
   } else {
       System.out.println("Login failed!");
    
    }
}
}


