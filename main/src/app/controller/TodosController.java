package app.controller;

import app.store.DeleteTodoCommandAction;
import app.store.InsertTodoCommandAction;
import app.store.SelectTodosQueryAction;

public sealed interface TodosController {
}


record AddTodoAction(String text) implements TodosController, Controller {

    @Override
    public String action() {
        InsertTodoCommandAction store = new InsertTodoCommandAction(this.text());
        store.action();
        return String.format("This is the text %s of our http POST request", this.text());
    }
}

record ShowTodosAction(int id) implements TodosController, Controller {

    @Override
    public String action() {
        SelectTodosQueryAction store = new SelectTodosQueryAction(this.id());
        store.action();
        return String.format("This is the id %d of our http GET request", this.id());
    }
}

record DeleteTodoAction(int id) implements TodosController, Controller {

    @Override
    public String action() {
        DeleteTodoCommandAction store = new DeleteTodoCommandAction(this.id());
        store.action();
        return String.format("This is the id %d of our http DELETE request", this.id());
    }
}
