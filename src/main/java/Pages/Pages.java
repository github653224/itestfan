package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Bases;

public class Pages  extends Bases{

	
	
	//封装通用的Click方法，处理参数
	 static void click(String matterName,WebDriver driver) {
		 	driver.findElement(By.id("imageField")).click(); 
		    driver.switchTo().frame("code");
		    	    
		    WebElement testTable = driver.findElement(By.id("menu"));
		    testTable.findElements(By.tagName("tr")).get(2)
		    .findElement(By.tagName("td"))
		    .findElement(By.tagName("span"))
		    .findElement(By.tagName("span"))
		    .click();		    
		    driver.switchTo().defaultContent();
	}
	 
	//封装通用的等待延时方法	
	 void iwait(){
		 
	 }
	
	//封装通用的findElement方法,返回一个元素	
	 static void find(String matterName) {
	}

	

	
	
	
	
}
