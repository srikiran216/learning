package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyShow {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com");
		driver.findElement(By.xpath("//*[@class='location-search-container nav-tip']/div[3]/descendant::ul[1]/li[4]/a/span")).click();
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='wzrk-button-container']/button[1]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='wzrk-button-container']/button[1]")).click();

	}

}
