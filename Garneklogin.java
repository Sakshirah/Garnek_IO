package com.fb;
import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;



public class Garneklogin {

public static void main(String[] args) throws InterruptedException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Email ");
		String ue=sc.next();
		System.out.println("Please Enter Password");
		String pw=sc.next();
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://garnek.io/login");
        //login
		driver.findElement(By.id("name")).sendKeys(ue);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		//product
		/*driver.findElement(By.xpath("//span[@class='ant-menu-title-content' and contains(text(), 'Product')]")).click();
		Thread.sleep(1000);
	   //Brand
		driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/brands']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder=\"Type Brand Name\"]")).sendKeys("BIba6");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Add Brand']")).click();
	    //HSN
	    driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/hsn']")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"HSN Setup\"]")).sendKeys("2011");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Add HSN']")).click();
	    Thread.sleep(1000);
	    //Attributes
	   /* driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/attributes']")).click();
	    driver.findElement(By.xpath("//input[@id=\"attributeCode\"]")).sendKeys("1027");
	    driver.findElement(By.xpath("//input[@id=\"attributeName\"]")).sendKeys("Size");
	    driver.findElement(By.xpath("//input[@id=\"attributeType\"]")).sendKeys("Text");
	    driver.findElement(By.xpath("//div[text()='Text']")).click(); 
	    driver.findElement(By.xpath("//span[text()='Add Attribute']")).click();
	    Thread.sleep(1000);
	    //Group
	    driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/groups']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Add Main Group']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder=\"Group Name\"]")).sendKeys("Business2");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='OK']")).click();
	    Thread.sleep(1000);
	    //Category
	    driver.findElement(By.xpath("//a[text()='Item Category']")).click(); 
	    driver.findElement(By.xpath("//input[@placeholder=\"Type Category Name\"]")).sendKeys("Realme1");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='search' and @class='ant-select-selection-search-input']")).sendKeys("IPHONE");
	    
	    driver.findElement(By.xpath("//div[text()='IPHONE']")).click();
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
	    driver.findElement(By.xpath("//span[text()='Add Category']")).click();
	    Thread.sleep(1000);
		//Collection
		driver.findElement(By.xpath("//a[text()='Collections']")).click(); 
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id=\"collectionName\"]")).sendKeys("Winnter Collection1");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Create Collection']")).click();
	    Thread.sleep(1000);
	     //List Product
	    driver.findElement(By.xpath("//a[text()='List Product']")).click();
	    driver.findElement(By.xpath("//span[text()='Add New Product']")).click();
	    driver.findElement(By.xpath("//input[@id=\"productName\"]")).sendKeys("Laptop11");
	    Thread.sleep(1000);
	    //driver.findElement(By.xpath("//input[@type='search' and @class='ant-select-selection-search-input']")).sendKeys("Think");
	    //driver.findElement(By.xpath("//div[@class='ant-select-selector']//span[contains(text(), 'Think')]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"brand\"]")).sendKeys("BIBA");
	    driver.findElement(By.xpath("//div[text()=\"BIBA\"]")).click();	
	    
	    driver.findElement(By.xpath("//input[@aria-controls='category_list']")).sendKeys("15 PRO MAX");
	    driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='15 PRO MAX']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[@class='ql-editor ql-blank' and @contenteditable='true']")).sendKeys("Description");
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (6).png"); 
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@id=\"parentSku\"]")).sendKeys("hy777");
	
       driver.findElement(By.xpath("//span[text()='Save']")).click(); */
       
	    
	   
	    
	    
	    	    
	    
	    
	   
		
		
}

}
