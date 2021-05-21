// Creation of Node class

public class Node {
	// private member variable of node called data which is of int data type
	private int data;
	// public member variable of node called next which is an instance of node class
	public Node next;

	// parameterized constructor
	public Node(int data)
	{

		this.data = data;
		this.next = null;
	}

	// Return private member variable so that it can be access by object outside class
	public int getData()
	{
		return data;
	}
}