/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.csmc123;

import java.util.EmptyStackException;

/**
 *
 * @author chromalix
 * @param <E>
 */
public class Stack<E> implements MyStack<E> {

    private int size;
    private final AList<E> list;

    public Stack() {
        size = 0;
        list = new AList<>();
    }

    @Override
    public void push(E item) {
        list.add(item);
        size++;
    }

    @Override
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        size--;
        E item = list.get(size);
        list.remove(size);
        return item;

    }

    @Override
    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return list.get(size - 1);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
