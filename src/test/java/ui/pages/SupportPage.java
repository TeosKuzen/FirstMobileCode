package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

// Поддержка
public class SupportPage {

    private SelenideElement supportButton = $(MobileBy.xpath("//android.widget.FrameLayout[@content-desc=\"Поддержка\"]"));
    private SelenideElement title = $(MobileBy.xpath("//*[@text='Поддержка']"));
    private SelenideElement weLoveToCommunicateHeader = $(MobileBy.xpath("//*[@text='Мы любим общаться']"));
    private SelenideElement chatTab = $(MobileBy.xpath("//*[@text='Чат']"));
    private SelenideElement phoneTab = $(MobileBy.xpath("//*[@text='Телефон']"));
    private SelenideElement mailTab = $(MobileBy.xpath("//*[@text='Почта']"));
    private SelenideElement vkButton = $(MobileBy.xpath("//android.widget.RelativeLayout[1]"));
    private SelenideElement youTubeButton = $(MobileBy.xpath("//android.widget.RelativeLayout[2]"));
    private SelenideElement telegramButton = $(MobileBy.xpath("//android.widget.RelativeLayout[3]"));
    private SelenideElement tikTokButton = $(MobileBy.xpath("//android.widget.RelativeLayout[4]"));
    private SelenideElement whatsUpButton = $(MobileBy.xpath("//android.widget.RelativeLayout[5]"));
    private SelenideElement referenceHeader = $(MobileBy.xpath("//*[@text='Справка']"));
    private SelenideElement fAQHeader = $(MobileBy.xpath("//*[@text='Часто задаваемые вопросы']"));
    private SelenideElement orderByPhoneLabelTitle = $(MobileBy.xpath("//*[@text='Как сделать заказ по телефону?']"));
    private SelenideElement vkusVillLabelTitle = $(MobileBy.xpath("//*[@text='ВкусВилл Праздник']"));
    private SelenideElement vkusVillLabelDescription = $(MobileBy.xpath("//*[@text='Кейтеринг, торты и подарки']"));
    private SelenideElement deliveringLabelTitle = $(MobileBy.xpath("//*[@text='Доставка']"));
    private SelenideElement deliveryLabelTitleDescription = $(MobileBy.xpath("//*[@text='Бесплатно привезём вкусные и полезные продукты']"));
    private SelenideElement pickUpLabelTitle = $(MobileBy.xpath("//*[@text='Самовывоз']"));
    private SelenideElement pickUpLabelTitleDescription = $(MobileBy.xpath("//*[@text='Оформите онлайн и заберите готовый заказ в магазине']"));

    private SelenideElement[] Elements = {
            supportButton,
            title,
            weLoveToCommunicateHeader,
            chatTab,
            phoneTab,
            mailTab,
            vkButton,
            youTubeButton,
            telegramButton,
            tikTokButton,
            whatsUpButton,
            referenceHeader,
            fAQHeader,
            orderByPhoneLabelTitle,
            deliveringLabelTitle,
            deliveryLabelTitleDescription,
            vkusVillLabelTitle,
            vkusVillLabelDescription,
            pickUpLabelTitle,
            pickUpLabelTitleDescription
    };

    @Step("Отображение иконки \"Поддержка\"")
    public SupportPage supportIconDisplaying() {
        Elements[0].should(Condition.visible);
        return this;
    }

    @Step("Отображение элементов страницы \"Поддержка\"")
    public void ElementsDisplaying() {
        Elements[0].click();
        for (SelenideElement element: Elements) {
            element.should(Condition.visible);
        }
    }

}