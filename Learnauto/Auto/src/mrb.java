import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.thoughtworks.selenium.Wait;


public class mrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.myrightbuy.com");
		

		driver.findElement(By.xpath(".//*[@id='topMenuLoginSection']/a/span")).click();
		
	driver.findElement(By.xpath("//input[@id='txtEmailId'and@name='ctl00$ContentPlaceHolder1$txtEmailId']")).sendKeys("test@gmail.com");
		
		
		
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("passward");
		
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		String str=driver.findElement(By.id("lblMessage")).getText();
		
	    System.out.println(str);
	}

}
