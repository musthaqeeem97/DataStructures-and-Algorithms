package stack;




public class TestStack {

	public static void main(String[] args) throws StackUsingArrayException  {
		DynamicStackusingArray stack = new DynamicStackusingArray(5);
		
		int[] arr = {4,2,3,1,9};
		
		for (int i : arr) {
			stack.push(i);
		}
		
		for (int i : stack.data) {;
			System.out.print(i+" ");
		}
		System.out.println();
		stack.push(7);
		System.out.println();
		for (int i : stack.data) {;
		System.out.print(i+" ");
	}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			
			int deletedelement = stack.pop();
			System.out.print(deletedelement + " ");
		} 
			
		//stack.pop();
		
	}
}
