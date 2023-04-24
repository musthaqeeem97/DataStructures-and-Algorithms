package queue;

public class DynamicCircularQueueUsingArray  extends CircularQueueUsingArray{

	public DynamicCircularQueueUsingArray() {
		super();
	}
	public DynamicCircularQueueUsingArray(int size) {
		super(size);
	}
	
	@Override
	public boolean offer(int item) {
		// TODO Auto-generated method stub
		if (isFull()) {
			int[]temp = new int[data.length*2];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[(front+i)%data.length];
			}
			front = 0;
			end = data.length;
			data = temp;
		}
		return super.offer(item);
	}
}

