package package2;

public class pattern {

//	public static void main(String[] args) {
//
//		//fibo(5);
//		
//		
//
//	}
	// print first n fibo numbers
	// Line is added for test purpose only.
	static void fibo(int n) {

		int[] fib = new int[n]; // dt [] x = new dt[n];

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];

		}
		for (long i = 0; i < n; i++) {
			System.out.println(fib[(int) i]);
		}

	}

	// find factorial of given number

	public static long calculateFactorialRecursive(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * calculateFactorialRecursive(n - 1);
	}

	public static void main(String[] args) {
		int n = 5; // Change n to the desired number for which you want to calculate the factorial.
		long result = calculateFactorialRecursive(n);
		System.out.println("Factorial of " + n + " is " + result);
	}

}
