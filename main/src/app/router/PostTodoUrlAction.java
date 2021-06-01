package app.router;

public final record PostTodoUrlAction(String text) implements TodosRouter, AutoRoute {

    @Override
    public String action() {
        return String.format("This is our POST url path/%s", this.text());
    }
}
