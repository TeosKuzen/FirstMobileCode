package ui.tests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ui.pages.CatalogPage;
import ui.pages.MainPage;
import ui.pages.MyCardPage;
import ui.pages.ProfilePage;
import ui.pages.ShopsPage;
import ui.pages.SupportPage;

public class Tests extends BaseTest {

    private static MainPage mainPage;
    private static MyCardPage myCardPage;
    private static SupportPage supportPage;
    private static CatalogPage catalogPage;
    private static ShopsPage shopsPage;
    private static ProfilePage profilePage;

    /**
     * Пока собираю тесты в одном классе
     * */

    @BeforeAll
    public static void init() {
        mainPage = new MainPage();
        myCardPage = new MyCardPage();
        supportPage = new SupportPage();
        catalogPage = new CatalogPage();
        profilePage = new ProfilePage();
        shopsPage = new ShopsPage();
    }

    @Test
    @Description("Логин")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Входим в приложение")
    public void logInByPhoneNumber() {
        mainPage.login();
    }

    @Test
    @Description("Главное меню")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверяем элементы главного меню")
    public void checkMainMenuIcons() {
        mainPage.login();
        myCardPage.myCardIconDisplaying();
        supportPage.supportIconDisplaying();
        shopsPage.shopIconDisplaying();
        profilePage.profileIconDisplaying();
        catalogPage.catalogIconDisplaying();
    }

    @Test
    @Description("Проверка каталога")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверяем элементы страницы \"Каталог\"")
    public void checkCatalogPage() {
        mainPage.login();
        catalogPage.catalogPageElementsDisplaying();
    }

    @Test
    @Description("Страница магазинов")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверяем страницу \"Магазины\"")
    public void checkShopsPage() {
        mainPage.login();
        shopsPage.shopPageElementsDisplaying();
    }

    @Test
    @Description("Страница профиля")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверяем страницу профиля")
    public void checkProfilePage() {
        mainPage.login();
        profilePage.profilePageElementsDisplaying();
    }

    @Test
    @Description("Страница поддержки")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверяем страницу поддержки")
    public void checkSupportPage() {
        mainPage.login();
        supportPage.ElementsDisplaying();
    }

    @Test
    @Description("Страница оформления карты")
    @Owner("Марк Серегин")
    @Story("Тесты примеры")
    @DisplayName("Smoke. Проверка элементов раздела \"Моя карта\"")
    public void checkMyCardPageElements() {
        mainPage.login();
        myCardPage.startCardPageElementsDisplaying();
        myCardPage.createCardPageElementsDisplaying();
    }
}
