public class PhanTu<T> {
    //TODO:Attribute
    private T t;
    //TODO:getter,setter
    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public abstract boolean isGreaterThan(T a);

}
