package app.model.state;

public interface State {

    default Object queryField(String name) throws NoSuchFieldException, IllegalAccessException {
        return name.equals(this.getClass().getField(name).getName()) ? this.getClass().getField(name).get(this) : null;
    }

    default void mutateField(String name, Object value) throws NoSuchFieldException, IllegalAccessException {
        if (name.equals(this.getClass().getField(name).getName())) {
            this.getClass().getField(name).set(this, value);
        } else {
            this.getClass().getField(name).set(this, this.getClass().getField(name).get(this));
        }
    }
}
