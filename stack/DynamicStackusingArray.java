package stack;


public class DynamicStackusingArray extends StackUsingArray{

	public DynamicStackusingArray() {
		super();
	}
	
	public DynamicStackusingArray(int size) {
		super(size);
	}
	
	@Override
	public int push(int item) throws StackUsingArrayException  {
		
		if (this.isFull()) {
			
		 int[] temp = new int[data.length * 2];
		 for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		    data = temp;
	   
		}
		return super.push(item);
	}
}
