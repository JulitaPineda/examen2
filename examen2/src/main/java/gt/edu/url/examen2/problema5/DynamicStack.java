/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julita
 */
public class DynamicStack<E> implements Stack<E> {
	
	private List<E> data;
	private int t=-1;
	
	public DynamicStack() {
		data = new ArrayList();
	}

	public int size(){
		return t+1;
	}

	public boolean isEmpty() {
		return (t == -1);
	}

	public void push(E e) {
		data.add(e);
                t++;
	}

	public E top() {
		if (isEmpty()) return null;
		return data.get(t);
	}

	public E pop() {
		if (isEmpty()) return null;
		E response = data.get(t);
		data.remove(t);
		t--;
		return response;
	}

}