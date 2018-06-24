package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Opera 
{

		public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.opera.driver", "D:\\kiran\\SELENIUM\\RequiredSoftwares\\operadriver_win64\\operadriver.exe");
        ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\Opera\\launcher.exe");        
		@SuppressWarnings("deprecation")
		OperaDriver driver = new OperaDriver(options);

		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("VIJJU");
		driver.findElement(By.name("lastName")).sendKeys("JONNAGANTI");
		driver.findElement(By.name("phone")).sendKeys("6844548851");
		driver.findElement(By.name("userName")).sendKeys("vijju4u@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("kovvada punta, d/n 6-58-9");
		driver.findElement(By.name("address2")).sendKeys("BHIMAVARAM MANDALAM");
		driver.findElement(By.name("city")).sendKeys("BHIMAVARAM");
		driver.findElement(By.name("state")).sendKeys("ANDHRA PRADESH");
		driver.findElement(By.name("postalCode")).sendKeys("534201");
		driver.findElement(By.name("email")).sendKeys("vijju4u");
		driver.findElement(By.name("password")).sendKeys("kirakira23");
		driver.findElement(By.name("confirmPassword")).sendKeys("kirakira23");
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("register")).click();

	}

}
