package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F://Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		System.out.println(driver.getTitle());
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Script run successfully by person Y");
		driver.close();
	}

}
