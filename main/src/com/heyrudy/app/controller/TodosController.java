package com.heyrudy.app.controller;

import com.heyrudy.app.model.dto.TodoDto;
import com.heyrudy.app.store.TodoStore;

public sealed interface TodosController
        extends Controller<TodosController, String>
        permits TodosController.AddTodoAction, TodosController.ShowTodosAction, TodosController.DeleteTodoAction {

    default String action(TodosController controller) {
        return switch (controller) {
            case AddTodoAction addTodoAction -> addTodoAction.post();
            case ShowTodosAction showTodosAction -> showTodosAction.get();
            case DeleteTodoAction deleteTodoAction -> deleteTodoAction.delete();
        };
    }

    record AddTodoAction(TodoDto todoDtoToAdd) implements TodosController {

        public String post() {
            TodoStore.InsertTodoCommandAction store = new TodoStore.InsertTodoCommandAction(todoDtoToAdd);
            store.insert();
            return String.format("This is the todoToAdd %s of our http POST request", todoDtoToAdd);
        }
    }

    record ShowTodosAction(int id) implements TodosController {

        public String get() {
            TodoStore.SelectTodosQueryAction store = new TodoStore.SelectTodosQueryAction(id);
            store.select();
            return String.format("This is the todoId %d of our http GET request", id);
        }
    }

    record DeleteTodoAction(int id) implements TodosController {

        public String delete() {
            TodoStore.DeleteTodoCommandAction store = new TodoStore.DeleteTodoCommandAction(id);
            store.delete();
            return String.format("This is the todoId %d of our http DELETE request", id);
        }
    }
}
