package app.model.state;

public interface State {

    Object queryField(String name) ;

    Object mutateField(String name, Object value);
}
