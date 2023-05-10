package queue;

public class CircularQueueUsingArray {

	protected int[] data;
	protected int front = 0 ;
	protected int end = 0;
	int size = 0; 
	private static final int DEFAULT_CAP = 10;
	
	public CircularQueueUsingArray() {
		this(DEFAULT_CAP);
	}
	public CircularQueueUsingArray(int capacity) {
	 this.data = new int[capacity];
	}
	
	public boolean offer(int item) {
		if (isFull()) {
			System.out.println(" cannot offer the item as the queue is completely filled.");
			return false;
		}
		data[end++] = item;
		end%=data.length;
		size++;
		return true;
	
	}
	
	public int remove() throws Exception{
		if(isEmpty()) throw new Exception("cannot remove any item as the queue is empty.  ");
		int removedElement = data[front++];
		front%=data.length;
		size--;
		return removedElement;
	}
	public void display() {
		if (isEmpty()) {
			System.out.println("the queue is empty.");
			return;
		}
		int i = front;
		do {
			
			System.out.print(data[i++]+"<--");
			i%=data.length; 
		}while(i != end);
			System.out.println("end");
		
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size == data.length;
	}
	
	public static void main(String[] args) throws Exception {
		
		CircularQueueUsingArray queue = new CircularQueueUsingArray(5);
		queue.offer(4);
		queue.offer(3);
		queue.offer(7);
		queue.offer(1);
		queue.offer(9);
		queue.display();
		
		System.out.println(queue.remove());
		queue.display();
		queue.offer(5);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		//System.out.println(queue.remove());
		
		
	}
	
}
