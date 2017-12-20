package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage  extends Pages {

	static WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	//封装业务方法：Busness，考虑业务步骤的先后顺序
	
   public static  void login(String buttonName) {
	// TODO Auto-generated method stub
    click(buttonName,driver);
}


}
