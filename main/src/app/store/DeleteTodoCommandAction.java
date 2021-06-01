package app.store;

public final record DeleteTodoCommandAction(int id) implements TodosStore, Store {

    @Override
    public String action() {
        return String.format("This is the id %d of our sql DELETE command", this.id());
    }
}
