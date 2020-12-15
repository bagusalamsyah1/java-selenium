package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators5 {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");

        //path axes
        //self node
        driver.findElement(By.xpath("//input[@id='company']/self::input")).sendKeys("ABC");

        //parent node
//        String parent=driver.findElement(By.xpath("//input[@id='company']/parent::*")).getText();
//        System.out.println("the parent value is --"+parent);

        // child nodes
        List<WebElement> childnodes=driver.findElements(By.xpath("//input[@id='company']/parent::form/child::*"));
        System.out.println("the no of child nodes are--"+childnodes.size());

        //following nodes
        List<WebElement> foll=driver.findElements(By.xpath("//input[@id='company']/following::*"));
        System.out.println("the no of following nodes are--"+foll.size());

        //precending
        List<WebElement> pre=driver.findElements(By.xpath("//input[@id='company']/preceding::*"));
        System.out.println("the no of preceding nodes are- "+pre.size());

    }
}
