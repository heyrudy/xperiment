package app.store;

import app.store.Store;
import app.store.TodosStore;

public final record InsertTodoCommandAction(String text) implements TodosStore, Store {

    @Override
    public String action(TodosStore store) {
        return String.format("This is the text %s of our sql INSERT command", this.text());
    }
}
