package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Bases;

public class Pages  extends Bases{

	
	
	//��װͨ�õ�Click�������������
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
	 
	//��װͨ�õĵȴ���ʱ����	
	 void iwait(){
		 
	 }
	
	//��װͨ�õ�findElement����,����һ��Ԫ��	
	 static void find(String matterName) {
	}

	

	
	
	
	
}
