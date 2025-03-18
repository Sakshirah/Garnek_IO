package com.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		
		
		
		WebDriver  driver=new ChromeDriver();
		driver.get(" http://13.200.167.91:8000/");
		
		//driver.findElement(By.xpath("//input[@type=\"checkbox\" and contains(@id,'Category')]"));
		//List<WebElement>checkboxes=(List<WebEl .xpath("//input[@type=\"checkbox\"]"));
		//System.out.println("Total No of check boxes:"+checkboxes.size());
		
		
		//driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id='67692ca6d4dadf540fa79ae2']")).click();
		// driver.findElement(By.xpath("//input[@placeholder=\"What do you need\"]")).sendKeys("Iphone");
		// driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//h5[text()='Home & Kitchen']")).click();
		
		
	}

}
