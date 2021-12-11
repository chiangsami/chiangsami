
public class Node<T> {
	
	private T data; 
	private Node next; 
	
	private Node(T dataValue) { 
		this(dataValue, null); 
	}

	private Node(T dataValue, Node nextNode) { 
		data = dataValue; 
		next = nextNode; 
	}
	
	private void setData(T newData)
	{ 
		data = newData; 
	}
	
	private T getData() 
	{ 
		return data; 
	}
	
	private void setNext(Node nextNode) 
	{ 
		next = nextNode; 
	}
	
	private Node getNext() 
	{ 
		return next; 
	}
	
	
}
