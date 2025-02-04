package HandlingButtons.SeleniumHandlingButtons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;

public class HandlingButtons {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();

		// To get the X and Y co ordinates
		WebElement co = driver.findElement(By.id("position"));
		Point point = co.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x = " + x + "y = " + y);

		// To get the colour of the buttons
		WebElement color = driver.findElement(By.id("color"));
		String buttoncolor = color.getCssValue("background-color");
		System.out.println("Button color is " + buttoncolor);

		// To find a height and width of the button
		WebElement dim = driver.findElement(By.id("property"));
		Rectangle dimension = dim.getRect();

		System.out.println("the Height of the button is " + dimension.getHeight());
		System.out.println("the width of the button is " + dimension.getWidth());

		driver.quit();

	}

}
