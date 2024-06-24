package junit.tests;

import junit.pages.HomePage;
import junit.pages.NavigationTo;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class TestCase {
    @CastMember
    Actor actor;
    @Steps
    public HomePage homePage;
//    @BeforeEach
//    public void setUp() throws InterruptedException {
//        driver.get("https://electronic.ec-suite.vn/");
//        Thread.sleep(10000);
//    }
    @Test
    public void VerifyAddCartFunction(){
        actor.attemptsTo(
                NavigationTo.homePage()
        );
    }

}
