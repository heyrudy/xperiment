package app.store;

public final record InsertTodoCommandAction(String text) implements TodosStore, Store {

    @Override
    public String action() {
        return String.format("This is the text %s of our sql INSERT command", this.text());
    }
}
