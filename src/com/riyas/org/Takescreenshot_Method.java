package com.riyas.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_Method {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("expresswiiiiiings@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("riyas");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end=new File("C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Screenshots\\pic.png");
		FileUtils.copyFile(start, end);
		//FileHandler.copy(start, end);
		
		

}
}