import java.util.ListIterator;

public class MyListIterator<T> {
	
	ListIterator<T> index;
	Node<T> front;
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		Node<T> m = front;
		if(m != null) {
		return true;
		}
		else {
			return false;
		}
	}

	
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
