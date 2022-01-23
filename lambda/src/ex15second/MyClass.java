package ex15second;

class MyClass<T> {
    private T val;

    public MyClass(T v) {
        this.val = v;
    }

    public MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
