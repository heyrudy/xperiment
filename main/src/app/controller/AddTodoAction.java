package app.controller;

public final record AddTodoAction(String text) implements TodosController, Controller {

    @Override
    public String action(TodosController controller) {
        return String.format("This is the text %s of our http POST request", this.text());
    }
}
