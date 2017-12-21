package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dslist_buttons {

	
	public static WebDriver driver;
	static WebElement element=null;
	
	public static WebElement ddlist_buttons(WebDriver driver)
	{
		
     boolean s=driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).isSelected();
     
     System.out.println(s);
     
     Select dlcountry=new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
     
     dlcountry.selectByIndex(1);
     
Select dlmonth=new Select(driver.findElement(By.xpath(".//*[@id='mm_date_8']")));
     
     dlmonth.selectByIndex(1);
     
Select dlday=new Select(driver.findElement(By.xpath(".//*[@id='dd_date_8']")));
     
     dlday.selectByIndex(1);
     
Select dlyear=new Select(driver.findElement(By.xpath(".//*[@id='yy_date_8']")));
     
     dlyear.selectByIndex(1);
     
     //driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div[1]/input[1]")).click();
     
     //driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div[1]/input[2]")).click();
     
     //driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

	
     System.out.println("Register Sucessfull");
     
     return element;
     
     
     
}
	
}
