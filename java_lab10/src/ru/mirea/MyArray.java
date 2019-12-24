package ru.mirea;

import java.util.Arrays;

public class MyArray<E> {
    private int size;
    private Object[] arr;

    public MyArray(int size) {
        arr = new Object[size];
        this.size = 0;
    }

    public MyArray() {
        this(8);
    }

    public void setArr(E[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public void add(E e) {
        if (size < arr.length) {
            arr[size] = e;
        } else {
            Object[] arrnew = new Object[size + 1];
            System.arraycopy(arr, 0, arrnew, 0, arr.length);
            arr = arrnew;
            arr[size] = e;
        }
        ++size;
    }

    public E getElement(int index) {
        if (index >= size)
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (E)arr[index];
    }

    @Override
    public String toString() {
        return "MyArray: " + Arrays.toString(arr) + ";\nsize = " + size;
    }
}
