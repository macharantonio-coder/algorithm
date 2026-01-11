public class Recursioncases {

    // 1. Factorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    // 2. Exponent (Power)
    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    // 3. Sum of Array
    static int sumArray(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    // 4. Fibonacci
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Count of Digits
    static int countDigits(int n) {
        if (n<10)
            return 1;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        // Factorial Example
        int factNumber = 5;
        System.out.println("Factorial: " + factorial(factNumber));

        // Power Example
        int base = 2;
        int exponent = 3;
        System.out.println("Power: " + power(base, exponent));

        // Sum of Array Example
        int[] arr = {1, 2, 3, 4};
        System.out.println("Sum of Array: " + sumArray(arr, 0));

        // Fibonacci Example
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Count of Digits Example
        int digitNumber = 12345;
        System.out.println("Count of Digits: " + countDigits(digitNumber));
    }
}

