package Frames.Seleniumframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();

		// WebElement frames = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		// driver.switchTo().frame(frames);
		driver.switchTo().frame(0);

		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Hajee");
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Zayaan");

		// WebElement frames1 =
		// driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		// driver.switchTo().frame(frames1);
		driver.switchTo().frame(1);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Ayshahajee@gmail.com");

		driver.switchTo().defaultContent();
		WebElement testing = driver.findElement(By.id("testing"));
		testing.click();

	}

}
