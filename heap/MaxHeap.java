package heap;

import java.util.NoSuchElementException;

public class MaxHeap {

	Integer[] heap;
	int n;
	
	public MaxHeap(int capacity) {
		this.heap = new Integer[capacity+1];
	}
	public boolean isEmpty() {
		return n == 0;
	}
	public int size () {
		return n;
	}
	public void insert(Integer value) {
		if(n==heap.length-1) {
			increaseSize(2*heap.length);
		}
		n++;
		heap[n] = value;
		swim(n);
	}
	private void increaseSize(int newLength) {
		Integer[] temp = new Integer[newLength];
		for (int i = 1; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
		
	}
	private void reduceSize(int newLength) {
		Integer[] temp = new Integer[newLength];
		for (int i = 1; i < temp.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
		
	}
	public void swim(int k) {
		while(k>1 && heap[k/2]< heap[k]) {
			swap(k/2,k);
			k = k/2;
		}
	}
	public void swap(int a ,int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public void display() {
		for (int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	
	public int remove() {
		if (isEmpty()) {
			System.out.println("heap is empty");
			throw new NoSuchElementException();
		}
		int max = heap[1];
		swap(1, n);
		n--;
		sink(1);
		heap[n+1] = null;
		if (n>0 && (n==(heap.length-1)/4)) {
			reduceSize(heap.length/2);
		}
		return max;
		
	}
	private void sink(int k) {
		while(2*k<=n) {
			int j = 2*k;
		if (j<n && heap[j]<heap[j+1]) {
			j++;
		}
	    if(heap[k]>heap[j]) {
			break;
		}
	    swap(k, j);
	    k = j;
		}
		
	}
	public static void main(String[] args) {
		MaxHeap maxHeap = new MaxHeap(4);
		maxHeap.insert(7);
		maxHeap.insert(4);
		maxHeap.insert(9);
		maxHeap.insert(5);
		maxHeap.display();
		
		maxHeap.remove();
		System.out.println();
		maxHeap.display();
		maxHeap.remove();
		System.out.println();
		maxHeap.display();
		maxHeap.remove();
		System.out.println();
		maxHeap.display();
		maxHeap.remove();
		System.out.println();
		maxHeap.display();
		maxHeap.remove();
		System.out.println();
		maxHeap.display();
	}
}
