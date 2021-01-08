package sel;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Saffire {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F://Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://spark.dev3.saffire.dev/");


		driver.findElement(By.xpath("//input[@id='MainContent_content_tbxUsername']")).sendKeys("avish@saffire.com");

		driver.findElement(By.xpath("//input[@id='MainContent_content_tbxPassword']")).sendKeys("Avish@9760");

		driver.findElement(By.id("MainContent_content_lbtn_login")).click();

		Thread.sleep(6000);

		Actions a=new Actions(driver);

		WebElement commerce=driver.findElement(By.xpath("//li[@class='headerBarItem navSettings']/a"));

		a.moveToElement(commerce).build().perform();

		Thread.sleep(8000);


		//List<WebElement> sublist=driver.findElements(By.xpath("//li[@class='headerBarItem navSettings']/ul[@class='headerBarSubNav']"));

		WebElement reports=driver.findElement(By.xpath("//ul[@class='headerBarSubNav']/li[2]/a[@id='Nav1_rptr_sales_uc_navItem_1_hlnk_heading_1']"));

		reports.click();
		
		/*for(int i=0;i<sublist.size();i++)
		{
			WebElement item=sublist.get(i);
			
			String values=item.getText();
			
			System.out.println(values);

			if(values.equalsIgnoreCase("REPORTS"))
			{
				System.out.println("enter in IF loop");
				
				//a.moveToElement(reports).build().perform();
			   // item.click();
				
				break;
			}

			//a.moveToElement(reports).click().build().perform();
		}
		
*/
		//driver.close();
	}

}
