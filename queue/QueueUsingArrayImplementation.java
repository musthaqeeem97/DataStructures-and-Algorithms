package queue;



public class QueueUsingArrayImplementation {

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int end = 0;
	
	public QueueUsingArrayImplementation() {
		this(DEFAULT_SIZE);
	}
	public QueueUsingArrayImplementation(int size) {
		this.data = new int[size];
	}
	
	public boolean offer(int item) {
		if(isFull()) return false;
		data[end++] = item;
		return true;
		
	}

	public int remove() throws Exception {
		if (isEmpty()) throw new Exception("cannot remove element as the queue is empty.");
			
		int deletedElement = data[0]; 
		for (int i = 1; i < end; i++) {
			
			  data[i-1] = data[i];	  
		}
		data[end-1] = 0;
		  end--;
		  return deletedElement;
		}
	
	public int  peek() throws Exception {
	
		if(isEmpty()) {
			throw new Exception("cannot peek  as the queue is empty.");
		}
		return data[0];
	}
	
	public void display() {
		for (int i = 0; i < end; i++) {
			System.out.print(data[i]+"<--");
		}
		System.out.println("end");
	}
	public boolean isEmpty() {
		return end == 0;
	}
	public boolean isFull() {
		return end == data.length;
	}
	public static void main(String[] args) throws Exception {
		QueueUsingArrayImplementation queue = new QueueUsingArrayImplementation(5);
		queue.offer(5);
		queue.offer(3);
		queue.offer(7);
		queue.offer(12);
		queue.offer(11);
		System.out.println(queue.offer(6));
		
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		System.out.println(queue.remove());
		queue.display();
	
	}
}
 