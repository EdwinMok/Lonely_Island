import java.util.ArrayList;

public class ALDeque<T> implements Deque<T>{

    //Instance vars
    private int _size;
    private ArrayList<T> _deque;

    //Default constructor
    public ALDeque(){
	_deque = new ArrayList<T>();
	_size = 0;
    }

    //Add an item at the front end of the deque
    public void addFirst(T x){
	_deque.add(x);
	_size++;
    }

    //Add an item at the back end of the deque
    public void addLast(T x){
	_deque.add(_size,x);
	_size++;
    }

    //Remove the item at the front end of the deque
    public T removeFirst(){
	T x = _deque.remove(0);
	_size--;
	return x;
    }

    //Remove the item at the back end of the deque
    public T removeLast(){
	T x = _deque.remove(_size-1);
	_size--;
	return x;
    }

    //Return the item at the front end of the deque
    public T peekFirst(){
        return _deque.get(0);

    }

    //Return the item at the back end of the deque
    public T peekLast(){
	return _deque.get(_size-1);
    }

    //Check to see if the deque is empty
    public boolean isEmpty(){
	return _deque.get(0) == null;
    }

    //Accessor for the size of the deque
    public int size(){
	return _size;
    }

    //Prints out the items in the deque, from front end to back end
    public String toString(){
	String s = "";
	for (int x = 0; x < _size; x++){
	    s += _deque.get(x);
	    s += " ";
	}
	return s;
    }

    //For testing purposes
    public static void main(String[] args){
	Deque<String> bigThings = new ALDeque<String>();

	System.out.println("\nnow enqueuing from front end...");
	bigThings.addFirst("pool");
	bigThings.addFirst("school");
	bigThings.addFirst("tool");

	System.out.println("\nnow enqueuing from back end...");
	bigThings.addLast("building");
	bigThings.addLast("car");
	bigThings.addLast("plane");

	System.out.println("\nnow testing toString()...");
	System.out.println( bigThings );

	System.out.println("\nnow testing peek methods...");
	System.out.println( bigThings.peekFirst() );
	System.out.println( bigThings.peekLast() );
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );

	//	System.out.println("\nnow dequeuing fr empty deque...");
	//	System.out.println( bigThings.removeFirst() );
    }
}
