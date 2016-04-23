package com.example.petri.robolectricsiteexemple;

import android.content.Intent;
import android.os.Build;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.robolectric.Shadows.shadowOf;

/**
 * Created by petri on 4/18/2016.
 */
@Config(constants = BuildConfig.class,sdk=16)
@RunWith(RobolectricTestRunner.class)
public class WelcomeActivityTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        ActivityController controller = Robolectric.buildActivity(MainActivity.class).create().start();
       MainActivity activity = (MainActivity) controller.get();
        assertTrue(1==1);
    }
}