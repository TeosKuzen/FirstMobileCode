package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;
import java.time.Duration;

//Страница входа
public class MainPage {

    private SelenideElement buttonEnter = $(MobileBy.id("ru.vkusvill:id/btn_enter"));


    @Step("Нажимаем на кнопку \"НАЧАТЬ\" на стартовом экране")
    public MainPage login() {
        buttonEnter.should(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }
}
