package app.controller;

import app.store.SelectTodosQueryAction;

public final record ShowTodosAction(int id) implements TodosController, Controller {

    @Override
    public String action() {
        SelectTodosQueryAction store = new SelectTodosQueryAction(this.id());
        store.action();
        return String.format("This is the id %d of our http GET request", this.id());
    }
}
