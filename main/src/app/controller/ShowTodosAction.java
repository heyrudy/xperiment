package app.controller;

public final record ShowTodosAction(int id) implements TodosController, Controller {
    @Override
    public String action(TodosController controller) {
        return String.format("This is the id %d of our http GET request", this.id());
    }
}
