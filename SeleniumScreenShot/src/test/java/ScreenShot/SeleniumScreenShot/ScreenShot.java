package ScreenShot.SeleniumScreenShot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

	public class ScreenShot {

	    public static void main(String[] args) throws IOException {
	       

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://letcode.in/buttons");
	        driver.manage().window().maximize();

	            // Take screenshot
	           TakesScreenshot ts = (TakesScreenshot) driver;
	           File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	           File targetFile = new File("C:\\Users\\Haji Aboothahir\\eclipse-workspace\\SeleniumScreenShot\\screenshot/Image.png");
	           FileUtils.copyFile(sourceFile, targetFile);
	            
	            driver.findElement(By.id("home"));
	            TakesScreenshot ts1 = (TakesScreenshot) driver;
	            File source =  ts1.getScreenshotAs(OutputType.FILE);
	            File dest = new File("C:\\\\Users\\\\Haji Aboothahir\\\\eclipse-workspace\\\\SeleniumScreenShot\\\\screenshot/Image1.png");
	            FileUtils.copyFile(source, dest);
	            driver.quit();
	        }
	    }
	


