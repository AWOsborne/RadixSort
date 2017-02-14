
/**
 * Simple Node class to hold a single data value.
 * 
 * @author Drew Osborne
 *
 * @param <E>
 */
public class Node
{
	private int data;
	private Node next;


	/**
	 * Empty Constructor
	 */
	public Node()
	{
		next = null;
	}


	/**
	 * Constructor
	 * 
	 * @param data
	 *           Value
	 * @param next
	 *           Next node in the list.
	 */
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}


	/**
	 * Assigns the next node to point to.
	 * 
	 * @param next
	 *           The next node to point to.
	 */
	public void setNext(Node next)
	{
		this.next = next;
	}


	/**
	 * Returns what the current node is pointing to.
	 * 
	 * @return What the current node is pointing to.
	 */
	public Node getNext()
	{
		return next;
	}


	/**
	 * Returns the data value the node is holding.
	 * 
	 * @return The data value the node is holding.
	 */
	public int getData()
	{
		return data;
	}
}
