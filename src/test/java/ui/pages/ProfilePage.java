package ui.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

//Профиль
public class ProfilePage {
    private SelenideElement profileButton = $(MobileBy.id("ru.vkusvill:id/bottom_item_history"));
    private SelenideElement clearHistory = $(MobileBy.id("ru.vkusvill:id/btn_delete"));

    private SelenideElement[] profilePageElements = {profileButton, clearHistory};

    @Step("Отображение иконки \"Профиль\"")
    public void profileIconDisplaying() {
        profilePageElements[0].should(Condition.visible);
    }

    @Step("Отображение элементов страницы \"Профиль\"")
    public void profilePageElementsDisplaying() {
        profilePageElements[0].click();
        profilePageElements[1].should(Condition.visible);
    }

}