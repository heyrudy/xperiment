package app.model;

import app.model.state.State;

import java.util.Collections;
import java.util.List;

public final record Todo(int id, String text, Boolean completed) implements State {

    public List<Todo> init() {
        return Collections.emptyList();
    }

    @Override
    public Object queryField(Object obj) {
        return switch (obj) {
            case this.id() == (int) obj -> this.id();
            case this.text() == obj -> this.text();
            case this.completed() == obj -> this.completed();
        };
    }
}
