package com.heyrudy.app.controller;

import com.heyrudy.app.store.TodosStore;

public sealed interface TodosController extends Controller permits
        TodosController.AddTodoAction,
        TodosController.ShowTodosAction,
        TodosController.DeleteTodoAction {

    record AddTodoAction(String text) implements TodosController {

        public String action() {
            TodosStore.InsertTodoCommandAction store = new TodosStore.InsertTodoCommandAction(this.text());
            store.action();
            return String.format("This is the text %s of our http POST request", this.text());
        }
    }

    record ShowTodosAction(int id) implements TodosController {

        public String action() {
            TodosStore.SelectTodosQueryAction store = new TodosStore.SelectTodosQueryAction(this.id());
            store.action();
            return String.format("This is the id %d of our http GET request", this.id());
        }
    }

    record DeleteTodoAction(int id) implements TodosController {

        public String action() {
            TodosStore.DeleteTodoCommandAction store = new TodosStore.DeleteTodoCommandAction(this.id());
            store.action();
            return String.format("This is the id %d of our http DELETE request", this.id());
        }
    }
}
