package com.priya.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		String title= driver.getTitle();
		
		System.out.println("Page title :" +title);
		
		String cu = driver.getCurrentUrl();
		
		System.out.println("Current Url of the page" +cu);
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
			

	}

}
