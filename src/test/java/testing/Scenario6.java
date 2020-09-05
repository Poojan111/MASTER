package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario6{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\Selenium\\Chromedriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php ");
		
	
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
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		sel.selectByVisibleText("L");
		
		driver.findElement(By.xpath("//a[@name='Blue']")).click();
	
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		driver.findElement(By.xpath("//p//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		Thread.sleep(2000);
		if(driver.findElements(By.xpath("//span[normalize-space()='On backorder']")).size() != 0){
			System.out.println("Order has been Placed successfully!!");
			}else{
			System.out.println("Order yet be Placed!!");
			}
		
		
	
	}
	

}
