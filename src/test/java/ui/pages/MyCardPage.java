package ui.pages;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

//Моя карта
public class MyCardPage extends MainPage{

    private SelenideElement myCardButton = $(MobileBy.id("ru.vkusvill:id/bottom_item_profile"));
    private SelenideElement startButton = $(MobileBy.id("ru.vkusvill:id/btn"));
    private SelenideElement newYearImage =  $(MobileBy.id("ru.vkusvill:id/iv_icon"));
    private SelenideElement newYearTitle = $(MobileBy.xpath("//*[@text='Больше хорошего\n" + "на Новый год']"));
    private SelenideElement myCardPageNewYearDescription = $(MobileBy.xpath("//*[@text='Каждый день как по волшебству в вашем приложении появляется скидка 20% на 12 новых товаров, подобранных специально для вас. Только в декабре – не пропустите.']"));
    private SelenideElement enterTitle = $(MobileBy.xpath("//*[@text='Введите номер телефона']"));
    private SelenideElement inputFieldNumber = $(MobileBy.id("ru.vkusvill:id/editText"));
    private SelenideElement inputFiledNumberMask =$(MobileBy.xpath("//*[@text='+7 (999) 999-99-99']"));
    private SelenideElement continueButton = $(MobileBy.xpath("//*[@text='Продолжить']"));
    private SelenideElement userConfirmText = $(MobileBy.xpath("//*[@text='Соглашаюсь получать новости\n" + "и специальные предложения']"));
    private SelenideElement confirmToggle = $(MobileBy.id("ru.vkusvill:id/cb_news"));
    private SelenideElement agreementText =  $(MobileBy.xpath("//*[@text='Нажимая кнопку «Продолжить», соглашаюсь\n" + "с офертой и политикой конфиденциальности.']"));



    private SelenideElement[] myCardPageElements = {
            enterTitle,
            inputFieldNumber,
            inputFiledNumberMask,
            userConfirmText,
            continueButton,
            confirmToggle,
            agreementText
    };

    private SelenideElement[] startCardCreatePageElements = {
            startButton,
            newYearImage,
            newYearTitle,
            myCardPageNewYearDescription,
    };

    @Step("Отображение иконки \"Моя карта\"")
    public MyCardPage myCardIconDisplaying() {
        myCardButton.should(Condition.visible);
        return this;
    }

    @Step("Отображение элементов страницы старта создания карты")
    public MyCardPage startCardPageElementsDisplaying() {
        myCardButton.click();
        for (SelenideElement element : startCardCreatePageElements) {
            element.should(Condition.visible);
        }
        return this;
    }

    @Step("Отображение элементов страницы оформления карты")
    public MyCardPage createCardPageElementsDisplaying() {
        startCardCreatePageElements[0].click();
        for (SelenideElement element : myCardPageElements) {
            element.should(Condition.visible);
        }
        return this;
    }
}
