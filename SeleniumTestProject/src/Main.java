import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.setProperty("webdriver.chrome.driver", "F:\\drivers\\chromedriver.exe");
        //create chrome instance
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        WebElement element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("abbaas");
        WebElement button = driver.findElement(By.xpath("//input[@name='login']"));
        button.click();
    }
}