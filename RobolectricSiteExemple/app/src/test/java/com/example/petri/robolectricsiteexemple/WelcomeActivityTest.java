package com.example.petri.robolectricsiteexemple;

import android.content.Intent;
import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.shadows.ShadowIntent;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

/**
 * Created by petri on 4/18/2016.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class WelcomeActivityTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        View loginButton = activity.findViewById(R.id.login);
        loginButton.performClick();

        ShadowActivity shadowActivity = shadowOf(activity);
        Intent startedIntent = shadowActivity.getNextStartedActivity();
        ShadowIntent shadowIntent = shadowOf(startedIntent);


        assertEquals(LoginActivity.class.getName(), shadowIntent.getComponent().getClassName());
    }
}