package test;



public class TrieTest {

	private TrieNode root ;
	
	private void TrieNode() {
		
    this.root = new TrieNode();
	}
	
	class TrieNode {
		
		private TrieNode[] children ;
		private boolean isEndofWord ;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isEndofWord = false;
		}
	}
	
	public void insert(String word) {
		
		TrieNode currentNode = root;
		
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			
			int charindex = character -'a';
			
			if (currentNode.children[charindex] == null) {
				currentNode.children[charindex] = new TrieNode();
				currentNode = currentNode.children[charindex];
			}else {
				currentNode = currentNode.children[charindex] ; 
			}
			
		}
		currentNode.isEndofWord = true;
		
		
	}
	
	public boolean search(String word) {
		
		TrieNode currentNode = root;
		
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			int charIndex = character - 'a';
			
			if (currentNode.children[charIndex] == null) {
				return false;
			}
			currentNode = currentNode.children[charIndex];
		}
		
		return currentNode!=null && currentNode.isEndofWord ;
	}
	
	public boolean isPrefix(String word) {
		TrieNode currentNode = root;
		
		for (int i = 0; i < word.length(); i++) {
			
			char character = word.charAt(i);
			int charIndex = character - 'a';
			
			if (currentNode.children[charIndex] == null) {
				return false;
			}
			
			currentNode = currentNode.children[charIndex];
		}
		return currentNode!=null;
	}
}
