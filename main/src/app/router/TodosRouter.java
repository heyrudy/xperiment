package app.router;

import app.controller.AddTodoAction;
import app.controller.DeleteTodoAction;
import app.controller.ShowTodosAction;

public sealed interface TodosRouter permits PostTodoUrlAction, GetTodosUrlAction, DeleteTodoUrlAction {
}
