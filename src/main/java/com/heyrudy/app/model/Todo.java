package com.heyrudy.app.model;

import java.util.List;

public record Todo(TodoId todoId, Description description, Completed completed) {

    public static List<Todo> initState() {
        return List.of();
    }

    public Todo withTodoId(Integer id) {
        return new Todo(new TodoId(id), description, completed);
    }

    public Todo withDescription(String text) {
        return new Todo(todoId, new Description(text), completed);
    }

    public Todo withCompleted(Boolean isCompleted) {
        return new Todo(todoId, description, new Completed(isCompleted));
    }
}
