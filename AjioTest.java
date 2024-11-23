package com.ajio.MiniProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
public class AjioTest {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        driver.manage().window().maximize();
            // Test Case 1 and 2: Open Home Page and maximize
            driver.get("https://www.ajio.com");
            String title = driver.getTitle();
            System.out.println("Window is maximized");
            System.out.println("Home Page Title: " + title);

            // Test Case 3: Search for a product
            WebElement searchBox = driver.findElement(By.name("searchVal"));
            searchBox.sendKeys("Shirts");
            WebElement searchButton = driver.findElement(By.className("ic-search"));
            searchButton.click();
            System.out.println("Searched for Shirts");

            // Test Case 4: Navigate to Men category
            WebElement menCategory = driver.findElement(By.linkText("MEN"));
            if (menCategory != null) {
                menCategory.click();
                System.out.println("Navigated to Men category");
            } else {
                System.out.println("Men category link not found");
            }

            // Test Case 5: Filter by brand
            driver.get("https://www.ajio.com/men-shirts/c/830216013?query=%3Arelevance%3Abrand%3APuma&gridColumns=3");
                System.out.println("Filtered by brand Puma");

             // Test Case 6: Sort by price
                driver.get("https://www.ajio.com/men-shirts/c/830216013?query=%3Aprce-asc%3Apricerange%3ARs.2501-5000%3Apricerange%3AAbove%20Rs.5000&gridColumns=3&segmentIds=");                
                System.out.println("Sorted by price (low to high)");
                
             // Test Case 7: Select a product
                WebElement product = driver.findElement(By.cssSelector(".item:nth-child(1)"));
                product.click();
                System.out.println("Selected the first product");
                
             //To transfer control to another tab
                ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
                System.out.println(tabs.size());
                driver.switchTo().window(tabs.get(1));
             //Test Case 8:Select size
                
                driver.findElement(By.xpath("//*[text()='S']")).click();
                System.out.println("Selected Size S");
                
             // Test Case 9: Add to cart
                driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
                System.out.println("Product added to bag");
                Thread.sleep(100);
               
            //Test Case 10 and 11:Search Kurta
                driver.get("https://www.ajio.com/c/830303011");
                System.out.println("Navigated to Women's category");
                System.out.println("Searched for kurtas");
                
            //Test Case 12:Order high to low
                driver.get("https://www.ajio.com/c/830303011?query=%3Aprce-desc&gridColumns=3");
                System.out.println("Sorted by price (high to low)");
                
             // Test Case 13: Select second product
                WebElement second = driver.findElement(By.cssSelector(".item:nth-child(2)"));
                second.click();
                System.out.println("Selected the first product");
                
              //To transfer control to another tab
                ArrayList<String> tab4=new ArrayList<String>(driver.getWindowHandles());
                System.out.println(tab4.size());
                driver.switchTo().window(tab4.get(2));
                
             //Test case 14:Select size 
                driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock ' and @role='button' and @tabindex='0']/span[text()='S']")).click();
                System.out.println("Selected Size S");
                
             // Test Case 15: Add to cart
                driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
                System.out.println("Product added to bag");
                Thread.sleep(50);
              
             //Test Case 16 and 17:Search for 2-5 years old
                driver.get("https://www.ajio.com/s/2-to-5-years-4867-45972");
                System.out.println("Navigated to Kid's category");
                System.out.println("Searched by year");
                
            //Test Case 18:Select 3rd product
                WebElement third = driver.findElement(By.cssSelector(".item:nth-child(3)"));
                third.click();
                System.out.println("Selected the third product");
                
              //Test Case 19:To transfer control to another tab
                ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
                System.out.println(tab1.size());
                driver.switchTo().window(tab1.get(3));
             
             //Test Case 20:Select size 
                driver.findElement(By.xpath("//div[@class='oval size-variant-item size-instock ' and @role='button' and @tabindex='0']//span[text()='3-4Y']")).click();
                System.out.println("Selected Size 3-4 years old");
                
             // Test Case 21: Add to cart
                driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
                System.out.println("Product added to bag");
                Thread.sleep(50);
  
            //Test Case 22 and 23:Sort by what's new
                driver.get("https://www.ajio.com/s/beauty-5269-65820?query=%3Anewn&curated=true&curatedid=beauty-5269-65820&gridColumns=3");
                System.out.println("Navigated to Beauty category");
                System.out.println("Sorted by what's new");
                
            //Test Case 24:Select 4th product
                WebElement fourth = driver.findElement(By.cssSelector(".item:nth-child(4)"));
                fourth.click();
                System.out.println("Selected the fourth product");
            
            //Test Case 25:To transfer control to another tab
                ArrayList<String> tab2=new ArrayList<String>(driver.getWindowHandles());
                System.out.println(tab2.size());
                driver.switchTo().window(tab2.get(4));
                
           //Test Case 26:Add to bag
                driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
                System.out.println("Product added to bag");
                Thread.sleep(50);
           
         //Test Case 27 and 28:Move to home decor
               driver.get("https://www.ajio.com/c/8312");
               System.out.println("Navigated to home and kitchen category");
               System.out.println("Moved to home decor");
               
        //Test Case 29:Select 5th product
               WebElement fifth = driver.findElement(By.cssSelector(".item:nth-child(5)"));
               fifth.click();
               System.out.println("Selected the fifth product");
         
             //Test Case 30:To transfer control to another tab
               ArrayList<String> tab3=new ArrayList<String>(driver.getWindowHandles());
               System.out.println(tab3.size());
               driver.switchTo().window(tab3.get(5));
               
             //Test Case 31:Add to bag
               driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
               System.out.println("Product added to bag");
               Thread.sleep(50);
               
             //Test Case 32:Go to Bag
               WebElement goToBag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GO TO BAG']")));
               goToBag.click();
               System.out.println("Navigated to bag");

         
            driver.quit();
    }
}

