package com.riyas.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@onclick,'normalAlert()')]")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		driver.findElement(By.xpath("//button[contains(@onclick,'confirmAlert()')]")).click();
		Alert al1 = driver.switchTo().alert();
		al1.dismiss();
		driver.findElement(By.xpath("//button[contains(@onclick,'confirmPrompt()')]")).click();
		Alert al2 = driver.switchTo().alert();
		al2.sendKeys("Riyas");
		System.out.println(al2.getText());
		al2.accept();
		
		
		
		

	}

}
