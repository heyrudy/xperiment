package app.model.state;

public interface State {

    default Object queryField(String name) throws NoSuchFieldException, IllegalAccessException {
        return name.equals(this.getClass().getField(name).getName()) ? this.getClass().getField(name).get(this) : null;
    };
}
