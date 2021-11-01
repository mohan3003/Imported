package baseclasstesting.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	
	public static WebDriver driver;
	public static Actions ac;
	public static Alert al;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	public static Robot r;
	
//Browser Launch
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
//load URL
	public static void loadurl(String url) {
		driver.get(url);

}
//Maximize window
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
// printing current URL
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
//send keys.
	
	public static void fill(WebElement element, String values ) {
		element.sendKeys(values);
	}
//Get Attribute
	
	public static void enterdTxt(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
//click button
	
	public static void btnclick(WebElement element) {
		element.click();
	}
//printing TITLE
	public static void printTitle() {
		System.out.println(driver.getTitle());
		}
	
//Close Browser
	public static void closeBrowser() {
		driver.close();
	}
	
	
//  ACTIONS
//Movetoelement
	public static void toMove(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
}
	
//Double Click
	public static void dclick(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
//Right click
	
	public static void rightclick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
//Dropdown
	
	private void toDropDown(WebElement src, WebElement dst) {
		ac= new Actions(driver);
		ac.dragAndDrop(src, dst).perform();
	}
//ALERT
	//Alert OK accept
	
	public static void alertAccept() {
		al = driver.switchTo().alert();
		al.accept();
	}
//Alert dismiss
	public static void alertDismiss() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

//Alert text
	public static void alertText(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);
	}
//Alert Print text
	public static void aletprintText() {
		al = driver.switchTo().alert();
		al.getText();
	}
//SELECT
//Select by Index
	public static void selectIndex(WebElement element , int i) {
		s = new Select(element);
		s.selectByIndex(i);
	}
//Select by text
	public static void selectText(WebElement element ,String date) {
		   s = new Select(element);
		   s.selectByVisibleText(date);
		}
//Select by vlaue
	public static void selectValue(WebElement element , String value) {
		   s = new Select(element);
		   s.selectByVisibleText(value);
		}
//multiple
	
	public static void multiple(WebElement element) {
		s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
//Deselect by Index
	public static void deselectIndex(WebElement element, int i) {
		s= new Select(element);
		s.deselectByIndex(i);
	}
//Deselect by Text
	
	public static void deselectVisibleText(WebElement element, String txt) {
		s = new Select(element);
		s.deselectByVisibleText(txt);
	}
//Delsect by value
	public static void deselectValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}
//Deselect All
	public static void deselect(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}
//ROBOT ENTER Keypress

	public static void keypress() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);

	}
//Robot ENTER Keyrelease
	public static void krelease() throws AWTException {
		r= new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);

	}
//Screenshot
	public static void screenshot(String value) throws IOException {
		ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\USER\\eclipse-workspace\\ProjectStar1"+value+".png");
		FileUtils.copyFile(src, dest);

	}
//Java script executior scrolldown
	public static void scrolldwn(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
//jve scroll Up
	public static void Scrollup(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);	
	}
//sendkeys JVE
	public static void jveSendkeys( WebElement element , String txt) {
		js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',"+txt+")", element);
		}
//jve get value
	
	public static String jveGetValue(WebElement element) {
		js = (JavascriptExecutor)driver;
	String txt  = (String) js.executeScript("return arguments[0].getAttribute('value')", element);
	return txt;
	}
//iFrame 
	//switch by frame Id
	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}
//switch by frame name
	public static void frameName(String name) {
		driver.switchTo().frame(name);	
	}

//switch by frame index
	public static void frameIndex(int i) {
		driver.switchTo().frame(i);
	}
//switch by webelemet reference
	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
//switch to parent frame
	public static void frameParent() {
		driver.switchTo().parentFrame();
	}
//windows handling
//get window hadle
	public static void windowId() {
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
	}
//All ID's
	
	public static void windowallIDs() {
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
}
	
//multiple win handling
	public static void allwindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		li.addAll(windowHandles);
		String child = li.get(index);
		driver.switchTo().window(child);
	}
	
//robot ctrl+C
	public static void copy() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
//robot paste
	public static void paste() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	
//robot Cut
	
	public static void cut() throws AWTException {
		r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}
//dynamicwait
	
	public static void dywait(long a, TimeUnit t) {
		driver.manage().timeouts().implicitlyWait(a, t);
}
	
//webdriver wait /alert
	
	public static void webdwait(long t) {
		WebDriverWait w= new WebDriverWait(driver, t);
		w.until(ExpectedConditions.alertIsPresent());
		al = driver.switchTo().alert();
		al.accept();
	}
	
//excel get data. 
	
	public static String getdata(int rowNumber, int cellNumber) throws IOException {
	
		File f= new File("C:\\Users\\USER\\eclipse-workspace\\MavenBaseClass\\target\\exceldata\\registerDetails.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r= s.getRow(rowNumber);
		Cell c= r.getCell(cellNumber);
		int cellType = c.getCellType();
		
		String value= "";
		 if (cellType==1) {
			 
			  value = c.getStringCellValue();
			 System.out.println(value);
			
		}else if (cellType==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				
				Date date = c.getDateCellValue();
				
				SimpleDateFormat si= new SimpleDateFormat("MM-dd-yyyy");
				
				String format = si.format(date);
				
				System.out.println(format);
				
		}else {
			
			double d = c.getNumericCellValue();
			//typecasting
			long l= (long) d;
			System.out.println(l);
			}
	}
		 
 return value;
	}
// FInding the starttime/date
	public static void printStartTime() {
		 Date d= new Date();
		 System.out.println(d);

	}
	
//Finding End date and time
	
	
	public static void printEndTime() {
		 Date d= new Date();
		 System.out.println(d);

	}
	
	
		

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
