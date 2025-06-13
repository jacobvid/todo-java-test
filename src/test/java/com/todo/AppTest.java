package com.todo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class AppTest {
    @Test
    public void testAddTodo() {
        App.addTodo("Test Task");
        ArrayList<String> todos = App.getTodos();
        assertTrue(todos.contains("Test Task"));
    }
}
