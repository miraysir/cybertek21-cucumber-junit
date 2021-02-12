package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");

    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters LIBRARIAN username");
        //Intentionally Fail
        //Assert.fail();
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters LIBRARIAN password");
    }

    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("user sees dashboard");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("User enters Student password");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters Student username");
    }
    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("User enters ADMIN username");
    }

    @When("user enter admin password")
    public void user_enter_admin_password() {
        System.out.println("User enters ADMIN password");
    }







}