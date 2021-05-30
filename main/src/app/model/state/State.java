package app.model.state;

public interface State<T> {

    Object queryField(T t, Object obj);
}
