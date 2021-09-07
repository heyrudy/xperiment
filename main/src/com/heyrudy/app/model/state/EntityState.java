package com.heyrudy.app.model.state;

import java.util.Optional;

public interface EntityState<T> {

    Optional<Object> queryField(T value, final Object from);

    T mutateField(T value, final Object with);
}
