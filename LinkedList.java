// CREATION OF SINGLE LINKED LIST

public class LinkedList{
	// Private member variable called head
	// An instance of Node class
	private Node head;
	
	// default Constructor 
	// set head to null;

	public LinkedList()
	{
		head = null;
	}

	// return the size of linked

	public int size()
	{
		int count = 0;
		for(Node curr = head ; curr != null; count++,curr=curr.next);
		return count;
	}

	// add data at the beginning of linked using data that is pass as argument
	public void prepend(int data)
	{
		// check if link is empty
		if (head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}

	// add data according to argument index
	public void indexInsertion(int data, int index)
	{
		if ( index == 0)
		{
			this.prepend(data);
		}

		else if ( index == size())
		{
			this.append(data);
		}

		else if(index > 0 && index <size())
		{
			int count = 0;
			Node curr = head;
			Node prev = null;

			for(;count != index; count++, prev = curr, curr=curr.next);
			Node newNode = new Node(data);
			newNode.next = curr;
			prev.next = newNode;
		}
	}

	// add data at the end
	public void append(int data)
	{
		// check if head is null
		if (head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node curr = head;
			for(;curr.next != null; curr = curr.next);
			curr.next = new Node(data);
		}
	}

	// override toString
	@Override
	public String toString()
	{
		String str = "";
		for(Node curr = head; curr != null; str+=curr.getData()+",",curr=curr.next);
		str = str.substring(0, str.length() - 1);
		return str;
	}

	// reverse the link using O(n)

	public void reverse()
	{

		if (head != null && size() > 1)
		{
			Node curr = head;
			Node prev = null;
			Node prevprev = null;
			boolean flag = false;

			for(;curr != null;prevprev = prev,prev=curr,curr = curr.next)
			{
				if(flag == false)
				{
					if(prevprev != null)
					{
						prevprev.next = null;
						prev.next = prevprev;
						flag = true;
					}
				}
				else
				{
					prev.next = prevprev;
				}
			}
			if (size() == 2)
			{
				prevprev.next = null;
				prev.next = prevprev;
			}
			else
			{
				prev.next = prevprev;
			}
			head = prev;
		}
	}

}

