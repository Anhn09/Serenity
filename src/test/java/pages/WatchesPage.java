package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class WatchesPage extends PageObject {
    private final WebElementFacade NavigationWatches = $("//ul[@id='ui-id-1']//div[@class='items-after']//a[contains(@href,'watches/watches')]");
//    private final WebElementFacade NavigationWatches = $(By.xpath("//ul[@id='ui-id-1']//div[@class='items-after']//a[contains(@href,'watches/watches')]"));
    //    @FindBy(sclocator = "//ul[@id='ui-id-1']//div[@class='items-after']//a[contains(@href,'watches/watches')]")
//    WebElement NavigationWatches;
    public void navigateWatches() {
        $("//ul[@id='ui-id-1']//div[@class='items-after']//a[contains(@href,'watches/watches')]").waitUntilVisible().click();
    }
    public void selectWatch(String nameWatch){
        $(String.format("//a[contains(text(),'%s')]",nameWatch)).waitUntilVisible().click();
    }
    public void selectWatchColor(String nameColor){
        $(String.format("//div[@data-option-label='%s']",nameColor)).waitUntilVisible().click();
    }
    public void selectQuantityWatch(String quantity ){
        $(By.id("qty")).sendKeys(quantity);
    }
    public void clickAddToCart(){
        $(By.id("product-addtocart-button")).waitUntilVisible().click();
    }

}
