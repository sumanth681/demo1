import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class GoogelSearch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.google.com");
        
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("TechEfficio");

       // searchBar.submit();

        WebElement search = driver.findElement(By.className("gNO89b"));
        search.click();

        String title  = driver.getTitle();
        System.out.println(title);
        driver.close();


    }
}
