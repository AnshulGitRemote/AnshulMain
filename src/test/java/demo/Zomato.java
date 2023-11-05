package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		  driver.get("https://www.zomato.com/");
		  driver.close();
		  Thread.sleep(4000);

	}

}
