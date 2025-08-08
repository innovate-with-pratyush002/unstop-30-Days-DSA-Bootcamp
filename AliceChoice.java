// Given a number N. Your task is to create a program to calculate the N-th term of the Alice choice.
// Alice's sequence consists of the squares of prime numbers: 2^2, 3^2, 5^2, 7^2, 11^2,13^2,17^2,19^2, 23^2, 29^2,…………

import java.util.Scanner;

public class AliceChoice {
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to get N-th term of Alice's choice
    public static int nthAliceChoice(int N) {
        int count = 0;
        int num = 2;
        
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == N) {
                    return num * num; 
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        int result = nthAliceChoice(N);
        System.out.println(result);
        
        sc.close();
    }
}
