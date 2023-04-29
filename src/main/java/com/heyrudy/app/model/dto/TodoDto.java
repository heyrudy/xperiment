package com.heyrudy.app.model.dto;

import com.heyrudy.app.model.Completed;
import com.heyrudy.app.model.Description;
import com.heyrudy.app.model.Todo;
import com.heyrudy.app.model.TodoId;

public record TodoDto(Description description, Completed completed) {

    public Todo toTodo() {
        return new Todo(new TodoId(0), description, completed);
    }
}
