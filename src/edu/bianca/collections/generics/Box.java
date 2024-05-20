package edu.bianca.collections.generics;
/*
* public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
* */


public class Box<T> {
    //T representa type
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
