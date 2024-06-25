package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CommonPage extends PageObject {
    public void selectLanguage(){
        $("//div[@id = 'switcher-language-trigger']").waitUntilVisible().click();
        $(By.linkText("English")).waitUntilVisible().click();
    }
    public void clickViewCart(){
        $("//div[@class='minicart-wrapper']//a[contains(@href,'cart')]").waitUntilVisible().click();
    }
}
