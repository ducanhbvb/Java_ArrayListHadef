package com.company;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] element;

    public MyList() {
    }

    public MyList(int capacity) {
        this.size = capacity;
        this.element = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object getElement(int i) {
        return element[i];
    }
    public Object[] getElement() {
        return element;
    }


    public void addLength() {
        Object[] newElement = element;
        element = new Object[element.length * element.length];
        for (int i = 0; i <newElement.length ; i++) {
            element[i]=newElement[i];
        }
    }

    public void move(int x, E elements) {
        for (int i = size; i > x; i--) {
            element[i] = element[i - 1];
        }
        element[x] = elements;
        size++;
    }

    public void add(int index, E elements) {
        if(size==element.length){this.addLength();}
        if (index < size - 1) {
            move(index, elements);
        } else if (index < element.length - 1) {

        }
    }

}
