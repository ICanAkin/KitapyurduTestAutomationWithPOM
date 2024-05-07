import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ProductDetailPage extends BasePage {

    By addToCartButtonLocator = By.id("add-to-cart-button");

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    public boolean isOnProductDetailPage(){
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart(){
        click(addToCartButtonLocator);
    }

}
