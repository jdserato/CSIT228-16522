package Jan30;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread tt = new Thread(() -> System.out.println("HIII"));

        Scanner sc = new Scanner(System.in);
        ArrayList<Thread> threads = new ArrayList<>();
        System.out.print("How many threads? ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int each = 50_000_000 / num;
            if (i == num - 1) {
                threads.add(new Thread(new PrimeRunnable(i*each+1, 50_000_000, i+1)));
            } else {
                threads.add(new Thread(new PrimeRunnable(i * each + 1, (i + 1) * each, i + 1)));
            }
        }
        long before = System.currentTimeMillis();
        for (Thread t : threads) {
            t.start();
        }
        System.out.println("ALL THREADS STARTED");

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {

            }
        }
        long after = System.currentTimeMillis();
        System.out.println("TOTAL TIME ELAPSED = " + (after - before));
        System.out.println("TOTAL NUMBER OF PRIMES: " + PrimeRunnable.NUMBER_OF_PRIMES);
    }
}
