package queue;

import java.util.Stack;

public class QueueUsingStackRemoveEfficient {
	 private Stack<Integer> mainStack;
	 private Stack<Integer> helperStack;
	 
	 public QueueUsingStackRemoveEfficient() {
		this.mainStack = new Stack<>();
		this.helperStack = new Stack<>(); 
	}
	 
	 public void add(Integer item) {
		 if (mainStack.isEmpty()) {
			 mainStack.push(item);
	         return;
		 }
		 while (!mainStack.isEmpty()) {
			helperStack.push(mainStack.pop());
		}
		 mainStack.push(item);
          
		 while (!helperStack.isEmpty()) {
				mainStack.push(helperStack.pop());
			}
		 
	 }
	 
	 public Integer remove() throws Exception {
		 
		 if (mainStack.isEmpty()) {
			throw new Exception("Queue is empty.");
			
		}
		 
		 return mainStack.pop();
	 }
	public Integer peek() throws Exception {
		 
		 if (mainStack.isEmpty()) {
				throw new Exception("Queue is empty.");
				
			}
			 
			 return mainStack.peek();
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

		QueueUsingStackRemoveEfficient queue = new QueueUsingStackRemoveEfficient();
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
