package app.store;

import app.model.Todo;

import java.util.Collections;
import java.util.List;

public final record InsertTodoCommandAction(String text) implements TodosStore, Store {

    @Override
    public String action() {
        List<Todo> todos = new java.util.ArrayList<>(Todo.initState());
        Todo todo = new Todo(1, text, false);
        todos.add(todo);
        List<Todo> todosUpdated = Collections.unmodifiableList(todos);
        return String.format("This is the text %s of our sql INSERT command", this.text());
    }
}
