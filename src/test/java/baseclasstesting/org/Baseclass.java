package baseclasstesting.org;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Baseclass {
	
	public static WebDriver driver;
	
	public static Actions a;
	public static Select s;
	public static Alert al;
	
	//---------BROWSER LAUNCH-----------//
	
	public static void  launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		}
	
			//----------LOAD URL-----------//
	public static void loadurl(String url) {
		driver.get(url);
	}
	
		//--------WINDOW MAXIMIZE---------//
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
			//----------SENDKEYS-----------//
	public static void fill(WebElement ele, String value) {
			ele.sendKeys(value);
		}
		
		//---------CLICK BUTTON------//
	public static void clickButton(WebElement ele) {
		ele.click();
	}
	
		//----print current url--------//
	public static void printUrl() {
	System.out.println(driver.getCurrentUrl());
	}
	
	//-------print Title--------//
	public static void printTitle() {
	System.out.println(driver.getTitle());
	}
	
	//-----drag and drop-----//
	public static void dragDrop(WebElement src, WebElement dst ) {
		
		Actions a= new Actions(driver);
		
	
		a.dragAndDrop(src, dst).perform();;
	}
	
		//-----------Right click---------//
	public static void rightClick(WebElement ele) {
		
		
		a.contextClick(ele).perform();
	}
	
	//---------doubleclick-------//
	public static void dclick(WebElement ele) {
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();

	}
	
	//---- Actions MoveToElement()------//
	
	public static  void movetoelement(WebElement ele) {
		Actions a= new Actions(driver);
			a.moveToElement(ele).perform();
			
	}
	
	//---Declaring ROBOT-----//
	
	//static Robot r= new Robot();
	
	
	//-------Robot Keypress----------//
	
	
	//public static  void kpress() {
	
	//	r.keyPress(KeyEvent.VK_ENTER);
	//}
	//-----------Robot KeyRelease()------//
	//private void krelease(int keycode) {
	//			r.keyRelease(keycode);
	//		}
		
	//-------------Declaring ----------Alerts---------//
			
			
			 
	//----------Alert Accept--------//
	public static void okay() {
		
		Alert al = driver.switchTo().alert();
			al.accept();
		}
	//----------Alert Dismiss------------//
	public static void close() {
		
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
		//---------Alert to insert value	 -----//
	public static void sendtext(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
	}
	
	//----Alert GetText-----//
	
	private void printtext() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
	}
	
	
		//------Select by index---------//
		
		public static void byindex(int index) {
			
			
			
			
			s.selectByIndex(index);
}
		
		//--------Select by value---------//
		
		public static void byValue(String value) {
			s.selectByValue(value);

		}
		
		//-----------Select by visible text---------//
		
		public static void byvisibletext(String vtext) {
			s.selectByVisibleText(vtext);

		}
		
		}
		
	
		
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	


