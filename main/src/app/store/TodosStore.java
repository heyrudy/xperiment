package app.store;

import app.model.Todo;

import java.util.Collections;
import java.util.List;

public sealed interface TodosStore permits
        TodosStore.DeleteTodoCommandAction,
        TodosStore.InsertTodoCommandAction,
        TodosStore.SelectTodosQueryAction {

    record DeleteTodoCommandAction(int id) implements Store, TodosStore {

        public String action() {
            List<Todo> todos = new java.util.ArrayList<>(Todo.initState());
            todos.remove(id);
            List<Todo> todosUpdated = Collections.unmodifiableList(todos);
            return String.format("This is the id %d of our sql DELETE command", this.id());
        }
    }

    record InsertTodoCommandAction(String text) implements Store, TodosStore {

        public String action() {
            List<Todo> todos = new java.util.ArrayList<>(Todo.initState());
            Todo todo = new Todo(1, text, false);
            todos.add(todo);
            List<Todo> todosUpdated = Collections.unmodifiableList(todos);
            return String.format("This is the text %s of our sql INSERT command", this.text());
        }
    }

    record SelectTodosQueryAction(int id) implements Store, TodosStore {

        public String action() {
            List<Todo> todos = new java.util.ArrayList<>(Todo.initState());
            todos.stream()
                    .map(todo -> todo.id() == id)
                    .toList();
            return String.format("This is the id %d of our sql SELECT query", this.id());
        }
    }

}

