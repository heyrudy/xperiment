package com.heyrudy.app.controller;

import com.heyrudy.app.store.TodoStore;

public sealed interface TodosController
        extends Controller<TodosController, String>
        permits TodosController.AddTodoAction, TodosController.ShowTodosAction, TodosController.DeleteTodoAction {

    default String action(TodosController controller) {
        return switch (controller) {
            case AddTodoAction addTodoAction -> addTodoAction.action();
            case ShowTodosAction showTodosAction -> showTodosAction.action();
            case DeleteTodoAction deleteTodoAction -> deleteTodoAction.action();
        };
    }

    record AddTodoAction(String text) implements TodosController {

        public String action() {
            TodoStore.InsertTodoCommandAction store = new TodoStore.InsertTodoCommandAction(text);
            store.action();
            return String.format("This is the text %s of our http POST request", text);
        }
    }

    record ShowTodosAction(int id) implements TodosController {

        public String action() {
            TodoStore.SelectTodosQueryAction store = new TodoStore.SelectTodosQueryAction(id);
            store.action();
            return String.format("This is the todoId %d of our http GET request", id);
        }
    }

    record DeleteTodoAction(int id) implements TodosController {

        public String action() {
            TodoStore.DeleteTodoCommandAction store = new TodoStore.DeleteTodoCommandAction(id);
            store.action();
            return String.format("This is the todoId %d of our http DELETE request", id);
        }
    }
}
