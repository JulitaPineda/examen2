# Examen Parcial 2

#### Julia Cristina Pineda Jovel - 1020415
-------------------------------------------------------------------

### Problema 2
Para la solucion del problema 2, se utilizaron las siguientes clases:
-DemoList
-DemostracionLista
-Lista
-List

### Problema 3
Para la solucion del problema 3, se utilizo la siguiente clase:
-LinkedPositionalList

El metodo que se implemento fue el siguiente:

    public void swap(Position<E> p, Position<E> q) {
        Node<E> nodoP = validate(p);
        Node<E> nodoQ = validate(q);
        Node<E> temp = validate(p);
        nodoP.next = nodoQ.next;
        nodoP.prev = nodoQ.prev;
        nodoQ.next = temp.next;
        nodoQ.prev = temp.prev;
    }
    

### Problema 4


### Problema 5
Para la solucion del problema 5, se utilizo la siguiente clase:
-DynamicStack

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
