import java.util.ArrayList;

public class LonelyIslanders<T> implements Deque<T>{

    //Instance vars
    private int _size;
    private ArrayList<T> _deque;

    //Default constructor
    public LonelyIslanders(){
	_deque = new ArrayList<T>();
	_size = 0;
    }

    //
    public void addFirst(T x){
	_deque.add(x);
    }

    //
    public void addLast(T x){
	_deque.add(_size,x);
    }

    //
    public T removeFirst(){
	T x = _deque.remove(0);
	_size--;
	return x;
    }

    //
    public T removeLast(){
	T x = _deque.remove(_size-1);
	_size--;
	return x;
    }

    //
    public T peekFirst(){
        return _deque.get(0);

    }

    //
    public T peekLast(){
	return _deque.get(_size-1);
    }

    //
    public boolean isEmpty(){
	return _deque.get(0) == null;
    }

    public int size(){
	return _size;
    }

    //For testing purposes
    public static void main(String[] args){

    }
}
