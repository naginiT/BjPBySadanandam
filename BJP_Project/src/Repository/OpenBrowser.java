package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static WebDriver driver;
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Sadanandam_Projects\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
}
	public static void WindowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void LoginPageURL() {
		driver.get("http://localhost:8082/BJPApplication/LoginPage.jsp");
		
	}
	public static void AdminLoginPageURL() {
		driver.get("http://localhost:8082/BJPApplication/LoginAdmin.jsp");
		
	}
	public static void CloseApplication() {
		driver.quit();
	}
	
	
	
}
