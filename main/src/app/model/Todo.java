package app.model;

import app.model.state.State;

import java.util.Collections;
import java.util.List;

public final record Todo(Integer id, String text, Boolean completed) implements State {

    public static List<Todo> init() {
        return Collections.emptyList();
    }
}
