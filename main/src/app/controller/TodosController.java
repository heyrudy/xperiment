package app.controller;

public sealed interface TodosController permits AddTodoAction, ShowTodosAction, DeleteTodoAction {
}
