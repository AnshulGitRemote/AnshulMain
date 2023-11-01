package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTest() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  System.out.println("I made change");
	  System.out.println("i made change again");
	  driver.close();
	  Thread.sleep(4000);
  }
}
