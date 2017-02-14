
/**
 * Simple generic Queue to hold data.
 * 
 * @author Drew Osborne
 *
 * @param <E>
 *           Type of Node to hold.
 */
public class Queue
{
	private Node head;


	/**
	 * Constructor.
	 */
	public Queue()
	{
		head = null;
	}


	/**
	 * Adds a new node to the end of the queue.
	 * 
	 * @param num
	 *           Int value to add to the list.
	 */
	public void add(int num)
	{
		Node last = new Node(num, null);
		Node marker = head;
		// Check if first is empty.
		if (head == null)
		{
			head = last;
		}
		// Go to the end and place there.
		else
		{
			while (marker.getNext() != null)
			{
				marker = marker.getNext();
			}
			marker.setNext(last);
		}
	}


	/**
	 * Removes a node from the front of the queue and returns the int value.
	 * 
	 * @return Int value in the node.
	 * @throws QueueEmptyException
	 */
	public int remove() throws QueueEmptyException
	{
		if (isEmpty())
		{
			throw new QueueEmptyException("Queue is empty.");
		}
		else
		{
			// Removes the first Node and returns the int value contained.
			int tmp = head.getData();
			head = head.getNext();
			return tmp;
		}
	}


	/**
	 * Checks if the list is empty.
	 * 
	 * @return If the list is empty.
	 */
	public boolean isEmpty()
	{
		// Returns true if the head is null.
		return head == null;
	}
}
