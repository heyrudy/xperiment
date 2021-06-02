package app.model;

import app.model.state.State;

import java.util.Collections;
import java.util.List;

public final record Todo(Integer id, String text, Boolean completed) implements State {

    public static List<Todo> initState() {
        return Collections.emptyList();
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
        if (name.equals("id")) {
            return this.id();
        } else if (name.equals("text")) {
            return this.text();
        } else if (name.equals("completed")) {
            return this.completed();
        } else {
            return null;
        }
    }

    public Object mutateField(String name, Object value) {
        if (name.equals("id")) {
            return this.withId((Integer) value);
        } else if (name.equals("text")) {
            return this.withText((String) value);
        } else if (name.equals("completed")) {
            return this.withCompleted((Boolean) value);
        } else {
            return this;
        }
    }
}
