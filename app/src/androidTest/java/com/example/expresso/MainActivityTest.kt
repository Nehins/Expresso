package com.example.expresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun omplirformulari(){
        onView(withId(R.id.nom)).perform(ViewActions.typeText("Sandra"))
        onView(withId(R.id.cognoms)).perform(ViewActions.typeText("Dalmau Crespo"))
        onView(withId(R.id.telefon)).perform(ViewActions.typeText("634 90 05 11"))
        onView(withId(R.id.button)).perform(click())
    }

}