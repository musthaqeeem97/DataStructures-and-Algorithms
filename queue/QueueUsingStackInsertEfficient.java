package queue;

import java.util.Stack;

public class QueueUsingStackInsertEfficient {

 private Stack<Integer> mainStack;
 private Stack<Integer> helperStack;
 
 public QueueUsingStackInsertEfficient() {
	this.mainStack = new Stack<>();
	this.helperStack = new Stack<>(); 
}
 
 public void add(Integer item) {
	 mainStack.push(item);
 }
 
 public Integer remove() throws Exception {
	 
	 if (mainStack.isEmpty()) {
		throw new Exception("Queue is empty.");
		
	}
	 
	 while(!mainStack.isEmpty()) {
	 helperStack.push(mainStack.pop());
	 }
	 
	 Integer removedItem = helperStack.pop();
	 
	 while (!helperStack.isEmpty()) {
		 mainStack.push(helperStack.pop());
	 }
	 
	 return removedItem;
 }
public Integer peek() throws Exception {
	 
	if (mainStack.isEmpty()) {
		throw new Exception("Queue is empty.");
		
	}
	 
	 while(!mainStack.isEmpty()) {
	 helperStack.push(mainStack.pop());
	 }
	 
	 Integer PeekedItem = helperStack.peek();
	 
	 while (!helperStack.isEmpty()) {
		 mainStack.push(helperStack.pop());
	 }
	 
	 return PeekedItem;
 }
 
public void display() throws Exception {
	
	if (mainStack.isEmpty()) {
		throw new Exception("Queue is empty.");
		
	}
	
	while(!mainStack.isEmpty()) {
		helperStack.push(mainStack.pop());
	}
	while (!helperStack.isEmpty()) {
	
		Integer item = helperStack.pop();
		mainStack.push(item);
		System.out.print(item+"<--");
	}
	System.out.println("end");
}
public static void main(String[] args) throws Exception {

	QueueUsingStackInsertEfficient queue = new QueueUsingStackInsertEfficient();
	queue.add(1);
	queue.add(2);
	queue.add(3);
	queue.add(4);
	queue.add(5);
	
	queue.display();;
	
	queue.remove();
	queue.remove();
	queue.remove();
	queue.remove();
	System.out.println(queue.peek());
	queue.display();
	
	System.out.println(queue.remove());
	//queue.display();
	
	
	
}
}
