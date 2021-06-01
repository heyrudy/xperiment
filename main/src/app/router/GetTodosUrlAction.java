package app.router;

public final record GetTodosUrlAction(int id) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our GET url path/%d", this.id());
    }
}