package utils;

public class Math {
	public static long factorial(long num) {
		if (num == 1) {
			return 1;
		} 
		long result = num * factorial(num - 1);
		return result;
	}
	
	public static int factorialLoop(int num) {
		int i = 1;
		while(num != 0) {
			i *= num;
			num--;
		}
		return i;
	}
	
}