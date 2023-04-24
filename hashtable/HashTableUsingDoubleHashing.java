package hashtable;



public class HashTableUsingDoubleHashing {

	private Node[] table;
	
	// to refer to no of a rows filled ;
	private int size;
	private int tableSize ;
	
    public HashTableUsingDoubleHashing() {
		this(11);
	
    }
    public HashTableUsingDoubleHashing(int capacity) {
    	
    	/*
    	 * by making table size a prime number we can reduce collision;
    	*/
        if (!isPrime(capacity)) {
        	capacity =getNextPrime(capacity);
        }
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
    public boolean isPrime(int tableSize) {
		for (int i = 2 ; i*i< tableSize; i++) {
			if (tableSize%i==0) {
				return false;
			}
		}
		return true;
	}
    
    public int getNextPrime(int tableSize) {
    	while (true) {
			if (isPrime(tableSize)) {
				return tableSize;
			}
			tableSize++;
		}
    }
    
    public int hashingOne(int key) {
		return key % table.length;
	}
    public int hashingTwo(int key) {
    	 return 3 - (key % 3);//any prime number can be used 
  
	}
    public void put(Integer key, String value ) {
 	   

    	int hashIndex = hashingOne(key);
    	int stepSize  = hashingTwo(hashIndex);
    	
    	//considering the case were the table is completely filled 
    	//no new key cannot be inserted but there is a possibility 
    	//we could change value of the existing key;
          
    	int i=0;
    	while(table[hashIndex]!= null && i<tableSize) {
    		if (table[hashIndex].key.equals(key)) {
				table[hashIndex].value = value;
				return;
			}
    		hashIndex = (hashIndex + stepSize)% tableSize;
    		i++;
    	}
    	
    	if(i==tableSize) {
    		System.out.println("cannot insert the key as the table is completely filled.");
    		return;
    	}
    	table[hashIndex] = new Node(key, value);
    	size++;
    } 
    public String get(Integer key) {
    	
    	int hashIndex = hashingOne(key);
    	int stepSize  = hashingTwo(hashIndex);
    	
    	int i = 0;
    	
    	while(table[hashIndex]!=null && i<tableSize) {
    		if (table[hashIndex].key.equals(key)) {
				return table[hashIndex].value;
						
			}
    		hashIndex = (hashIndex+stepSize)%tableSize;
    		i++;
    	}
    	return "key not found.";
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
		HashTableUsingDoubleHashing table = new HashTableUsingDoubleHashing(5);
		
		table.put(5, "they");
		table.put(12, "set fire ");
		
		table.put(3, "to rain");
		table.put(16, "obito");
		table.put(14, "konan");
		
		table.display();
		table.put(7, "itachi");
		System.out.println();
		table.display();
		System.out.println(table.get(16));
		System.out.println(table.get(23));
	}
  
   
}
