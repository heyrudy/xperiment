package app;

import app.controller.TodosController;
import app.model.Todo;

import java.util.Collections;
import java.util.List;

public final class AppReducerComponent {

    public List<Todo> initState() {
        return Collections.emptyList();
    }
//    public String reducer(TodosController todosController) {
//        return switch (todosController) {
//            case AddTodoAction
//                add -> String.format("string %s", add.text());
//            case ShowTodosAction
//                show -> String.format("int %d", show.id());
//            case DeleteTodoAction
//                delete -> String.format("int %d", delete.id());
//        };
//    }
}
