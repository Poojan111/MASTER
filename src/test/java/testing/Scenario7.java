package testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\Selenium\\Chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php ");
		
		
			if(driver.findElements(By.xpath("//a[@title='Log me out']")).size()==1)
			{
				driver.findElement(By.xpath("//a[@title='Log me out']")).click();
				Thread.sleep(3000);
			}
			
			Actions action=new Actions(driver);
			WebElement WomenEle=driver.findElement(By.xpath("//a[@title='Women']"));
			action.moveToElement(WomenEle).perform();
			
			WebElement TshirtEle=driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
			TshirtEle.click();
			
			Thread.sleep(2000);
			
			//There is No Second Product, only one product showing in Search Results,So wrote script for First product only
			
			WebElement FirstProductNameEle=driver.findElement(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']"));
			action.moveToElement(FirstProductNameEle).perform();
		
			driver.findElement(By.xpath("//a[normalize-space()='Add to Wishlist']")).click();
			
			Thread.sleep(2000);
			
			String AcualErrorMessage=driver.findElement(By.xpath("//p[text()='You must be logged in to manage your wishlist.']")).getText();

			String ExpectedErrorMessage="You must be logged in to manage your wishlist.";
			
			System.out.println(AcualErrorMessage);
			Assert.assertEquals(AcualErrorMessage,ExpectedErrorMessage);
			
			
			
			
	}

}
