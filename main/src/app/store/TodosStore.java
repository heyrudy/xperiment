package app.store;

public sealed interface TodosStore permits InsertTodoCommandAction, SelectTodosQueryAction, DeleteTodoCommandAction {
}
