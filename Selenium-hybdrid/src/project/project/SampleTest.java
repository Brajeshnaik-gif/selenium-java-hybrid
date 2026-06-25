package project.project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SampleTest {
	
   ChromeDriver driver;
  @Test
  public void Noukari() throws InterruptedException {
	  //driver.get("https://www.techlearn.in/admin");
	  driver.get("https://www.naukri.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login_Layer")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("rajesh");
	  Thread.sleep(3000);
	 // driver.findElement(By.id("user_login")).sendKeys("rajesh");
  }
  
  @Test
  public void Naukari() {
	  driver.get("https://www.instagram.com");
	  driver.navigate().to("https://flipkart.com");
	  driver.navigate().forward();
	  driver.navigate().back();
	  driver.navigate().refresh();
  }
  
  @BeforeTest
  public void beforeTest() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   
  }

}
