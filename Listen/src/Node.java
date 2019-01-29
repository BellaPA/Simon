
public class Node <T> {
	
	private T t;
	private Node<T> next;
	
	
	public Node (T value) {
		t = value;
		next = null;
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T value) {
		this.t = value;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
