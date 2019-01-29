
public class List <T> {
	
	public static void main(String[] args) {
		List<Integer> list = new List<Integer>();
		list.addNode( 10);
		list.addNode(100);
		list.addNode(200);
		list.addNode(50);
		list.addNode(55);
		list.isEmpty();
		System.out.println("Empty?: " + list.isEmpty());
		//list.getSize();
		
		
		//System.out.println("HasNext: " + MyListIterator<T>(list));
		
	}
	
	public Node <T> front;
	int size;
	
	public List() {
		this.front = null;
	}
	
	public void addNode(T wert) {
		
		if(front == null) {
			front = new Node <T>(wert);
			System.out.println("Erster Knoten " + front.getT());
		} else {
			
			Node <T> m = front;
			
			while(m.getNext() != null && m.getNext().getT() == wert) {
				
				m = m.getNext();
				
			}
			
			Node <T> newNode = new Node <T> (wert);
			m.setNext(newNode);
			System.out.println("Folgende Knoten " + newNode.getT());		
		}
	
	}
	
	public Node<T> getFront() {
		return this.front;
	}
	
	public int getSize() {
		int size = 0;
		Node<T> m = getFront();
		System.out.println("ers: " + m.getT());
		
		/*while(m != null) {
			size++;
			System.out.println("and: " + m.getT());
			m = m.getNext();
			*/
		
		for (Node<T> i=front; i!=null; i=i.getNext())
		{
			System.out.println("Größe: " + i.getT());	
		}
		size++;
		System.out.println("Größe: " + size);
		return size;
		
	}
	
	public boolean isEmpty() {
		
		return front == null;	
	}
	
	public ListIterator<T> listiterator() 
	{
		return;
	}
}
	
