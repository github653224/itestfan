package Case.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Bases;
import Pages.FirstPage;
import Pages.LoginPage;
import TestPro.Actions;
import TestPro.Common;

public class One  extends Bases {
	
	WebDriver driver = null;
	private Actions action;
	private String uuid;
	private String name;
	private String password;
	private String buttonName;

	@BeforeClass
	  public void setUp()  throws Exception {
	    String baseUrl = "http://127.0.0.1:8040";
		driver = SetDriver(baseUrl);		
		//ʵ��������ҳ����󣬷������ҳ���Bussness������ͳһ���� ��������Ҫ��driver��
		LoginPage loginpage = new LoginPage(driver);
		FirstPage firstpage = new FirstPage(driver);		
	    //�û���+�����
	    uuid = getUserName("uuid", 1000);		    
	    //����+�����
	    name = getUserName("name",1000);
	  }
	@AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	  }
	
	
	@Test
	public void Case1()  {	
		//��¼
		LoginPage.login(buttonName);		  
	}
	
	@Test
	public void Case2() throws InterruptedException{
		//����һ����Ա
		FirstPage.addMen(uuid,name); 
	}
	
	@Test
	public void Case3(){
		 //��ѯ�Ƿ����ӳɹ�
		FirstPage.Query(uuid,name); 
	}
	
	@Test
	public void Case4() throws InterruptedException{
		//ɾ��һ����Ա
	    FirstPage.delMen(uuid); 
	}



}
