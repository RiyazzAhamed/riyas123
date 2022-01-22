package com.riyas.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements_Concept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("riyas@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Riyas1503");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(7000);
		driver.navigate().refresh();
		
	}

}
