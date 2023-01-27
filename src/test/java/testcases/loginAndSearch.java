package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pages.Hotel_app_login_page;
import pages.Hotel_app_search_page;

public class loginAndSearch {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Hotel_app_login_page hlogin = new Hotel_app_login_page (driver);
		Hotel_app_search_page hsearch = new Hotel_app_search_page (driver);
		
		hlogin.enterUserName("santosh13");
		hlogin.enterPassword("Snoopy1234");
		hlogin.clickLogin();
		
		hsearch.fillValues("Sydney","Hotel Creek", "1", "11/01/2023", "21/01/2023", "1");
		
	}
	
}
