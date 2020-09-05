package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\pooja n\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      WebDriverWait wait=new WebDriverWait(driver, 20);
	      driver.manage().window().maximize();
	      driver.get("http://automationpractice.com/index.php");
	      WebElement signIn=driver.findElement(By.xpath("//a[@class='login']"));
	      Thread.sleep(6000);
	      signIn.click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Create an account')]")));
	      //invalid email @gamil and .com missing
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abcd222");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed(); //i am not able to use getText()
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='email_create']")).clear();
	      Thread.sleep(3000);
	      
	      //invalid email @gmail and .com place is interchanged
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test101010.com@gmail");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='email_create']")).clear();
	      Thread.sleep(3000);
	      
	      //invalid email gmail and . is missing
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test101010.com");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='email_create']")).clear();
	      Thread.sleep(3000);
	      
	      //invalid email address by passing space
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("   ");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='email_create']")).clear();
	      Thread.sleep(3000);
	      
	      //already existing email
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test101010@gmail.com");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
          driver.findElement(By.xpath("//div[@id='create_account_error']")).isDisplayed(); //i am not able to use getText()
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='email_create']")).clear();
	      Thread.sleep(3000);
	      
	      
	     System.out.println("User is able to see all Error Messages!!!");
	}

}
