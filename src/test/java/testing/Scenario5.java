package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5{

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\Selenium\\Chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php ");
		
	
		
		Thread.sleep(10000);
		
		Actions action=new Actions(driver);
		WebElement WomenEle=driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(WomenEle).perform();
		
		WebElement TshirtEle=driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		TshirtEle.click();
		
		Thread.sleep(2000);
		
		String FirstProductName=driver.findElement(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']")).getText();
				
		
		WebElement Searchbar=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		Searchbar.sendKeys(FirstProductName);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		if(driver.findElements(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']")).size() != 0){
			System.out.println("Search results displayed as Expected,PASSED!!");
			}else{
			System.out.println("Search Functionality is NOT working!!");
			}
		
		
	}

}
