package app.router;

public sealed interface TodosRouter {
}

record GetTodosUrlAction(int id) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our GET url path/%d", this.id());
    }
}

record PostTodoUrlAction(String text) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our POST url path/%s", this.text());
    }
}

record DeleteTodoUrlAction(int id) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our DELETE url path/%d", this.id());
    }
}
