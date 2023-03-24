// Stack using LL (5.1)
class StackUsingLL {

	private class Node {
		int data;
		Node link;
	}
	Node top;
	StackUsingLL() { this.top = null; }

	public void push(int x)	{
		Node temp = new Node();
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int peek(){
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public void pop(){
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).link;
	}

	public void display(){
		if (top == null) {
			System.out.printf("\nStack Underflow");
		}
		else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.link;
				if(temp != null)
					System.out.print(" -> ");
			}
		}
	}
}

class Main {
	public static void main(String[] args){
		StackUsingLL obj = new StackUsingLL();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);

		obj.display();

		System.out.printf("\nTop element is %d\n",obj.peek());

		obj.pop();
		obj.pop();

		obj.display();

		System.out.printf("\nTop element is %d\n",obj.peek());
	}
}