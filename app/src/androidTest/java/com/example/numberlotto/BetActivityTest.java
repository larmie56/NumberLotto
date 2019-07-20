package com.example.numberlotto;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static java.lang.Integer.parseInt;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class BetActivityTest {

    @Rule
    public ActivityTestRule<BetActivity> mBetActivityTestRule =
            new ActivityTestRule(BetActivity.class);

    @Test
    public void Bet(){

        onView(withId(R.id.button_one)).perform(click());
        onView(withId(R.id.textView_result)).check(matches(withSubstring(("1"))));

        onView(withId(R.id.fab)).perform(click());
        onView(withId(R.id.button_nine)).perform(click());
        onView(withId(R.id.textView_result)).check(matches(withSubstring("9")));
    }
}