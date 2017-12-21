package Base.copy;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Bases {

	//��װͨ�õ�driver���÷���
	
		private static WebDriver driver;


		public static WebDriver SetDriver(String baseUrl) {
			
			System.setProperty("WebDriver.ie.driver",
					"C:\\Windows\\System32\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();	
		    driver.get(baseUrl);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    return driver;
		    		    
	}
		
		  /**
		   * ����SwitchWindow();
		   * @author Simba
		   */
		   public static void mySwitchWindow(WebDriver driver) {
			// TODO Auto-generated method stub
			  String currentWindow = driver.getWindowHandle();
			  Set handles = driver.getWindowHandles();
			  Iterator<String> it = handles.iterator();
			  while(it.hasNext()){
				  String handle = it.next();
				  if (currentWindow.equals(handle)){
					  continue; //������ǰѭ��
				  }else{
					  WebDriver window = driver.switchTo().window(handle);
					  System.out.println(window.getTitle());
				  }
			  }
					  
		}
		   
			  /**
			   * ����selectѡ���
			   * @author Simba   
			   * */
			  public static void getSelect(String idpath,int num,WebDriver driver){
				  Select sel = new Select(driver.findElement(By.id(idpath)));
				  sel.selectByIndex(getRadomNum(num));
			  }
			  
			  /**
			    * ����û������������
			    * @param str
			    * @return
			    */
			    public static String getUserName(String str,int max){
					String FirstName = str;
			    	String UserName = "";
			    		    	
			    	UserName = FirstName + getRadomNum(max);
			    	return UserName;	    	
			    }
			  
			  /**
			    * ��װ����� 
			    * @param max
			    * @return
			    */
			    public static int getRadomNum(int max){
			    	
					int num = 0;
			    	Random RadomNum = new Random();
			    	for(int i = 1;i<=max;i++){
			    		num = RadomNum.nextInt(max)+1;
			    	}	
			    	return num;
			    }

		 
	//��װͨ�õ�driver·��
		String  path(){
			return null;			
		}
		 
	//��װͨ�õ�ʹ��Ԫ��·���ļ�����������һ���ַ���
		void get() {
	}
}
