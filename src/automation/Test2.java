package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test2
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\kiran\\SELENIUM\\RequiredSoftwares\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("VIJJU");
		driver.findElement(By.name("lastName")).sendKeys("JONNAGANTI");
		driver.findElement(By.name("phone")).sendKeys("6844548851");
	}

}
