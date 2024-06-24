package junit.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigationTo {
    @Step
    public static Performable homePage() {
        return Task.where(
        Open.browserOn().the(HomePage.class)
        );
    }

    @Step
    public static Performable Pages() {
        return Task.where(
                Open.browserOn().the(WatchesPage.class)
        );
    }
}
