package questions;

import java.util.HashMap;
import java.util.Scanner;

class Fibonacci {
    static HashMap<Integer, Double> map = new HashMap<>();

    public static double fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n <= 2)
            return 1;

        if (map.containsKey(n))
            return map.get(n);

        double x = fib(n - 1) + fib(n - 2);
        map.put(n, x);

        return x;
    }


    //Main function starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}