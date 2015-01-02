public class Queue 
{
	private Node front;
	private Node back;
	Queue()
	{
		front = null;
		back = null;
	}

	void enQueue(String str)
	{
		Node nd =  new Node(str);
		if(front == null)
		{
			front = nd;
			back = nd;
			return;
		}
		back.setNext(nd);
		back = nd;
		
	}
	
	Node deQueue()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty !!!");
			return null;
		}
		Node nd = front;
		// only one node
		if(front == back)
		{
			front = null;
			back = null;
		}
		else
		{
			front = front.getNext();
		}
		return nd;
	}
	
	void print()
	{
		for(Node temp = front; temp != null; temp = temp.getNext())
		{
			System.out.println(temp.getData());
		}
	}
}
