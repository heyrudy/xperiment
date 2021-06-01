package app.router;

public final record DeleteTodoUrlAction(int id) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our DELETE url path/%d", this.id());
    }
}
