package ru.apolonov;

import org.junit.jupiter.api.Test;
import ru.apolonov.steps.WebSteps;

public class StepAnnotatedTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final int ISSUE_NUMBER = 68;

    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);

    }
}
