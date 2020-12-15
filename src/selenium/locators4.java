package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators4 {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://money.rediff.com/gainers");

        //xpath axes
        //self node
        String selfnode=driver.findElement(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/self::a")).getText();
        System.out.println("the self node is "+selfnode);

        //parent node
        String parentnode=driver.findElement(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/parent::td")).getText();
        System.out.println("the parent node is "+parentnode);

        // child nodes
        List<WebElement> childnode=driver.findElements(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/ancestor::tr/child::*"));
        System.out.println("the no of child nodes are "+childnode.size());

        // ancestor node
        String ancestornode=driver.findElement(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/ancestor::tr")).getText();
        System.out.println("the no of ancestornode nodes are "+ancestornode);

        // following
        List<WebElement> followingtag=driver.findElements(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/following::*"));
        System.out.println("the no of following elements from the current html tag is "+ followingtag.size());

        // following siblings
        List<WebElement> followingsib=driver.findElements(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/ancestor::tr/following-sibling::*"));
        System.out.println("the following siblings are "+followingsib.size());

        //preceding
        List<WebElement> pre=driver.findElements(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/preceding::*"));
        System.out.println("the no of preceding nodes are- "+pre.size());

        //preceding siblings
        List<WebElement> presiblings=driver.findElements(By.xpath("//a[normalize-space()='SIL Investments Ltd.']/ancestor::tr/preceding-sibling::*"));
        System.out.println("the no of preceding siblings are- "+presiblings.size());
        driver.close();
    }
}
