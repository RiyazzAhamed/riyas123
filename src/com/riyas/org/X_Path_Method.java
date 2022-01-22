package com.riyas.org;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class X_Path_Method {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(7000);
			
			WebElement user = driver.findElement(By.name("username" ));
			user.sendKeys("riyas0315");
			
			WebElement password = driver.findElement(By.name("password"));
			
			password.sendKeys("riyas@325");
			
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			
			
			
			
			

		}

	}


