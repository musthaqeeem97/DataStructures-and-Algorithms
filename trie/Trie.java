package trie;


public class Trie {
	
	private TrieNode root ;
	
	public Trie() {
		this.root = new TrieNode();
	}
	
	class TrieNode{
		private TrieNode[] children;
		private boolean isEndOfWord;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isEndOfWord = false;
		}
		
	}
	public void insert(String word) {
		 if (word == null || word.isEmpty()) {
	         throw new IllegalArgumentException("Invalid input");
	      }

	     word = word.toLowerCase();
		 TrieNode current = root;
		
		 for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			int index = character - 'a';
			
			if(current.children[index]==null) {

				current.children[index] =  new TrieNode();
				current = current.children[index];
			}else {
				current = current.children[index];
			}
			
		 }
		
		 current.isEndOfWord = true;
	}
	public boolean search(String word) {
		
		TrieNode currernt = root;
		
        for (int i = 0; i < word.length(); i++) {
        	
			char character = word.charAt(i);
			int index = character - 'a';
			
			if (currernt.children[index]== null) {
				return false;
			}
			currernt = currernt.children[index];
		}
        
        return currernt!=null&& currernt.isEndOfWord;
	}
	public boolean startsWith(String prefix) {
		
		TrieNode current = root;
		
		for (int i = 0; i < prefix.length(); i++) {
			char character = prefix.charAt(i);
			int index = character - 'a';
			
			if (current.children[index]== null) {
				return false;
			}
             current = current.children[index];
		}
		
		return current!= null;
	}
	
    public boolean delete(String word) {
    	return delete(root,word,0);
    }
    public boolean delete(TrieNode current ,String word,int index) {
  
    	//check whether the last character of the word is reached.
    	if (index == word.length()) {
    		
    		//check whether the endOfWord == true .
    		if(!current.isEndOfWord) {
    			//as word does not exist it cannot be deleted so return false
    			return false;
    		}
    		
    		//if the word does exist make endOfword false
    		current.isEndOfWord = false;
    		
    		//to delete the word make sure that the the node does not have children 
    		//if children exist the word cannot be deleted 
    		//ex:"ha" is the word to be deleted but there  be word like "hat","hand" etc;
   
    		// returns true if current has no children
    		return hasNoChildren(current);
		}
    	
    	
    	 int charIndex = word.charAt(index) -'a';
    	 
    	//return false as no Node to delete
    	 if(current.children[charIndex] == null) return false;
    	 
    	 
    	 boolean canDelete = delete(current,word,index+1);
    	 
    	 if (canDelete) {
    		//delete the node
			current.children[charIndex] = null;
			
			// return true if current has not other child;
			return hasNoChildren(current);
		}
    	 //the node cannot be deleted so return false
    	 return false;
    }
	private boolean hasNoChildren(TrieNode current) {
		
		 for (TrieNode chileNode : current.children) {
	        if (chileNode!=null) {
	        	//child node exist so current has children.
				return false;
			}
	        
		} return true;
	}
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("hello");
		trie.insert("ok");
		trie.insert("hai");
		trie.insert("hell");
		
		System.out.println(trie.search("hello"));
		System.out.println(trie.search("hellows"));
		System.out.println(trie.startsWith("ha"));
		System.out.println(trie.startsWith("ki"));
				
	System.out.println();
		
		System.out.println(trie.startsWith("hai"));
		System.out.println(trie.delete("hai"));
		System.out.println(trie.startsWith("hai"));
		System.out.println(trie.delete("ok"));
		
		System.out.println();
		System.out.println(trie.delete("hello"));
		System.out.println("after deleting:");
		System.out.println(trie.search("hello"));
		
	}

}
