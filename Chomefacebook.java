package com.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
public class Chomefacebook {

	public static void main(String[] args) throws InterruptedException {
	
		
		
	WebDriver  driver=new ChromeDriver();
	driver.get("http://13.200.167.91:5000/login");
	driver.findElement(By.id("name")).sendKeys("sakshi@garnek.io");
	driver.findElement(By.id("password")).sendKeys("Sakshi@1");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(3000);
	
	//product
	driver.findElement(By.xpath("//span[@class='ant-menu-title-content' and contains(text(), 'Product')]")).click();
	Thread.sleep(1000);
   //Brand
	driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/brands']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder=\"Type Brand Name\"]")).sendKeys("BIba4");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Add Brand']")).click();
    Thread.sleep(1000);
    //HSN
   driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/hsn']")).click();
    driver.findElement(By.xpath("//input[@placeholder=\"HSN Setup\"]")).sendKeys("2014");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Add HSN']")).click();
    Thread.sleep(1000);
    //Attributes
    driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/attributes']")).click();
    driver.findElement(By.xpath("//input[@id=\"attributeCode\"]")).sendKeys("1040");
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
    driver.findElement(By.xpath("//input[@placeholder=\"Group Name\"]")).sendKeys("Business1");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='OK']")).click();
    Thread.sleep(1000);
    /*driver.findElement(By.xpath("//div[11]//span[3]//span[1]//span[1]//div[1]//*[name()='svg']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Add New']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("/	/input[@placeholder=\"Group Name\"]")).sendKeys("Mobile Business ");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='OK']")).click();
    Thread.sleep(1000);*/
     //Category
    driver.findElement(By.xpath("//a[text()='Item Category']")).click(); 
    driver.findElement(By.xpath("//input[@placeholder=\"Type Category Name\"]")).sendKeys("Realme3");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[contains(@class, 'ant-select-selection-search-input')]")).sendKeys("IPHONE");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[text()='IPHONE']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Add Category']")).click();
    Thread.sleep(1000);
	//Collection
	driver.findElement(By.xpath("//a[text()='Collections']")).click(); 
	Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id=\"collectionName\"]")).sendKeys("Winnter Collection");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (13).jpg"); 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Create Collection']")).click();
    Thread.sleep(1000);
     //List Product
    driver.findElement(By.xpath("//a[text()='List Product']")).click();
    driver.findElement(By.xpath("//span[text()='Add New Product']")).click();
    driver.findElement(By.xpath("//input[@id=\"productName\"]")).sendKeys("Laptop14");
    Thread.sleep(1000);
    //driver.findElement(By.xpath("//input[@type='search' and @class='ant-select-selection-search-input']")).sendKeys("Think");
    //driver.findElement(By.xpath("//div[@class='ant-select-selector']//span[contains(text(), 'Think')]")).click();
    driver.findElement(By.xpath("//input[@id=\"brand\"]")).sendKeys("BIBA");
    driver.findElement(By.xpath("//div[text()=\"BIBA\"]")).click();	
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@aria-controls='category_list']")).sendKeys("15 PRO MAX");
    driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='15 PRO MAX']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@class='ql-editor ql-blank' and @contenteditable='true']")).sendKeys("Description");
    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Downloads\\download (6).png"); 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id=\"parentSku\"]")).sendKeys("hyhy78");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Save']")).click(); 
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[@class='ant-menu-title-content' and text()='Product']")).click();
    Thread.sleep(1000);
    
    //Customer
	driver.findElement(By.xpath("//span[text()='Customer']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/customer-type']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"customerTypeName\"]")).sendKeys("DISTRIBUTOR");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Add Customer Type']")).click();
	
	driver.findElement(By.xpath("//a[@class='sidebar__link__tags' and @href='/dashboard/client/kyc-list']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='eg. Pan Card, GST number, Adhaar Card' and @type='text']")).sendKeys("Cancel Cheque");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='ant-select-selector']//input[@class='ant-select-selection-search-input']")).sendKeys("Text");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='Text']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[contains(text(), 'Add Document Type')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='All Customers']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Add New Customer']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("abc");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("abs");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("7898765676");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"emailAddress\"]")).sendKeys("abc@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"alternatePhoneNumber\"]")).sendKeys("7777777777");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"spouseName\"]")).sendKeys("bbb");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='dateOfBirth']")).sendKeys("2024-12-09");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value=\"2024-12-09\"]")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"anniversaryDate\"]")).sendKeys("2024-12-08");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value=\"2024-12-08\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("input[id=\"storeName\"]")).sendKeys("Sotre");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("")).sendKeys("");
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Customer']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Order']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='All Orders']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Add New Order']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("pratibha shop");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()=\"pratibha shop\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder=\"Search for products...\"]")).sendKeys("jackets for women");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='View Variants']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder=\"Enter Quantity\"]")).sendKeys("5");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Quantity' and @class='ant-input css-ni1kz0 ant-input-outlined' and @value='0']")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h5[@class='ant-typography css-ni1kz0']//span[@class='ant-badge css-ni1kz0']//*[name()='svg']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='rc_select_5' and contains(@class, 'ant-select-selection-search-input')]")).sendKeys("ON CREDIT");
	Thread.sleep(5000);
	
	 
	
	}
    
}

