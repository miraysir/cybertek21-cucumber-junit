package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before (order = 2)
    public void setUpScenario(){
        System.out.println("------Setting up browser with further details...");
    }

    @Before(value = "@db", order = 1)
    public void setUpDatabase(){
        System.out.println("----- CONNECTING TO DATABASE ");
    }

    @After
    public void tearDownScenario(){
        System.out.println("------Closing browser");
        System.out.println("------Take a screenshot");
    }

}
