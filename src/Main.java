public class Main {
    public static void main(String[] args) {
        // Testing 5 static methods

        // testing isPrime
        System.out.println("isPrime(11): " + MathUtil.isPrime(11)); // true
        System.out.println("isPrime(25): " + MathUtil.isPrime(25)); // false
        System.out.println("isPrime(17): " + MathUtil.isPrime(17)); // true

        // testing gcd
        System.out.println("gcd(48, 18): " + MathUtil.gcd(48, 18)); // 6
        System.out.println("gcd(56, 98): " + MathUtil.gcd(56, 98)); // 14
        System.out.println("gcd(101, 103): " + MathUtil.gcd(101, 103)); // 1

        // testing lcm
        System.out.println("lcm(15, 20): " + MathUtil.lcm(15, 20)); // 60
        System.out.println("lcm(9, 6): " + MathUtil.lcm(9, 6)); // 18
        System.out.println("lcm(12, 18): " + MathUtil.lcm(12, 18)); // 36

        // testing fibonacci
        System.out.println("fibonacci(6): " + MathUtil.fibonacci(6)); // 8
        System.out.println("fibonacci(8): " + MathUtil.fibonacci(8)); // 21
        System.out.println("fibonacci(10): " + MathUtil.fibonacci(10)); // 55

        // testing factorial
        System.out.println("factorial(5): " + MathUtil.factorial(5)); // 120
        System.out.println("factorial(7): " + MathUtil.factorial(7)); // 5040
        System.out.println("factorial(3): " + MathUtil.factorial(3)); // 6

        // Testing 5 non static methods
        MathUtil mathUtil = new MathUtil();

        // testing isPerfectNumber
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28)); // true
        System.out.println("isPerfectNumber(6): " + mathUtil.isPerfectNumber(6)); // true
        System.out.println("isPerfectNumber(12): " + mathUtil.isPerfectNumber(12)); // false

        // testing sumOfDigits
        System.out.println("sumOfDigits(123): " + mathUtil.sumOfDigits(123)); // 6
        System.out.println("sumOfDigits(987): " + mathUtil.sumOfDigits(987)); // 24
        System.out.println("sumOfDigits(456): " + mathUtil.sumOfDigits(456)); // 15

        // testing reverseNumber
        System.out.println("reverseNumber(456): " + mathUtil.reverseNumber(456)); // 654
        System.out.println("reverseNumber(1234): " + mathUtil.reverseNumber(1234)); // 4321
        System.out.println("reverseNumber(789): " + mathUtil.reverseNumber(789)); // 987

        // testing isArmstrongNumber
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153)); // true
        System.out.println("isArmstrongNumber(370): " + mathUtil.isArmstrongNumber(370)); // true
        System.out.println("isArmstrongNumber(123): " + mathUtil.isArmstrongNumber(123)); // false

        // testing nextPrime
        System.out.println("nextPrime(10): " + mathUtil.nextPrime(10)); // 11
        System.out.println("nextPrime(17): " + mathUtil.nextPrime(17)); // 19
        System.out.println("nextPrime(23): " + mathUtil.nextPrime(23)); // 29
    }
}
