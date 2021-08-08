package com.heyrudy.app.router;

public sealed interface TodosRouter extends AutoRoute permits
        TodosRouter.PostTodoUrlAction,
        TodosRouter.GetTodosUrlAction,
        TodosRouter.DeleteTodoUrlAction {

    record GetTodosUrlAction(int id) implements TodosRouter {

        public String action() {
            return String.format("This is our GET url path/%d", this.id());
        }
    }

    record PostTodoUrlAction(String text) implements TodosRouter {

        public String action() {
            return String.format("This is our POST url path/%s", this.text());
        }
    }

    record DeleteTodoUrlAction(int id) implements TodosRouter {

        public String action() {
            return String.format("This is our DELETE url path/%d", this.id());
        }
    }

}
