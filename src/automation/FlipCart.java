package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FlipCart 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		FluentWait w=new FluentWait(driver).pollingEvery(5, TimeUnit.MILLISECONDS).withTimeout(80, TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='✕']")));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("jackets");
		driver.findElement(By.className("_2BhAHa")).click();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]"));
		WebElement e1=driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getX();
		System.out.println(x+" "+y);	
		Actions a=new Actions(driver);
		a.moveToElement(e);
		Thread.sleep(5000);
		a.dragAndDropBy(e, x-10, y).build().perform();
		Thread.sleep(10000);
		a.dragAndDropBy(e, x-20, y+30).build().perform();
	}

}
