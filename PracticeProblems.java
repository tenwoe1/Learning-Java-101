public class PracticeProblems{
    public static void main(String[] args) {
    }
    //Practice Problem 1 Counting
    static int[] arr = new int[100];
    static int countOccurrences(int arr[], int n){
    int occurrences = 0;
    for (int i=0; i<arr.length; i++){
        if (n == arr[i]) {
            occurrences++;
        }
    }
    return occurrences;
    }
    //Practice Problem 2 Reversing Array
    static int[] reverseArray(int[] arr){
        int [] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        reversedArr[i] = arr[arr.length - 1 - i];
    return reversedArr;
    }
    //Practice Problem 3 Nested for Loop
        double[][] grid = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };

    static double sumGrid(double[][] grid) {
        double sum = 0.0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }
    //Practice Problem 4 Fibocanni sequence
    static int fib(int n) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}