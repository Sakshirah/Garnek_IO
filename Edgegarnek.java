package com.fb;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver;
public class Edgegarnek {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://13.200.167.91:5000/login");

	}

}
