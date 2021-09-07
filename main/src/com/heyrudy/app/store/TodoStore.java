package com.heyrudy.app.store;

import com.heyrudy.app.model.Todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public sealed interface TodoStore
        extends EntityStore<TodoStore, String>
        permits TodoStore.InsertTodoCommandAction, TodoStore.SelectTodosQueryAction, TodoStore.DeleteTodoCommandAction {

    default String action(TodoStore store) {
        return switch (store) {
            case InsertTodoCommandAction insertTodoCommandAction -> insertTodoCommandAction.action();
            case SelectTodosQueryAction selectTodosQueryAction -> selectTodosQueryAction.action();
            case DeleteTodoCommandAction deleteTodoCommandAction -> deleteTodoCommandAction.action();
        };
    }

    record DeleteTodoCommandAction(int id) implements TodoStore {

        public String action() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            todos.remove(id);
            List<Todo> todosUpdated = Collections.unmodifiableList(todos);
            return String.format("This is the todoId %d of our sql DELETE command", this.id());
        }
    }

    record InsertTodoCommandAction(String text) implements TodoStore {

        public String action() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            Todo todo = new Todo(new Todo.TodoId(1), new Todo.Description(text), new Todo.Completed(false));
            todos.add(todo);
            List<Todo> todosUpdated = Collections.unmodifiableList(todos);
            return String.format("This is the text %s of our sql INSERT command", this.text());
        }
    }

    record SelectTodosQueryAction(int id) implements TodoStore {

        public String action() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            todos.stream()
                    .filter(todo -> todo.todoId().id() == id)
                    .toList();
            return String.format("This is the todoId %d of our sql SELECT query", this.id());
        }
    }
}

