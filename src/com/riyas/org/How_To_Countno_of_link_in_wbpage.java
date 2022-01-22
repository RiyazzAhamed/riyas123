package com.riyas.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Countno_of_link_in_wbpage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=upsc&rlz=1C1UEAD_enIN932IN932&oq=upsc&aqs=chrome.0.0i67i355i433j46i67i199i433i465j0i67i433l3j0i67l3j0i512j0i67.1896j0j7&sourceid=chrome&ie=UTF-8");
	    driver.manage().window().maximize();
	    
	    List<WebElement> links = driver.findElements(By.tagName("h3"));
	    List<WebElement> a = driver.findElements(By.tagName("a"));
		System.out.println("No.of.link h3 : " +links.size());
		System.out.println("No.of.link a  :" +a.size());
		
		
		 

	}

}
