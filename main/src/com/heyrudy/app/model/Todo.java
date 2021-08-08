package com.heyrudy.app.model;

import com.heyrudy.app.model.state.State;

import java.util.List;

public record Todo(Integer id, String text, Boolean completed) implements State {

    public static List<Todo> initState() {
        return List.of();
    }

    public Todo withId(Integer id) {
        return new Todo(id, text(), completed());
    }

    public Todo withText(String text) {
        return new Todo(id(), text, completed());
    }

    public Todo withCompleted(Boolean completed) {
        return new Todo(id(), text(), completed);
    }

    public Object queryField(String name) {
        return switch (name) {
            case "id" -> this.id();
            case "text" -> this.text();
            case "completed" -> this.completed();
            default -> null;
        };
    }

    public Object mutateField(String name, Object value) {
        return switch (name) {
            case "id" -> this.withId((Integer) value);
            case "text" -> this.withText((String) value);
            case "completed" -> this.withCompleted((Boolean) value);
            default -> this;
        };
    }
}
