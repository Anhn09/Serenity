package tests;

import pages.CommonPage;
import pages.HomePage;
import pages.NavigationTo;
import pages.WatchesPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestCase {
    @Steps
    public NavigationTo navigationTo;
    @Steps
    public WatchesPage watchesPage;
    @Steps
    public HomePage homePage;
    @Steps
    CommonPage commonPage;

    @BeforeEach
    public void setUp() throws InterruptedException {
        navigationTo.openHomePage();
        Thread.sleep(10000);
        commonPage.selectLanguage();
    }
    @Test
    @Title("Verify Add Cart function")
    public void VerifyAddCartFunction() throws InterruptedException {
        navigationTo.openWatchesPage();
        watchesPage.selectWatch("Apple Watch Series 10");
        watchesPage.selectWatchColor("Đen");
        watchesPage.selectQuantityWatch("1");
        watchesPage.clickAddToCart();
        commonPage.clickViewCart();
        Thread.sleep(10000);
    }

}
