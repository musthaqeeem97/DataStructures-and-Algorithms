package micelanious;

public class ReverseNumber {

	public long reverseNumber(int num) {
		
		boolean isNegative = false;
		
		
		if(num<0) {
			isNegative = true;
			num = num*-1;
		}
		
		long reversedNum = 0;
		int lastDigit;
		while (num>0) {
			lastDigit = num%10;
			reversedNum = reversedNum * 10 + lastDigit;
			num = num/10;
		}
		return isNegative? reversedNum*-1:reversedNum;
	}
	public static void main(String[] args) {
		
		ReverseNumber rev = new ReverseNumber();
		long res = rev.reverseNumber(-367368631);
		
		System.out.println(res);
	}
}
