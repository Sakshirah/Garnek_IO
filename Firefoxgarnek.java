package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Firefoxgarnek {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://garnek.io/login");
	
	driver.findElement(By.cssSelector("input#name")).sendKeys("sakshi@garnek.io");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input#password")).sendKeys("Sakshi@13");
	Thread.sleep(1000);
	driver.findElement(By.xpath("")).sendKeys("");
	Thread.sleep(2000);

	
	
	
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
