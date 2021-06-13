package app.store;

public sealed interface TodosStore permits DeleteTodoCommandAction, InsertTodoCommandAction, SelectTodosQueryAction {
}

