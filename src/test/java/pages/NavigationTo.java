package pages;

import net.serenitybdd.annotations.Step;

public class NavigationTo {
    HomePage homePage;
    WatchesPage watchesPage;
    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void openWatchesPage() {
        watchesPage.navigateWatches();
    }
}
