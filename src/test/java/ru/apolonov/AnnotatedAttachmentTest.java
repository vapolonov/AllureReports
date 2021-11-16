package ru.apolonov;

import org.junit.jupiter.api.Test;

import ru.apolonov.steps.WebSteps;


public class AnnotatedAttachmentTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";

    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.takeScreenshot();
    }
}
