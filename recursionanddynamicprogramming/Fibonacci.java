package recursionanddynamicprogramming;

public class Fibonacci {
	
	
    public int fib(int n) {
		
    	if(n==0||n==1) return n; 
    	int left = fib(n-1);
    	int right = fib(n-2);
    	return left + right ;//less optimum because certain sub structure is visiting again.
    	
	}
    
    public int fibBottomUpAproach (int n) {
    	int[] table = new int[n+1];
    	table[0] = 0;
    	table[1] = 1;
    	for (int i = 2; i < table.length; i++) {
			table[i] = table[i-1] + table[i-2]; 
		}
    	return table[n];
		
	}
    public int fibTopDownAproach(int[] memo, int n) {
    	
    	if (memo[n]==0) {// to check whether the number's array is visited
			if(n<2) {
				memo[n] = n;
			}else {
				
				int left = fibTopDownAproach(memo, n-1);
				int right = fibTopDownAproach(memo, n-2);
				
				memo[n]= left + right;
			}
		}
    	
    	return memo[n];
    }
     public static void main(String[] args) {
       
    	 Fibonacci f = new Fibonacci();
    	 System.out.println(f.fib(6));
    	 System.out.println(f.fibBottomUpAproach(6));
    	 
    	 int n = 6;
    	 int [] memo = new int[n+1];
    	 System.out.println(f.fibTopDownAproach(memo,n));
}

}
