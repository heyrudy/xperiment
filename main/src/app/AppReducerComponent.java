package app;

import java.util.Collections;
import java.util.List;

public final class AppReducerComponent {

    public List<Todo> initState() {
        return Collections.emptyList();
    }
    public String reducer(Action action) {
        return switch (action) {
            case Add add -> String.format("string %s", add.text());
            case Check check -> String.format("int %d", check.id());
            case Delete delete -> String.format("int %d", delete.id());
        }
    }
}
