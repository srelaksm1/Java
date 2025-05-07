// Class to generate Fibonacci numbers
class FibonacciGenerator implements Runnable {
    private int count;

    public FibonacciGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // Line break after printing Fibonacci series
    }
}

// Class to display even numbers in a given range
class EvenNumberDisplay implements Runnable {
    private int start, end;

    public EvenNumberDisplay(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Line break after printing even numbers
    }
}

// Main class to run both threads
public class Main {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable fib = new FibonacciGenerator(10);  // Generate first 10 Fibonacci numbers
        Runnable even = new EvenNumberDisplay(1, 20); // Display even numbers from 1 to 20

        // Create Thread objects
        Thread fibThread = new Thread(fib);
        Thread evenThread = new Thread(even);

        // Start the threads
        fibThread.start();
        evenThread.start();
    }
}

