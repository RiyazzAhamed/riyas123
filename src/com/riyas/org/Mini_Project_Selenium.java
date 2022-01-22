package com.riyas.org;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project_Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class ='login']")).click();
		driver.findElement(By.id("email")).sendKeys("rhazee325@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Riyas@328");
		Thread.sleep(3000); 
		driver.findElement(By.id("SubmitLogin")).click();
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1500)");
        driver.findElement(By.xpath("(//a[@title ='T-shirts'])[2]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebElement img = driver.findElement(By.xpath("(//img[contains(@class,'replace')])[2]"));
        Actions mo = new Actions(driver);
        mo.moveToElement(img).build().perform();
        driver.findElement(By.xpath("//a[@class ='quick-view']")).click(); 
        WebElement frame1 = driver.findElement(By.xpath("//iframe[contains(@class,'fancybox')]"));
        driver.switchTo().frame(frame1);        
        driver.findElement(By.name("Submit")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("(//a[contains(@title,'Proceed to checkout')])[2]")).click();
        driver.findElement(By.name("processAddress")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.name("processCarrier")).click();
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File start = ts.getScreenshotAs(OutputType.FILE);
        File end = new File("C:\\Users\\Riyaz Ahmed\\eclipse-workspace\\Selinium_Testing\\Screenshots\\pic1.png");
        FileUtils.copyFile(start, end);
        
        
        
        
	}

}