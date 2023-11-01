package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.close();
      System.out.println("Created new Classs of snapdeal"); 
	}

}
