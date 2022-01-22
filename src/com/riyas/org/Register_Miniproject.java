package com.riyas.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Miniproject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//a[@class='login']")).click();

		WebElement mailid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mailid.sendKeys("rhazee325@gmail.com");

		driver.findElement(By.xpath("(//button)[1]")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='radio']")).click();

		WebElement firstname = driver.findElement(By.xpath("(//input[contains(@id,'customer')])[1]"));

		firstname.sendKeys("Riyaz");

		WebElement lastname = driver.findElement(By.xpath("(//input[contains(@id,'customer')])[2]"));

		lastname.sendKeys("Ahamed");

		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Riyas@328");

		WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
		Select s = new Select(days);
		s.selectByValue("25");

		WebElement mon = driver.findElement(By.id("months"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText("JUNE");

		WebElement yrs = driver.findElement(By.id("years"));
		Select s2 = new Select(yrs);
		s2.selectByValue("1999");

		Thread.sleep(3000);

		WebElement com = driver.findElement(By.id("company"));
		com.sendKeys("Tcs");

		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("  TCS ETC Tower, 200 Feet Road, MCN Nagar Extension, Pallavaram Ring Road, Thoraipakkam");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("alameda");

		WebElement state = driver.findElement(By.xpath("(//select[contains(@name,'id')])[1]"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("California");

		WebElement code = driver.findElement(By.id("postcode"));
		code.sendKeys("94501");
		
		//WebElement nil = driver.findElement(By.id("other"));
		//nil.sendKeys("nil");
		
		
		WebElement homemob = driver.findElement(By.id("phone"));
        homemob.sendKeys("9600086406");
		WebElement mob = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		mob.sendKeys("8680863241");

		WebElement ad = driver.findElement(By.id("alias"));
		ad.sendKeys(" is alameda");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Register']")).click();

	}




	}


