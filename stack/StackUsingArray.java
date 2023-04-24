package stack;

import java.util.EmptyStackException;

public class StackUsingArray {

	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	int indexPointer = -1;
	
	public StackUsingArray() {
		this(DEFAULT_SIZE);
	}
	
	public StackUsingArray(int size) {
		this.data = new int[size];
	}
	
	public int push(int item)throws StackUsingArrayException {
		if(isFull()) throw new StackUsingArrayException("cannot push element as stack is full.");
		
		indexPointer++ ;
		data[indexPointer] = item;
		
		return item;
	}
	
	public int pop() throws StackUsingArrayException{
		if(isEmpty()) throw new StackUsingArrayException("cannot pop element from an empty stack.");
		
		return data[indexPointer--];
	}
	
	 public int peek()throws StackUsingArrayException{
	        if(isEmpty()){
	            throw new StackUsingArrayException("cannot peek element from an Empty stack.");
	        }
	        return data[indexPointer];
	    }
	public boolean isFull() {
		return indexPointer == data.length-1;
	}
	
	public boolean isEmpty() {
		return indexPointer == -1;
	}
	
	
}
