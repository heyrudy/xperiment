package com.heyrudy.app.model;

import com.heyrudy.app.model.state.EntityState;

import java.util.List;
import java.util.Optional;

public record Todo(TodoId todoId, Description description, Completed completed)
        implements EntityState {

    public static List<Todo> initState() {
        return List.of();
    }

    public Todo withTodoId(Integer id) {
        return new Todo(new Todo.TodoId(id), description, completed);
    }

    public Todo withDescription(String text) {
        return new Todo(todoId, new Todo.Description(text), completed);
    }

    public Todo withCompleted(Boolean isCompleted) {
        return new Todo(todoId, description, new Todo.Completed(isCompleted));
    }

    public Optional<Object> queryField(final String name) {
        return switch (name) {
            case "id" -> Optional.ofNullable(todoId);
            case "text" -> Optional.ofNullable(description);
            case "completed" -> Optional.ofNullable(completed);
            default -> Optional.empty();
        };
    }

    public Object mutateField(final String name, final Object value) {
        return switch (name) {
            case "id" -> this.withTodoId((Integer) value);
            case "text" -> this.withDescription((String) value);
            case "completed" -> this.withCompleted((Boolean) value);
            default -> this;
        };
    }

    public static record TodoId(int id) {
    }

    public static record Description(String text) {
    }

    public static record Completed(boolean isCompleted) {
    }
}
