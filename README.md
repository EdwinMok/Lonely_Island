# Lonely_Island

## Method Selections

  * public void addFirst( Card card ); 
  * public void addLast( Card card );
  * public Card removeFirst();
  * public Card removeLast();
  * public Card peekFirst();
  * public Card peekLast();
  * public boolean isEmpty();
  * public int size();
  * public String toString();
  
## Rationale for Container
 - We came to the conclusion that the argument between an ArrayList vs a Doubly Linked List boiled down 
  to a question of space vs. efficiency. An ArrayList would use less space, but its adding and removing
  methods would be less efficient. A Doubly Linked List on the other hand would have O(1) efficiency in 
  its methods, but would take up much more space in each node. We decided to prioritize memory, so we chose the ArrayList.
