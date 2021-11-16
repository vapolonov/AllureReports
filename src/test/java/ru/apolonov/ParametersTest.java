package ru.apolonov;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @DisplayName("Проверка города")
    @ParameterizedTest(name = "{displayName} {0}")
    @ValueSource(strings = {"Нижний Новгород", "Санкт-Петербург"})
    public void testLambda(String city) {
        Allure.parameter("Город", city);
    }
}
