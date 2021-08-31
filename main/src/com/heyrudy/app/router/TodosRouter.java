package com.heyrudy.app.router;

public sealed interface TodosRouter
        extends AutoRoute<TodosRouter, String>
        permits TodosRouter.PostTodoUrlAction, TodosRouter.GetTodosUrlAction, TodosRouter.DeleteTodoUrlAction {

    default String action(TodosRouter router) {
        return switch (router) {
            case PostTodoUrlAction postTodoUrlAction -> postTodoUrlAction.action();
            case GetTodosUrlAction getTodosUrlAction -> getTodosUrlAction.action();
            case DeleteTodoUrlAction deleteTodoUrlAction -> deleteTodoUrlAction.action();
        };
    }

    record PostTodoUrlAction(String text) implements TodosRouter {

        public String action() {
            return String.format("This is our POST url path/%s", text);
        }
    }

    record GetTodosUrlAction(int id) implements TodosRouter {

        public String action() {
            return String.format("This is our GET url path/%d", id);
        }
    }

    record DeleteTodoUrlAction(int id) implements TodosRouter {

        public String action() {
            return String.format("This is our DELETE url path/%d", id);
        }
    }

}
