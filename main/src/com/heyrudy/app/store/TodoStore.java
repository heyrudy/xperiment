package com.heyrudy.app.store;

import com.heyrudy.app.model.Todo;
import com.heyrudy.app.model.dto.TodoDto;

import java.util.ArrayList;
import java.util.List;

public sealed interface TodoStore
        extends EntityStore<TodoStore, String>
        permits TodoStore.InsertTodoCommandAction, TodoStore.SelectTodosQueryAction, TodoStore.DeleteTodoCommandAction {

    default String action(TodoStore store) {
        return switch (store) {
            case InsertTodoCommandAction insertTodoCommandAction -> insertTodoCommandAction.insert();
            case SelectTodosQueryAction selectTodosQueryAction -> selectTodosQueryAction.select();
            case DeleteTodoCommandAction deleteTodoCommandAction -> deleteTodoCommandAction.delete();
        };
    }

    record DeleteTodoCommandAction(int id) implements TodoStore {

        public String delete() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            todos.remove(id);
            return String.format("This is the todoId %d of our sql DELETE command : %s", this.id(), todos);
        }
    }

    record InsertTodoCommandAction(TodoDto todoDtoToAdd) implements TodoStore {

        public String insert() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            todos.add(todoDtoToAdd.toTodo());
            return String.format("This is the todoToAdd %s of our sql INSERT command : %s", todoDtoToAdd, todos);
        }
    }

    record SelectTodosQueryAction(int id) implements TodoStore {

        public String select() {
            List<Todo> todos = new ArrayList<>(Todo.initState());
            List<Todo> selectedTodoById = todos.stream()
                    .filter((Todo todo) -> todo.todoId().id() == id)
                    .toList();
            return String.format("This is the todoId %d of our sql SELECT query : %s", this.id(), selectedTodoById);
        }
    }
}

