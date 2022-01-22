package com.priya.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown_Method1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createaccount = driver.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		createaccount.click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("ravichandran");
		driver.findElement(By.xpath("(//input[contains(@name ,'reg')])[1]")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[contains(@id ,'pass')])[2]")).sendKeys("Priyas@1503");
		WebElement day = driver.findElement(By.id("day"));
		Select Date = new Select(day);
		Date.selectByValue("14");
		WebElement month = driver.findElement(By.id("month"));
		Select Mon =new Select(month);
		Mon.selectByIndex(7);
		WebElement year = driver.findElement(By.id("year"));	
		Select yr = new Select(year);
		yr.selectByVisibleText("2005");
    	driver.findElement(By.xpath("(//input[contains(@id ,'u_')])[6]")).click();
    	List<WebElement> Days = Date.getOptions();
    	for (WebElement wb : Days) {
    		String text = wb.getText();
    		System.out.println(text);
			
		}
		
		
		
		

	}

}
