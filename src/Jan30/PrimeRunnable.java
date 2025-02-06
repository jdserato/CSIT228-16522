package Jan30;

public class PrimeRunnable implements Runnable {
    int start;
    int end;
    int id;
    static int NUMBER_OF_PRIMES = 0;

    public PrimeRunnable(int start, int end, int id) {
        this.start = start;
        this.end = end;
        this.id = id;
    }

    @Override
    public void run() {
        int numprimes = 0;
        long before = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                numprimes++;
            }
        }
        NUMBER_OF_PRIMES += numprimes;
        long after = System.currentTimeMillis();
//        System.out.println("["+id+"] Total Time in ms = " + (after - before));
//        System.out.println("["+id+"] Number of Primes = " + NUMBER_OF_PRIMES);
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
