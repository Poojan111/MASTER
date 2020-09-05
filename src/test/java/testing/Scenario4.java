package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario4 {
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
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("test888pp@gmail.com");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Your personal information')]")));
	      driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("173523");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Us54556er");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("54");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("456");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("56575");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("   5   ");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='city']")).sendKeys("234");
	      Thread.sleep(3000);
	      Select drp=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	      drp.selectByVisibleText("Florida");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("23435343");
	      Thread.sleep(3000);
	      Select drp1=new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	      drp1.selectByVisibleText("United States");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("sfdgsfgfsf");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	      Thread.sleep(6000);
	      String s=driver.findElement(By.xpath("//div[@class='alert alert-danger']//child::p")).getText();
	      
	      String s2=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[1]")).getText();
	      String s3=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[2]")).getText();
	      String s4=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[3]")).getText();
	      String s5=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[4]")).getText();
	      String s6=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[5]")).getText();
	      
	      System.out.println(s);
		    System.out.println(s2);
		    System.out.println(s3);
		    System.out.println(s4);   
		    System.out.println(s5);
		    System.out.println(s6);
	 }
}
