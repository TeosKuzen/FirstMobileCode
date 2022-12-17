package ui.pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

//Магазины
public class ShopsPage {

    private SelenideElement shopsButton = $(MobileBy.id("ru.vkusvill:id/bottom_item_shops"));
    private SelenideElement shopsPageTitle = $(MobileBy.xpath("//android.view.ViewGroup[@resource-id='ru.vkusvill:id/toolbar']//android.widget.TextView"));
    private SelenideElement searchButton = $(MobileBy.id("ru.vkusvill:id/menu_search"));
    private SelenideElement filtersButtonTitle = $(MobileBy.xpath("//*[@text='Фильтры']"));
    private SelenideElement filterIcon = $(MobileBy.xpath("//android.widget.RelativeLayout[@resource-id='ru.vkusvill:id/rl_filter']/android.widget.ImageView"));
    private SelenideElement listTab = $(MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Список\"]/android.widget.TextView"));
    private SelenideElement mapTab = $(MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"Карта\"]/android.widget.TextView"));
    private SelenideElement shopFirstLabel = $(MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
    private SelenideElement addressTitle = $(MobileBy.xpath("//*[@text='Челябинск Чичерина, дом № 38В']"));
    private SelenideElement worksHours = $(MobileBy.xpath("//*[@text='с 9-00 до 22-00']"));
    private SelenideElement distanceToAddress = $(MobileBy.xpath("//*[@text='4380,4 км']"));
    private SelenideElement addToFavoriteFirstAddressButton = $(MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]//*[@resource-id='ru.vkusvill:id/imageView_fav']"));

    private SelenideElement[] shopsPageElements = {
            shopsButton,
            shopsPageTitle,
            searchButton,
            filtersButtonTitle,
            listTab,
            mapTab,
            filterIcon,
            shopFirstLabel,
            addressTitle,
            worksHours,
            distanceToAddress,
            addToFavoriteFirstAddressButton
    };

    @Step("Отображение иконки \"Магазины\"")
    public void shopIconDisplaying () {
    shopsPageElements[0].should(Condition.visible);
    }

    @Step("Отображение элементов страницы \"Магазины\"")
    public void shopPageElementsDisplaying () {
        shopsPageElements[0].click();
        for (SelenideElement element: shopsPageElements) {
            element.should(Condition.visible);
        }
        Assertions.assertEquals("Магазины", shopsPageTitle.getText());
    }
}
