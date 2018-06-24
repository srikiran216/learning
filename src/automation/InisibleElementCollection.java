package automation;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InisibleElementCollection
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		List<WebElement> ls=driver.findElements(By.xpath("//*[@class='ui fluid dropdown selection multiple']/div[2]/div"));
		System.out.println(ls.size());
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0; i<ls.size(); i++)
		{
			js.executeScript("var x=arguments[0].textContent; alert(x);", ls.get(i));
			String x=driver.switchTo().alert().getText();
			System.out.println(x);
			driver.switchTo().alert().dismiss();
		}

	}

}
