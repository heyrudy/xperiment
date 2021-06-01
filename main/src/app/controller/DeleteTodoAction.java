package app.controller;

import app.store.DeleteTodoCommandAction;

public final record DeleteTodoAction(int id) implements TodosController, Controller {

    @Override
    public String action() {
        DeleteTodoCommandAction store = new DeleteTodoCommandAction(this.id());
        store.action();
        return String.format("This is the id %d of our http DELETE request", this.id());
    }
}
