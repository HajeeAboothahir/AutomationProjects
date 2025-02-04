package Alert.SeleniumAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();

		// simple Alert
		WebElement SimpleAlert = driver.findElement(By.id("accept"));
		SimpleAlert.click();

		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		// prompt Alert
		WebElement promptalert = driver.findElement(By.id("prompt"));
		promptalert.click();
		driver.switchTo().alert();
		alert.sendKeys("Hajee is the kingmaker");
		alert.accept();

		WebElement promptname = driver.findElement(By.id("myName"));
		String text1 = promptname.getText();
		System.out.println(text1);
		driver.quit();
	}

}
