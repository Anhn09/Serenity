package junit.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

@DefaultUrl("https://electronic.ec-suite.vn/")
public class HomePage extends PageObject {
    @FindBy(linkText = "English")
    public static WebElementFacade english;
    @FindBy(xpath = "//div[@id = 'switcher-language-trigger']")
    public static WebElementFacade clickSelect;

//    public static Performable selectLanguage() {
//        return Task.where(
//                clickSelect.click()
//        );
//    }

}
