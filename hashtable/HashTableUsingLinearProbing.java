package hashtable;



public class HashTableUsingLinearProbing {
	private Node[] buckets;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public HashTableUsingLinearProbing() {
		this(DEFAULT_CAPACITY);
	}
	public HashTableUsingLinearProbing(int capacity) {
		this.size = capacity; 
		this.buckets = new Node[size]; 
		
	}
	
	private class Node{
		Integer key;
		String value;

		public Node(Integer key,String value) {
			this.key = key;
			this.value = value;

		}
				
	}
	public int Hashing(Integer key) {
		return key % size;
	}
	public void put(Integer key, String value) {
		int index = Hashing(key);
		int probes =1;
		if(buckets[index] == null || buckets[index].key.equals(key)) {
			buckets[index] = new Node(key, value);;
			return;
		}
		int i =1;
	
		while(i<size) {
			index = (index+1)%size;
			
			if(buckets[index] == null || buckets[index].key.equals(key)) {
				buckets[index] = new Node(key, value);
				return;
			}
			i++;
			probes++;
		}
		
	
			System.out.println("insert failed as the bucket is completely filled.");
		    
	}
	public String get(Integer key) {
		if(key == null ) {
	         throw new IllegalArgumentException("Key is null !!!");
	      }
		
		
		int index = Hashing(key);

		if (buckets[index]!= null && buckets[index].key.equals(key)) {
			return buckets[index].value;
		}else {
			int i = 1;
			while(i<size) {
				index = (index +1)%size;
				if (buckets[index]!= null && buckets[index].key.equals(key)) {
					return buckets[index].value;
				}
				i++;
			}
		}
		return "key not found";
	}
	public String remove(Integer key) {
		
		if(key == null ) {
	         throw new IllegalArgumentException("Key is null !!!");
	      }
		int index = Hashing(key);
		
		if(buckets[index]!= null && buckets[index].key.equals(key)) {
			String removedNode = buckets[index].value; 
			buckets[index]= null;
			return removedNode;
		}else {
			int i = 1;
			while(i<size) {
				index = (index+1)%size;
				if(buckets[index]!= null && buckets[index].key.equals(key)) {
					Node removedNode = buckets[index]; 
					buckets[index]= null;
					return removedNode.value;
				}
				i++;
			}
			
		}
	
		return "key not found";
	}
	
	public void display() {
		for (int i = 0; i < buckets.length; i++) {
			
			if (buckets[i]!= null) {
				System.out.println(buckets[i].key+","+buckets[i].value);
			} else {

				System.out.println(buckets[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		HashTableUsingLinearProbing table= new HashTableUsingLinearProbing(5);
	
		table.put(1, "hi");
		table.put(6, "hello");
	
		
	
		table.display();
		
		System.out.println(table.get(1));
		System.out.println(table.get(6));
		System.out.println(table.get(7));
		System.out.println(table.remove(6));
		System.out.println(table.remove(6));
		
	}
	
}
 