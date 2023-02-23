package com.github.lucaengel.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.content.Intent;
import android.widget.EditText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void greetingActivityIsLaunchedWithMessageDisplayed() {
        String name = "Luca";

        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra("mainName", name);


        try (ActivityScenario<?> scenario = ActivityScenario.launch(intent)) {

            onView(withId(R.id.greetingText)).check(matches(isDisplayed()));
            onView(withId(R.id.greetingText)).check(matches(withText("Hello " + name + "!")));
        } catch (Exception ignored) {
        }

    }
}
