package com.zubair.activityapp;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class SecondActivityTest {

    @Rule
    public ActivityScenarioRule<SecondActivity> scenarioRule =
            new ActivityScenarioRule<>(SecondActivity.class);

    @Test
    public void onCreate() {

        try (ActivityScenario scenario = ActivityScenario.launch(SecondActivity.class)) {
            Assert.assertNotNull(scenario);
        }
    }
}