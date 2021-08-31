package com.heyrudy.app.model.state;

import java.util.Optional;

public interface EntityState {

    Optional<Object> queryField(final String name) ;

    Object mutateField(final String name, final Object value);
}
