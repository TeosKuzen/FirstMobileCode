package ui.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

public class CatalogPage {

    private SelenideElement catalogMenuIcon = $(MobileBy.id("ru.vkusvill:id/bottom_item_catalog"));
    private SelenideElement warningIcon = $(MobileBy.id("ru.vkusvill:id/iv_service_not"));
    private SelenideElement сallToAction = $(MobileBy.id("ru.vkusvill:id/tv_service_not"));
    private SelenideElement inputAddress = $(MobileBy.id("ru.vkusvill:id/button_service_not"));
    private SelenideElement findProductsField = $(MobileBy.className("android.widget.RelativeLayout"));
    private SelenideElement barCodeButton = $(MobileBy.id("ru.vkusvill:id/iv_barcode"));
    private SelenideElement filterButton = $(MobileBy.id("ru.vkusvill:id/iv_filter"));
    private SelenideElement addFavoriteButton = $(MobileBy.id("ru.vkusvill:id/rl_favorites"));
    private SelenideElement header1 = $(MobileBy.xpath("//android.widget.TextView[@text='Рекомендуем']"));
    private SelenideElement header2 = $(MobileBy.xpath("//android.widget.TextView[@text='Популярное']"));
    private SelenideElement findProductsFieldPlaceholder = $(MobileBy.xpath("//android.widget.TextView[@text='Найти продукты']"));
    private SelenideElement shopsHistoryLabelTitle = $(MobileBy.xpath("//*[@text='История покупок']"));
    private SelenideElement moreGoodForNewYearLabelTitle = $(MobileBy.xpath("//*[@text='Больше хорошего на Новый год']"));
    private SelenideElement giftsLabelTitle = $(MobileBy.xpath("//*[@text='Подарки к празднику']"));

    private SelenideElement[] catalogPageElements = {
            catalogMenuIcon,
            warningIcon,
            сallToAction,
            inputAddress,
            findProductsField,
            barCodeButton,
            filterButton,
            addFavoriteButton,
            header1,
            findProductsFieldPlaceholder,
            header2,
            shopsHistoryLabelTitle,
            moreGoodForNewYearLabelTitle,
            giftsLabelTitle
    };

    @Step("Отображение иконки \"Каталог\"")
    public void catalogIconDisplaying ()
    {
        catalogPageElements[0].should(Condition.visible);
    }

    @Step("Отображение элементов страницы \"Каталог\"")
    public void catalogPageElementsDisplaying () {
        catalogPageElements[0].click();
        for ( SelenideElement element: catalogPageElements) {
            element.should(Condition.visible);
        }
    }

}
