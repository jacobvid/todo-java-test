package com.todo;

import java.util.ArrayList;

public class App {
    private static ArrayList<String> todos = new ArrayList<>();

    public static void addTodo(String item) {
        todos.add(item);
    }

    public static ArrayList<String> getTodos() {
        return todos;
    }

    public static void main(String[] args) {
        addTodo("Buy milk");
        System.out.println(getTodos());
    }
}
