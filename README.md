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
 - We came to the conclusion that the argument between an ArrayList vs a Doubly Linked List boiled down to a question of space vs. efficiency. 
 - While an Arraylist would use less space, its add and remove method for the first index would be less efficient than those of the Doubly Linked List for large lists due to the necessity of having to move the contents of the List down one space resulting in an O(n) runtime. A Doubly Linked List on the other hand would have an O(1) efficiency for all of its add and remove methods due to the fact that it can utilize its front and end pointers to manipulate the their respective nodes, but it would take up more more space due to having to create a new Node every time that you add or remove. 
 - Although the add method and remove method of a Doubly Linked List are faster than those of an ArrayList for large lists, this is not true when processing small lists. This is due to the fact that it takes the JVM time to allocate the memory for a node before we can fill it with content. During Mr. Brown's discussion on C, we learned that the JVM manages memory for us whenever we want to create a node and its garbage collector takes the time to process nodes whenever we want to get rid of a node. This fact leads to the conclusion that for small scale lists an Arraylist would be faster and there would be an eventual cutoff point where a Doubly Linked List's runtime starts being faster than that of an Arraylist.
 - If some team that used the Doubly Linked List approach would share their code with use then we would be more than happy to run some tests to test this phenomenon.
