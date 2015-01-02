public class Stack
{
	private Node top;
	Stack()
	{
		top = null;
	}
	
	void push(String str)
	{
		Node nd = new Node(str);
		nd.setNext(top);
		top = nd;
	}
	
	Node pop()
	{
		Node nd = top;
		if(top != null)
		{
			top = top.getNext();
		}
		return nd;
	}
	void print()
	{
		if(top == null)
		{
			System.out.println("Stack is Empty !!!");
			return;
		}
		
		// pop each node one by one and print its data and push it in a temporary stavk
		Node temp = pop();
		Stack tmpStack = new Stack();
		while(temp != null)
		{
			System.out.println(temp.getData());
			tmpStack.push(temp.getData());
			temp = pop();
			
		}
		
		// pop each node of temp stack and push it in original stack
		temp = tmpStack.pop();
		while(temp != null)
		{
			push(temp.getData());
			temp = tmpStack.pop();
			
		}
	}
}
