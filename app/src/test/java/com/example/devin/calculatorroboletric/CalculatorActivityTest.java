package com.example.devin.calculatorroboletric;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class CalculatorActivityTest {
    @Test
    public void shouldNotBeNull(){

        CalculatorActivity activity = Robolectric.setupActivity(CalculatorActivity.class);
        assertNotNull(activity);

    }
}