package com.riyas.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multiselect = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multiselect);
		
		s.selectByValue("3");
		s.selectByIndex(1);
		s.selectByVisibleText("Loadrunner");
		s.deselectByValue("3");
		
		boolean multi = s.isMultiple();
		
		System.out.println("is multiple or not: " +multi);
		
		System.out.println("////////////////////");
		
		List<WebElement> opt = s.getOptions();
		for (WebElement wb : opt) {
             String txt = wb.getText();		
             System.out.println(txt);
		}
		
		System.out.println("*/////////////////////////////////");
		
		List<WebElement> gaso = s.getAllSelectedOptions();
		for (WebElement all : gaso) {
			String txt1 = all.getText();
			System.out.println(txt1);
		}
		System.out.println("///////////////////////////////////////////////////");
		
	    WebElement gfso = s.getFirstSelectedOption();
	    System.out.println(gfso.getText());
	    
	  
	
	
	}
	

}


	
