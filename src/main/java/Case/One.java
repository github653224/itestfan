package Case;

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
		//实例化两个页面对象，方便调用页面的Bussness方法，统一设置 方法所需要的driver。
		LoginPage loginpage = new LoginPage(driver);
		FirstPage firstpage = new FirstPage(driver);		
	    //用户名+随机数
	    uuid = getUserName("uuid", 1000);		    
	    //姓名+随机数
	    name = getUserName("name",1000);
	  }
	@AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	  }
	
	
	@Test
	public void Case1()  {	
		//登录
		LoginPage.login(buttonName);		  
	}
	
	@Test
	public void Case2() throws InterruptedException{
		//增加一个人员
		FirstPage.addMen(uuid,name); 
	}
	
	@Test
	public void Case3(){
		 //查询是否增加成功
		FirstPage.Query(uuid,name); 
	}
	
	@Test
	public void Case4() throws InterruptedException{
		//删除一个人员
	    FirstPage.delMen(uuid); 
	}



}
