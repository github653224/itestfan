package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage  extends Pages {

	static WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	//��װҵ�񷽷���Busness������ҵ������Ⱥ�˳��
	
   public static  void login(String buttonName) {
	// TODO Auto-generated method stub
    click(buttonName,driver);
}


}
