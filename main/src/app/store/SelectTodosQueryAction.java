package app.store;

public final record SelectTodosQueryAction(int id) implements TodosStore, Store {

    @Override
    public String action() {
        return String.format("This is the id %d of our sql SELECT query", this.id());
    }
}
