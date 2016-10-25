/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.csmc123;

/**
 *
 * @author chromalix
 * @param <E>
 */
public interface MyStack<E> {

    public void push(E item);

    public E pop();

    public E peek();

    public int size();

    public boolean isEmpty();

}
