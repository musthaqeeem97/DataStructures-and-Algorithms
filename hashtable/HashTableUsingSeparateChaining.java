package hashtable;

public class HashTableUsingSeparateChaining {

	private HashNode[]buckets;
	private int noOfBuckets;
	private int size;
	public HashTableUsingSeparateChaining() {
		this(10);
	}
	public HashTableUsingSeparateChaining(int capacity) {
		this.noOfBuckets = capacity;
		buckets = new HashNode[capacity];
	}
	class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key ,String value) {
			this.key = key;
			this.value = value;
		}
	}
	public int getBucketIndex(Integer key) {
		return key %noOfBuckets;
	}
	public void put(Integer key, String value) {
		
		if(key == null || value == null) {
	         throw new IllegalArgumentException("Key or Value is null !!!");
	      }
		
		int bucketIndex =  getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode newNode = new HashNode(key, value) ;
		newNode.next = head;
		buckets[bucketIndex] = newNode;
	}
	
	public int getSize() {
		return size;
	}
	public String get(Integer key) {
		if(key == null ) {
	         throw new IllegalArgumentException("Key is null !!!");
	      }
		
	    int bucketIndex = getBucketIndex(key);
	    HashNode head =  buckets[bucketIndex];
	    while (head != null) {
			if(head.key.equals(key))return head.value;
			head = head.next;
		}
	    return null;
	}
	public String remove(Integer key) {
		if(key == null ) {
	         throw new IllegalArgumentException("Key is null !!!");
	      }
		
		int bucketIndex = getBucketIndex(key);
		HashNode head  = buckets[bucketIndex];
		HashNode previous = null;
		while(head!= null) {
		if(head.key.equals(key)) break;
		
		previous = head;
		head = previous.next;
		}
		if(head==null)return null;
		
		size--;
		if(previous == null) {
			buckets[bucketIndex] =head.next;	
		}else {
			previous.next = head.next;
		}
		
		return head.value;
		
	}
	public static void main(String[] args) {
		HashTableUsingSeparateChaining hash = new HashTableUsingSeparateChaining();
		hash.put(86, "zoro");
		hash.put(23, "luffy");
		hash.put(8, "nami");
		hash.put(33, "sanji");
		hash.put(23, "straw hat");
	    
		System.out.println(hash.size);
		System.out.println(hash.getSize());
		System.out.println(hash.get(23));
		System.out.println(hash.remove(8));
		System.out.println(hash.size);
		
		System.out.println(hash.get(8));
	}
	
}
