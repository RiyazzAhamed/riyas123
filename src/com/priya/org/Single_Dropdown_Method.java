package com.priya.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Dropdown_Method {

	public static void main(String[] args) throws InterruptedException {
		
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'_7UhW9')]")).click();
		Thread.sleep(5000);
		//WebElement mob = driver.findElement(By.name("//input[@name='emailOrPhone']"));
		//mob.sendKeys("9876543210");
//		driver.findElement(By.name("//input[@name='fullName']")).sendKeys("Priyaravichandran");
//		driver.findElement(By.name("//input[@name='username']")).sendKeys("priyaravichandran1503");
//		driver.findElement(By.name("//input[@name='password']")).sendKeys("priyas@1503");
//		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]")).click();
//		
		WebElement mob = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		mob.sendKeys("9876543210");
		WebElement fullname = driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
		fullname.sendKeys("Priyaravichandran");
		WebElement username = driver.findElement(By.xpath("(//input[@type = 'text'])[3]"));
		username.sendKeys("priyaravichandran1503");
		WebElement password = driver.findElement(By.xpath("(//input[@type = 'password'])[1]"));
		password.sendKeys("priyas@1503");
		Thread.sleep(5000);
		WebElement signup = driver.findElement(By.xpath("(//div[contains(@class,'_4EzTm')])[2]"));
		signup.click();
		
		
		

	}

}
