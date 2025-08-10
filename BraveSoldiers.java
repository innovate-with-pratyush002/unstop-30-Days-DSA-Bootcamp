// King Luther has an army with N soldiers, each with an ID between 1 and N. The king wants to know how many soldiers in his army are "brave."
// A soldier is considered "brave" if their ID has exactly two factors (or Divisors) and is not a perfect square.
// Since King Luther is busy with his duties, he needs your help to count the number of "brave" soldiers in his army.
// Your task is to count how many soldiers have "brave" IDs according to the criteria.

import java.util.Scanner;
public class BraveSoldiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Numbers of Soldiers:");
        int N = sc.nextInt();
        int count = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Brave Soldiers:"+count);
        sc.close();
    }

    // Function to check if number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

