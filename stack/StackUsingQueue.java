package stack;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	private Queue<Integer> mainQueue;
	private Queue<Integer> helperQueue;
	
	public StackUsingQueue() {
	
		this.mainQueue = new LinkedList<>();
		this.helperQueue = new LinkedList<>();
		
	}
	
	public void push(Integer item ) {
		
		helperQueue.add(item);
		
		while (!mainQueue.isEmpty()) {
			helperQueue.add(mainQueue.remove());
		}
		
		Queue<Integer> temp = mainQueue;
		mainQueue = helperQueue;
		helperQueue = temp;
	}
	
	public Integer pop() throws Exception {
		if(mainQueue.isEmpty()) throw new Exception(" the stack is empty.");
		
		int popedElement = mainQueue.remove(); 
		
		return popedElement;
	}
	
	public Integer peek() throws Exception {
		if(mainQueue.isEmpty()) throw new Exception(" the stack is empty.");
		
		int peekedElement = mainQueue.peek(); 
		
		return peekedElement;
	}
	
	public void display() throws Exception {
		
		if (mainQueue.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		
		System.out.print("end");
		while(!mainQueue.isEmpty()) {
			int item = mainQueue.poll();
			System.out.print("-->"+ item);
			helperQueue.add(item);
		}
		System.out.println();
	    
		Queue<Integer> temp = mainQueue;
		mainQueue = helperQueue;
		helperQueue = temp;
	 }

	public static void main(String[] args) throws Exception {
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();;
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		stack.display();
		
		System.out.println(stack.pop());
		//stack.display();
	}
}
