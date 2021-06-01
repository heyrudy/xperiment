package app.controller;

import app.store.InsertTodoCommandAction;

public final record AddTodoAction(String text) implements TodosController, Controller {

    @Override
    public String action() {
        InsertTodoCommandAction store = new InsertTodoCommandAction(this.text());
        store.action();
        return String.format("This is the text %s of our http POST request", this.text());
    }
}
