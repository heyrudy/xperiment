package app.model;

import app.model.state.State;

public final record Todo(int id, String text, Boolean completed) implements State<Todo> {

    @Override
    public Object queryField(Todo todo, Object obj) {
        return switch (todo) {
            case todo(id, _, _) | id == (int) obj -> todo.id();
            case todo(_, text, _) | text == obj -> todo.text();
            case todo(_, _, completed) | completed == obj -> todo.completed();
        };
    }
}
