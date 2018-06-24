package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com");
		WebDriverWait w=new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Not Now'])[2]")));
		driver.findElement(By.xpath("(//button[text()='Not Now'])[2]")).click();
		driver.findElement(By.xpath("(//button[text()='Not Now'])[1]")).click();

	}

}
