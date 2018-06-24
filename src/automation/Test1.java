package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver kir=new ChromeDriver( );
		kir.get("http://newtours.demoaut.com/");
		kir.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(10000);
		kir.findElement(By.name("lastName")).sendKeys("kjhg");
	}

}
