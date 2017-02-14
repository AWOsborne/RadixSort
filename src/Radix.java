
/**
 * Class for a radix sort using queues.
 * 
 * @author Drew Osborne
 *
 */
public class Radix
{
	// Variables for data.
	private Queue[] buckets;
	boolean flag;
	int divisor;
	private final int SIZE = 10;


	public Radix()
	{
		// Initialize holding array and fill with queues.
		buckets = new Queue[SIZE];
		for (int i = 0; i < buckets.length; i++)
		{
			buckets[i] = new Queue();
		}
		// Initialize variables for sorting.
		flag = true;
		divisor = 1;
	}


	public Queue sort(Queue inq) throws QueueEmptyException
	{
		while (flag)
		{
			// Sort them into the buckets.
			flag = false;
			while (!inq.isEmpty())
			{
				// Check the significant digit.
				int tmp = inq.remove();
				int hashIndex = (tmp / divisor) % 10;
				if (hashIndex > 0)
				{
					flag = true;
				}
				buckets[hashIndex].add(tmp);
			}
			// Increase the divisor to sort by the next significant digit.
			divisor *= 10;
			// Put them back into the main list.
			for (int i = 0; i < buckets.length; i++)
			{
				while (!buckets[i].isEmpty())
				{
					inq.add(buckets[i].remove());
				}
			}
		}
		// Return the sorted list.
		return inq;
	}
}
