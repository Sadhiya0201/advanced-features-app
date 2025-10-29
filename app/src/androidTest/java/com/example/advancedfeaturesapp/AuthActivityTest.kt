package com.example.advancedfeaturesapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AuthActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(AuthActivity::class.java)

    @Test
    fun testLoginButtonVisible() {
        onView(withId(R.id.btnLogin)).check(matches(isDisplayed()))
    }

    @Test
    fun testEmailAndPasswordFieldsVisible() {
        onView(withId(R.id.etEmail)).check(matches(isDisplayed()))
        onView(withId(R.id.etPassword)).check(matches(isDisplayed()))
    }
}