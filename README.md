# Lonely_Island
## Piotr Milewski, Daniel Regassa, Edwin Mok

## Method Selections

  * ~~~~public void addFirst( Card card );~~~~ 
    * Add an item at the front end of the deque
    * We chose the addFirst() because we aren't using a capacity-restricted deque and we would prefer for it to throw an exception over returning a special value since the user shouldn't be putting elements of different types in the Deque.
  * ~~~~public void addLast( Card card );~~~~
    * Add an item at the back end of the deque
    * We chose the addLast() because we aren't using a capacity-restricted deque and we would prefer for it to throw an exception over returning a special value since the user shouldn't be putting elements of different types in the Deque.
  * ~~~~public Card removeFirst();~~~~
    * Remove the item at the front end of the deque
    * We chose the removeFirst() because we prefer for the program to throw a NoSuchElementException to notify the user why his remove request couldn't be processed.
  * ~~~~public Card removeLast();~~~~
    * Remove the item at the back end of the deque
    * We chose the removeLast() because we prefer for the program to throw a NoSuchElementException to notify the user why his remove request couldn't be processed.
  * ~~~~public Card peekFirst();~~~~
    * Return the item at the front end of the deque
    * We chose the peekFirst() because we would prefer for the program to return null if there is nothing in the Deque rather than terminating the program with an exception.
  * ~~~~public Card peekLast();~~~~
    * Return the item at the back end of the deque
    * We chose the peekLastFirst() because we would prefer for the program to return null if there is nothing in the Deque rather than terminating the program with an exception.
  * ~~~~public boolean isEmpty();~~~~
    * Check to see if the deque is empty
    * We chose the isEmpty() because it is a useful helper method for some of our other methods and could tell the user when his Deque doesn't contain anything.
  * ~~~~public int size();~~~~
    * Accessor for the size of the deque
    * We chose the size() because it is useful for the user to see how many items are inside his Deque at any given time.
  * ~~~~public boolean contains( Card card );~~~~
    * Checks to see if deque contains the specified element
    * We chose the contains() because it is useful for the user to check to see if an item could be found in his Deque.
  * ~~~~public String toString();~~~~
    * Prints out the items in the deque, from front end to back end
    * We chose the toString() to overwrite the given toString() and to show the content of the Deque in an orderly fashion.

  
## Rationale for Container
 - We came to the conclusion that the argument between an ArrayList vs a Doubly Linked List boiled down to a question of space vs. efficiency. 
 - While an Arraylist would use less space, its add and remove method for the first index would be less efficient than those of the Doubly Linked List for large lists due to the necessity of having to move the contents of the List down one space resulting in an O(n) runtime. A Doubly Linked List on the other hand would have an O(1) efficiency for all of its add and remove methods due to the fact that it can utilize its front and end pointers to manipulate the their respective nodes, but it would take up more more space due to having to create a new Node every time that you add or remove. 
 - Although the add method and remove method of a Doubly Linked List are faster than those of an ArrayList for large lists, this is not true when processing small lists. This is due to the fact that it takes the JVM time to allocate the memory for a node before we can fill it with content. During Mr. Brown's discussion on C, we learned that the JVM manages memory for us whenever we want to create a node and its garbage collector takes the time to process nodes whenever we want to get rid of a node. This fact leads to the conclusion that for small scale lists an Arraylist would be faster and there would be an eventual cutoff point where a Doubly Linked List's runtime starts being faster than that of an Arraylist.
 - If some team that used the Doubly Linked List approach would share their code with use then we would be more than happy to run some tests to test this phenomenon.
