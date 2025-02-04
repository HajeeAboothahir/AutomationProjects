package seleniumDragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDragBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

		// WebElement frames = driver.findElement(By.xpath("demo-frame"));

		driver.switchTo().frame(0);

		WebElement Element = driver.findElement(By.id("draggable"));
		Actions building = new Actions(driver);
		Point point = Element.getLocation();
		int X = point.getX();
		int Y = point.getY();
		building.dragAndDropBy(Element, X + 50, Y + 90).perform();
	}

}
