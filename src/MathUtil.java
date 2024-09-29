public class MathUtil {

    // 5 static methods

    // isPrime(int n)
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // gcd(int a, int b)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // lcm(int a, int b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // fibonacci(int n)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // factorial(int n)
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5 non static methods

    // isPerfectNumber(int n)
    public boolean isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n) {
                    sum += i + (n / i);
                } else {
                    sum += i;
                }
            }
        }
        return sum == n && n != 1;
    }

    // somOfDigits(int n)
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // reverseNumber(int n)
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // isArmstrongNumber(int n)
    public boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n, digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    // nextPrime(int n)
    public int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}

