import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendingInput {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://the-internet.herokuapp.com/login");

        String title  = driver.getTitle();
        System.out.println(title);
        
         WebElement usernameEle = driver.findElement(By.id("username"));
         usernameEle.sendKeys("tomsmith");

         WebElement passwordEle = driver.findElement(By.id("password"));
         passwordEle.sendKeys("SuperSecretPassword!");

         WebElement loginBtn = driver.findElement(By.className("radius"));
         loginBtn.click();
         
         String expUrl = "https://the-internet.herokuapp.com/secure";
         if(expUrl.equals(driver.getCurrentUrl())){
            System.out.println("Successfully Logined!!!");
         }else{
            System.out.println("Un-Successful!!!");
         }

         driver.quit();
        
    }
}
