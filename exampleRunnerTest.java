package com.testlodge.test.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by peterki on 12/06/2017.
 */


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources/features/example.feature"}
    )

    public class exampleRunnerTest {}