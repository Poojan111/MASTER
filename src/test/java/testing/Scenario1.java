package testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1{
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
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test44883@gmail.com");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Your personal information')]")));
	      driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Test");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("User");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Liontiger@123");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Test");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("User");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("#23 Test, 45, TestCompany");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bangalore");
	      Thread.sleep(3000);
	      Select drp=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	      drp.selectByVisibleText("Florida");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("32006");
	      Thread.sleep(3000);
	      Select drp1=new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	      drp1.selectByVisibleText("United States");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9812345665");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	      Thread.sleep(3000);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='info-account']")));
	      String actual="Welcome to your account. Here you can manage all of your personal information and orders.";
	      String expected=driver.findElement(By.xpath("//p[@class='info-account']")).getText();
	      System.out.println(expected);
	      Assert.assertEquals(actual, expected);    
	      driver.quit();
	  }
}
