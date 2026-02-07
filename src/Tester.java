import java.util.Random;

public class Tester {

    private SortingAlgorithm sa;

    public Tester(SortingAlgorithm sa) {
        this.sa = sa;
    }

    public double singleTest(int size) {
        int[] input = new int[size];
        Random r = new Random();

        for (int a = 0; a < input.length; a++) {
            input[a] = r.nextInt(999);
        }

        long startTime = System.nanoTime();
        sa.sorty(input);
        long endTime = System.nanoTime();

        double tmillis = (endTime - startTime) / 1_000_000.0;

        return tmillis;

    }

    public void test(int iterations, int size) {
        double totaltime = 0.0;

        for (int i = 0; i < iterations; i++) {
            totaltime = totaltime + singleTest(size);
        }

        double averagetime = totaltime / iterations;
        System.out.println("Average time to sort an array of size " + size + ": " + averagetime);
    }
/*
    public static void main(String args[]) {
        QuickSort bs = new QuickSort();
        Tester tester = new Tester(bs);
        tester.singleTest(10);
        tester.test(10, 10);
    }

 */
}



