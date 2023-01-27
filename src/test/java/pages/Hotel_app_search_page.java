package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_app_search_page {
	WebDriver driver;
	
	public Hotel_app_search_page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By location_dd = By.xpath("//select[@id='location']");
	By hotel_value = By.xpath("//select[@id='hotels']");
	By Roomtype_value = By.xpath("//select[@id='room_type']");
	By Number_of_rooms = By.id("room_nos");
	By Check_in_Date = By.id("datepick_in");
	By Check_out_date = By.id("datepick_out");
	By Adults_per_room = By.id("adult_room");
	By Child_per_room = By.id("child_room");
	By Search_button = By.id("Submit");
	By reset_button = By.xpath("//input[@id='Reset']");

	//By select_radiobutton_1 = By.id("radiobutton_1");
	//By continue_btn = By.id("continue")
	
	public void fillValues(String Location, String Hotels, String Rooms, String inDate, String outDate, String numOfAdults)
	{
		new Select(driver.findElement(location_dd)).selectByValue(Location);
		new Select(driver.findElement(hotel_value)).selectByValue(Hotels);
		
		//driver.findElement(Number_of_rooms).clear();
		new Select(driver.findElement(Number_of_rooms)).selectByValue(Rooms);
		
		driver.findElement(Check_in_Date).clear();
		driver.findElement(Check_in_Date).sendKeys(inDate);
		
		driver.findElement(Check_out_date).clear();
		driver.findElement(Check_out_date).sendKeys(outDate);
		
	   // driver.findElement(Adults_per_room).clear();
		new Select(driver.findElement(Adults_per_room)).selectByValue(numOfAdults);
		
	
		driver.findElement(Search_button).click();


	}
	}

	