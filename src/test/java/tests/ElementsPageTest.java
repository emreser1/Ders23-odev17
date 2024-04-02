package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import steps.ElementsSteps;

public class ElementsPageTest extends BaseTest {
    ElementsSteps stepsApplied = new ElementsSteps();

    @Test(priority = 1)
    public void before() {
        pageManager.getElementsPage().openElements();
    }

    @Test(priority = 2)
    public void BtnButtonsClick() {
        stepsApplied.user_clicks_the_buttons_button();
    }

    @Test(priority = 3)
    public void clickMe() {
        Configuration.timeout = 30000;
        stepsApplied.user_clicks_click_me_button();
    }

    @Test(priority = 4)
    public void isClickMeTextVisible() {
        stepsApplied.you_have_done_a_dynamic_click_text_becomes_visible();
    }
}
