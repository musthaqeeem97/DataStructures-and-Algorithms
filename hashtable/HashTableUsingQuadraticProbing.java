package hashtable;


public class HashTableUsingQuadraticProbing {

	private Node[] table ;
	private int tableSize;
	
	public HashTableUsingQuadraticProbing(int capacity) {
		this.tableSize = capacity;
		this.table = new Node[tableSize];
	}
	class Node{
		private Integer key;
		private String value;
		
		public Node(Integer key,String value) {
			this.key = key;
			this.value = value;
		}
		
	}
	public void put(Integer key, String value) {
		
		if (key == null) {
			System.out.println("null cannot be used as key;");
			return;
		}
		
		int hashIndex = key % tableSize;
		if(table[hashIndex]==null || table[hashIndex].key.equals(key) ) {
			table[hashIndex] = new Node(key,value);
			return;
		}
			int i = 1;
			while(i<tableSize) {
				int index = (hashIndex + i*i)%tableSize;
				if(table[index]==null || table[index].key.equals(key) ) {
					table[index] = new Node(key,value);
					return;
				}
				i++;
			}
			System.out.println("could'nt insert node.");
	}
	public int hashing(Integer key) {
		return key%tableSize;
	}
	
	public String get(Integer key) {
		int hashIndex =  hashing(key);
		
		if(table[hashIndex]!= null && table[hashIndex].key.equals(key)) {
		 return table[hashIndex].value;	
		}
		int i = 1;
		while (i<tableSize) {
			int index = (hashIndex+i*i)/tableSize;
			if(table[index]!= null && table[index].key.equals(key)) {
				 return table[index].value;	
				}
			i++;
		}
		return "key was not found.";
	
	}
	public String remove(Integer key) {
		int hashIndex =  hashing(key);
		if(table[hashIndex]!= null && table[hashIndex].key.equals(key)) {
			
			Node removedNode = table[hashIndex];
			 table[hashIndex] = null;
			 return removedNode.value;	
			}
		int i =1;
		while (i<tableSize) {
			int index = (hashIndex+i*i)/tableSize;
			if(table[index]!= null && table[index].key.equals(key)) {
				
				Node removedNode = table[index];
				 table[index] = null;
				 return removedNode.value;	
				}
			i++;
		}
		return "the key to be deleted was not found.";
		
	}
	
	public void display() {
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				System.out.println(table[i].key+", "+table[i].value );
			}else {
				System.out.println(table[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		HashTableUsingQuadraticProbing table = new HashTableUsingQuadraticProbing(5);
		table.put(5, "they");
		table.put(12, "set fire ");
		
		table.put(3, "to rain");
		table.put(16, "obito");
		table.put(14, "konan");
		table.display();
		System.out.println(table.remove(5));
		System.out.println(table.remove(12));
		System.out.println(table.remove(3));
		System.out.println(table.remove(16));
		System.out.println(table.remove(14));
		table.display();
		System.out.println(table.remove(14));
		
	}
	
}
