package app.store;

import app.model.Todo;

import java.util.Collections;
import java.util.List;

public final record DeleteTodoCommandAction(int id) implements TodosStore, Store {

    @Override
    public String action() {
        List<Todo> todos = new java.util.ArrayList<>(Todo.initState());
        todos.remove(id);
        List<Todo> todosUpdated = Collections.unmodifiableList(todos);
        return String.format("This is the id %d of our sql DELETE command", this.id());
    }
}
