package driverNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();

		String buttonsurl = driver.getCurrentUrl();
		System.out.println("Current buttons URL" + buttonsurl);

		WebElement Homepage = driver.findElement(By.id("home"));
		Homepage.click();

		String Homepageurl = driver.getCurrentUrl();
		System.out.println("Current buttons URL" + Homepageurl);

		driver.navigate().back();
		System.out.println("current navigated URL" + driver.getCurrentUrl());

		driver.navigate().refresh();

		driver.navigate().to("https://letcode.in/signin");
		System.out.println("new URL" + driver.getCurrentUrl());

	}

}
