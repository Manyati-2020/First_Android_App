package com.zubair.activityapp;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import com.zubair.activityapp.FourthActivity;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class FourthActivityTest {

    @Rule
    public ActivityScenarioRule<FourthActivity> scenarioRule =
            new ActivityScenarioRule<>(FourthActivity.class);

    @Test
    public void onCreate() {
        try (ActivityScenario scenario = ActivityScenario.launch(FourthActivity.class)) {
            Assert.assertNotNull(scenario);
        }
    }
}