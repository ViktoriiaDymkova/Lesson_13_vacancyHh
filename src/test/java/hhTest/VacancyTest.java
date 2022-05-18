package hhTest;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("vacancy")
public class VacancyTest extends TestBase {
    //locators
    SelenideElement vacancy = $(".HH-MainContent"),
            city = $("p[data-qa='vacancy-view-location']"),
            skill = $(".bloko-tag-list"),
            form = $(".bloko-form-item"),
            attribute = $(byAttribute("data-qa", "account-signup-email")),
            ok = $(".signup-submit"),
            checkup = $(".bloko-form-error");

    @Test
    @DisplayName("Положительная проверка вакансии на ресурсе hh.ru")
    void hhTest01() {
        step("Открываем ссылку вакансии на ресурсе hh.ru", () -> {
            open("/vacancy/48204083?query=QA%20engineer&from=vacancy_search_catalog&hhtmFrom=vacancy_search_catalog");
        });

        step("Проверяем соответствие названия вакансии ожиданию: QA Engineer", () -> {
            vacancy.shouldHave(text("QA"));
        });

        step("Проверяем соответствие города вакансии: Санкт-Петербург", () -> {
            city.shouldHave(text("Санкт-Петербург"));
        });
        step("Проверка соответствия в ключевых навыках Java", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Java"));
        });
        step("Проверка наличия уведомления об ошибке при некорректном вводе телефона", () -> {
            form.click();
            attribute.setValue("12345678987654321");
            ok.click();
            checkup.shouldHave(text("Пожалуйста, укажите email или телефон"));
        });
    }

    @Test
    @DisplayName("Отрицательная проверка вакансии на ресурсе hh.ru")
    void hhTest02() {
        step("Открываем ссылку вакансии на ресурсе hh.ru", () -> {
            open("/vacancy/48204083?query=QA%20engineer&from=vacancy_search_catalog&hhtmFrom=vacancy_search_catalog");
        });
        step("Проверка соответствия в ключевых навыках Python", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Python"));
        });
    }
}
