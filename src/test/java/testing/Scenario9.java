package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario9{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\Selenium\\Chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php ");
		
		Thread.sleep(3000);
		WebElement SignIn=driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		SignIn.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("test44883@gmail.com");
		WebElement Pass=driver.findElement(By.xpath("//input[@name='passwd']"));
		Pass.sendKeys("Liontiger@123");
		
		WebElement Submit=driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		Submit.click();
		
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		WebElement WomenEle=driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(WomenEle).perform();
		Thread.sleep(2000);
		WebElement TshirtEle=driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		TshirtEle.click();
		
		Thread.sleep(4000);
		
		WebElement FirstProductName=driver.findElement(By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']"));
		action.moveToElement(FirstProductName).perform();
	
		driver.findElement(By.xpath("//span[text()='More']")).click();
		
		Thread.sleep(4000);
		
		
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		sel.selectByVisibleText("M");
		
		driver.findElement(By.xpath("//a[@name='Blue']")).click();
	
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		
	
		String TotalPrice_Q1=driver.findElement(By.xpath("//span[@id='total_price']")).getText();
		TotalPrice_Q1=TotalPrice_Q1.substring(1);
		//System.out.println(TotalPrice_Q1);
		double p1=Double.parseDouble(TotalPrice_Q1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		Thread.sleep(3000);
		String TotalPrice_Q2=driver.findElement(By.xpath("//span[@id='total_price']")).getText();
		TotalPrice_Q2=TotalPrice_Q2.substring(1);
		//System.out.println(TotalPrice_Q2);
		double p2=Double.parseDouble(TotalPrice_Q2);
		//removing the shipment price
		double p2_final=p2-2;
		double p1_final=p1-2;
		
		
		if((p2_final)==(p1_final*2))
		{
			System.out.println("Total Price is reflect correctly with users changes in the Cart");
		}
		else
		{
			System.out.println("Total Price is NOT reflect correctly with users changes in the Cart");
		}
		
		

	}

}
