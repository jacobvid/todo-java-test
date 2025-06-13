package com.todo;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TodoSteps {
    ArrayList<String> todos;

    @Given("I have opened the Todo application")
    public void i_have_opened_the_todo_application() {
        todos = new ArrayList<>();
    }

    @When("I add {string} to the list")
    public void i_add_to_the_list(String item) {
        todos.add(item);
    }

    @Then("the list should contain {string}")
    public void the_list_should_contain(String item) {
        assertTrue(todos.contains(item));
    }
}
