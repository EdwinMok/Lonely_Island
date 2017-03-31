public interface Deque<Card>
{
    public void addFirst( Card card );

    public void addLast( Card card );
   
    public Card removeFirst();

    public Card removeLast();

    public Card peekFirst();

    public Card peekLast();

    public boolean isEmpty();

}
