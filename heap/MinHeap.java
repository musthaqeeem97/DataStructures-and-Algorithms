package heap;

import java.nio.channels.Pipe.SinkChannel;
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;



public class MinHeap {

	private Integer[] heap;
	
	//length of the heap not the array capacity
	private int n;
	
    public MinHeap(int capacity) {
    	this.heap = new Integer[capacity+1];
    	this.n=0;
    }
    public boolean isEmpty() { 
    	return n==0;
    }
    public int size() {
    	return n;
    }
    public void increaseCapacity(int capacity) {
    	Integer[] temp  = new Integer[capacity];
    	for (int i = 1; i < heap.length; i++) {
			temp[i] =heap[i];
		}
    	heap = temp;
    }
   
    
    //bottom-up reheapify
    public void swim(int k) {
    	
    	//
    	while(k>1 && heap[k]<heap[k/2]) {
    		//swap
    		int temp = heap[k];
    		heap[k] = heap[k/2];
    		heap[k/2] = temp;
    		
    		//changing value of k to its parent for traversal
    		k = k/2;
    	}
    }
    public void insert(int value) {
    	if (n==heap.length-1) {
			increaseCapacity(heap.length*2);
		}
    	//n++;
    	heap[++n] = value ;
    	swim(n);
    }
    
    public void reduceSize(int capacity) {
    	Integer temp[] = new Integer[capacity];
    	for (int i = 1; i < temp.length; i++) {
			temp[i]=heap[i];
		}
    	heap = temp;
    }
    //top-down reheapify
    private void sink(int k) {
		while(2*k<=n) {
			int j = 2*k;
			
			//
			if(j < n && heap[j]>heap[j+1]) {
				j++;
			}
			//swap 
			int temp = heap[k];
			heap[k] = heap[j];
			heap[j] = temp;
			
			k = j;
		}
		
	}
    public int remove() {
    	if (isEmpty()) {
			System.out.println("heap is empty.");
			throw new NoSuchElementException();
		}
    	int min = heap[1];
    	
    	//swap
    	int temp = heap[1];
    	heap[1] = heap[n];
    	heap[n--] = temp;
    	
    	sink(1);
    	
    	heap[n+1] = null;
    	if (n>0 && (n== heap.length-1/4)) {
			reduceSize(heap.length/2);
		}
    	return min;
    	
    }
	
    public void display() {
    	for (int i = 1; i <= n; i++) {
		  System.out.print(heap[i] +" ");	
		}
    }
    public static void main(String[] args) {
		MinHeap minHeap= new MinHeap(4);
		minHeap.insert(7);
		minHeap.insert(4);
		minHeap.insert(9);
		minHeap.insert(5);
		minHeap.display();
		
		minHeap.remove();
		System.out.println();
		minHeap.display();
	}
}
