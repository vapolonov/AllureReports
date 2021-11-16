package ru.apolonov;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelsTest {

    @Test
    @Owner("vapolonov")
    @Feature("Авторизация")
    @Story("Авторизация через Email")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Мой первый тест")
    @Link(name = "Github", url = "https://github.com")
    public void testAnnotated() {

    }

    @Test
    public void testLambda() {
        Allure.getLifecycle().updateTestCase(testCase -> {
            testCase.setName("Мой второй тест");
        });
        Allure.label("owner", "vapolonov");
        Allure.feature("Авторизация");
        Allure.story("Авторизация через Email");
        Allure.label("severity", "BLOCKER");
        Allure.link("Github","https://github.com");
    }

}
