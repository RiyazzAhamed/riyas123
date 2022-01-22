package com.riyas.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Runner {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Riyazahamed");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Riyas@328");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select l = new Select(loc) ;
		l.selectByVisibleText("Sydney");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select h = new Select(hotels);
		h.selectByVisibleText("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select r =	new Select(room);
		r.selectByVisibleText("Super Deluxe");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select rno = new Select(roomno);
		rno.selectByIndex(3);
		
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.sendKeys("20/01/2022");
		
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.sendKeys("21/01/2022");
		
		WebElement adultno = driver.findElement(By.id("adult_room"));
		Select an = new Select(adultno);
		an.selectByIndex(2);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select ch =  new Select(child);
		ch.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement radio = driver.findElement(By.xpath("(//input [contains (@name,'radio')])[1]"));
		radio.click();
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Riyaz");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Ahamed");
		
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("no.123,new town north street,parrys");
	    
	    WebElement ccnum = driver.findElement(By.name("cc_num"));
	    ccnum.sendKeys("1234567890123456");
	    
	    WebElement cctype = driver.findElement(By.xpath("(//select[contains(@name,'cc')])[1]"));
	    Select ct = new Select(cctype);
	    ct.selectByValue("MAST");
	    
	    WebElement ccmnth = driver.findElement(By.name("cc_exp_month"));
	    Select cm = new Select(ccmnth);
	    cm.selectByValue("3");
	    
	    WebElement ccyr = driver.findElement(By.name("cc_exp_year"));
		Select cy = new Select(ccyr);
		cy.selectByVisibleText("2022");
		
		WebElement ccv = driver.findElement(By.xpath("(//input[contains(@name,'cc')])[2]"));
		ccv.sendKeys("456");
		
		
		WebElement book = driver.findElement(By.xpath("//input[contains(@name,'book')]"));
		book.click();
		
		Thread.sleep(6000);
		
		 WebElement itern = driver.findElement(By.xpath("//input[contains(@value,'My')]"));
		 itern.click();
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
	      File start =ts.getScreenshotAs(OutputType.FILE);
	      File end = new File("C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Mvn_Project\\Screenshots\\booking.png");
	      FileUtils.copyFile(start, end);
	      Thread.sleep(1500);
	       
	      WebElement logout = driver.findElement(By.name("logout"));
	      logout.click();
	        
	      driver.close();
		 
	}

}
