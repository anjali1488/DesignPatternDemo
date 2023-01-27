package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotel_app_login_page {

	WebDriver driver;
	public Hotel_app_login_page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
		// TODO Auto-generated method stub

		By usr_name = By.id("username");
		
		By usr_pwd = By.id("password");
		
		By lgn_btn = By.id("login");
		
		
		public void enterUserName(String userName)
		{
			
			driver.findElement(usr_name).sendKeys(userName);
		}
		
		public void enterPassword(String password)
		{
			
			driver.findElement(usr_pwd).sendKeys(password);
		}
		
		public void clickLogin()
		{
			driver.findElement(lgn_btn).click();
			
		}
		
		
		
	}


