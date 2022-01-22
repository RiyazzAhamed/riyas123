package com.priya.org;

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
		s.selectByValue("2");
		s.selectByIndex(4);
		s.selectByVisibleText("Selenium");
		s.deselectByIndex(4);
		//s.deselectAll();
		boolean multi = s.isMultiple();
		System.out.println("is multiple or not: " +multi);
		
		System.out.println("*******************");
		
		List<WebElement> option = s.getOptions();
		for (WebElement wb : option) {
             String text = wb.getText();		
             System.out.println(text);
		}
		
		System.out.println("******************");
		
		List<WebElement> allselectop = s.getAllSelectedOptions();
		for (WebElement all : allselectop) {
			String text1 = all.getText();
			System.out.println(text1);
		}
		System.out.println("*******************");
		
	    WebElement fso = s.getFirstSelectedOption();
	    System.out.println("getfirst text:  " +fso.getText());
	    
	   System.out.println("********************"); 
	   
	    WebElement singleselct = driver.findElement(By.xpath("(//select)[2]"));
	    Select s1 = new Select(singleselct);
	    boolean multiple1 = s1.isMultiple();
	    System.out.println("is multple or not: "+ multiple1 );
	    
	
	
	}
	

}
