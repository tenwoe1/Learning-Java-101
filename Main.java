public class Main {
	static double[] arr2 = {4.5, 6, 9.0, 8};
	static boolean[] arr = new boolean[100];
	static int x = 6;
	static int[][] board = new int[3][3];
	static double f(double x) {
		return 2 * x;
	}
	static void printIntArray(int[] arr) {
		String str = "(";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i != arr.length - 1) {
				str += ", ";
			}
		}
		str += ")";
		System.out.println(str);
	}
	public static void main(String[] args) {
		int x = 6;
		System.out.println(x + 4);
		System.out.println(x);
		System.out.println(x % 2 == 0);
		// to find the length of an array, use array.length
		System.out.println(arr2.length);
		
		System.out.println(arr[0]);
		// setting the 4th element in arr to true
		arr[3] = true;
		System.out.println(arr[0] || arr[3]);
		System.out.println(arr.length);

		// to start, let's extract the first row
		// (aka the first element in the array)
		int[] firstRow = board[0];
		// now, we'll get the first value in that row
		int firstVal = firstRow[0];
		System.out.println(firstVal);

		int[] fib = {1, 1, 2, 3, 5, 8, 13};
		int sum = 0;
		for (int e : fib) {
			// add each element of fib to sum
			sum = sum + e;
		}
		System.out.println(sum);
		
		int[] arr3 = new int[100];
		int index = 0;
		while (index < 100) {
			if (index % 2 == 0) {
				arr3[index] = 2;
			} else {
				arr3[index] = 1;
			}
			index = index + 1;
		}

		String s = "";
		for (int i = 0; i < 9; i++) {
			s += "- - - - - - - - -\n";
		}
		System.out.println(s);
		System.out.println("f(3): " + f(x));

	}
}