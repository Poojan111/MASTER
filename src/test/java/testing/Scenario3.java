package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario3 {

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
	      driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("testpp937@gmail.com");
	      driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Your personal information')]")));
	      driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	      Thread.sleep(3000);
	      String s=driver.findElement(By.xpath("//div[@class='alert alert-danger']//child::p")).getText();
	    /*  String st[] = null;
	      for(int i=1;i<=8;i++) {
	            st[i]=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)["+i+"]")).getText();
	      } */
	      String s2=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[1]")).getText();
	      String s3=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[2]")).getText();
	      String s4=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[3]")).getText();
	      String s5=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[4]")).getText();
	      String s6=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[5]")).getText();
	      String s7=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[6]")).getText();
	      String s8=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[7]")).getText();
	      String s9=driver.findElement(By.xpath("(//div[@class='alert alert-danger']//child::li)[8]")).getText();
	    
	      
	    System.out.println(s);
	    System.out.println(s2);
	    System.out.println(s3);
	    System.out.println(s4);   
	    System.out.println(s5);
	    System.out.println(s6);
	    System.out.println(s7);
	    System.out.println(s8);
	    System.out.println(s9);  	      
	    
	}

}
