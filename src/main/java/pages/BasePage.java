
package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BasePage {

	/********* Used for Automation ************/
	protected static List<Map<String, String>> mass;
	protected static List<WebElement> listOfElements;
	protected static String url = "https://pontoeletronico.programmers.com.br/portalrh/";
	public static WebDriver driver;


	/********* Utils ************/
	public static void acessaHomePage() {
		// WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:\\Projetos\\PontoEletronico\\src\\main\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}


public WebDriver getDriver() {
	return driver;
}

	public static void finalizar() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.close();

		} catch (Exception e) {

		}
	}

	public static void preencher(By by, String value) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(by);
		Element.sendKeys(value);

	}

	public static void clicar(By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Element = driver.findElement(by);
		Element.click();

	}
}
