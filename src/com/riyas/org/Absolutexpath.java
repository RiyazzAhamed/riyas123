package com.riyas.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=mens&otracker=AS_Query_HistoryAutoSuggest_2_0&otracker1=AS_Query_HistoryAutoSuggest_2_0&marketplace=FLIPKART&as-show=on&as=off&as-pos=2&as-type=HISTORY");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//		WebElement user = driver.findElement(By.name("username" ));
//		user.sendKeys("riyas0315");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		
//		password.sendKeys("riyas@325");
//		
//		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
		
		driver.findElement(By.xpath("//div[@id ='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img")).click();
		
		
		
		

	}

}
