
/**
 * EmptyQueueException class for a simple queue.
 * 
 * @author Drew Osborne
 *
 */
public class QueueEmptyException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Constructor which calls super with empty.
	 */
	public QueueEmptyException()
	{
		super();
	}


	/**
	 * Constructor which calls super with string.
	 */
	public QueueEmptyException(String message)
	{
		super(message);
	}


	/**
	 * Constructor which calls super with string and clause.
	 */
	public QueueEmptyException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
