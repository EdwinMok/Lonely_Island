//Dequelaration of Independence
//Problems: addFirst() adds to the end

public class DequeTester{

    public static void main(String[] args){
	
	//instantiate new deque
	Deque D = new ALDeque<String>();
	/*
	//test poll on empty deque;should all return exception
	System.out.println(D.removeFirst());
	System.out.println(D.removeFirst());
	System.out.println(D.removeLast());
	System.out.println(D.removeLast());
	
	//test peek on empty deque;should all return exception
	System.out.println(D.peekFirst());
	System.out.println(D.peekFirst());
	System.out.println(D.peekLast());
	System.out.println(D.peekLast());
	*/
	//testing size() on empty deque;should return zero
	System.out.println(D.size());

	//testing addLast()
	D.addLast("uno");
	D.addLast("dos");
	D.addLast("tre");
	System.out.println("size: " + D.size()); //3
	System.out.println(D); // uno dos tre

	//testing addFirst();
	D.addFirst("three");
	D.addFirst("two");
	D.addFirst("one");
	System.out.println("size: " + D.size()); //6	
	System.out.println(D); // one two three uno does tre

	//adding types other than String
	D.addFirst(3);
	D.addFirst(2.0);
	D.addFirst(true);
	System.out.println("size: " + D.size()); //9	
	System.out.println(D); // true 2.0 3 one two three uno dos tre

	//testing poll to remove elements
	System.out.println(D.peekFirst()); //element to be removed: true
	System.out.println(D.removeFirst()); //true
	System.out.println(D.peekFirst()); //element to be removed: 2.0	
	System.out.println(D.removeFirst()); //2.0
	System.out.println(D.size()); //7
	System.out.println(D.peekLast()); //element to be removed: tre
	System.out.println(D.removeLast()); //tre
	System.out.println(D.peekLast()); //element to be removed: dos	
	System.out.println(D.removeLast()); //dos	
	System.out.println(D.size()); //5
        //achieve one element deque
	while(D.size() > 1)
	    D.removeFirst();

	//peekFirst() and peekLast() should return same value
	System.out.println(D.peekFirst()); //uno
	System.out.println(D.peekLast()); //uno
    }
    
}
