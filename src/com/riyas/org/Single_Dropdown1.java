package com.riyas.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(@class,'css')])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("Riyas");
		driver.findElement(By.name("phone_number")).sendKeys("9876543210");
		WebElement month = driver.findElement(By.xpath("(//select[contains(@aria-invalid,'false')])[1]"));
		Select s = new Select(month);
		s.selectByIndex(2);
		WebElement Day = driver.findElement(By.xpath("(//select[contains(@aria-invalid,'false')])[2]"));
		Select s1 = new Select(Day);
		s1.selectByValue("25");
		WebElement Year = driver.findElement(By.xpath("(//select[contains(@aria-invalid,'false')])[3]"));
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//span[contains(@class,'css-901')])[11]")).click();
		
		

	}

}
