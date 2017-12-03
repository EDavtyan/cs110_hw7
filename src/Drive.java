import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Drive {
	
	
	
	public static void main(String[] args) {
		
		Puppy joey = new Puppy("Joey");
		Puppy chandler = new Puppy("Chandler");
		Puppy ross = new Puppy("Ross");
		
		String joeyStr = joey.getName();
		String chandlerStr = chandler.getName();
		String rossStr = ross.getName();
		
		System.out.println(joeyStr);
		System.out.println(chandlerStr);
		System.out.println(rossStr);
		
		int[] arr = {9, 20, 3, 44, 88};
		
		String arrStr = ArrayUtils.stringifyArray(ArrayUtils.reverse(arr));
		System.out.println(arrStr);
		
		double numDouble = 15.4;
		long numLong = (long)numDouble;
		long result = Math.factorial(numLong);
		System.out.println(result);
		
		
		
		
	}
	
}
