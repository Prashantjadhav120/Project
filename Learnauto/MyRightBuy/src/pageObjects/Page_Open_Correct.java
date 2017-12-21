package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testCases.Home_Page;

public class Page_Open_Correct {
	
	public static WebElement element = null;
	
 void Open_Home_Page(WebDriver driver){
		
		String url = driver.getCurrentUrl();
		System.out.println("The Url is : "+ url);
		
		
		
	}

}
