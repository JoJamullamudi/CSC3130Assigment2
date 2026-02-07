import java.util.Random;

public class KSort {

    SortingAlgorithm sa;

    KSort(SortingAlgorithm sa){
        this.sa = sa;
    }

    public void generateKSorted(int[] input){
        int temp = 0;
        int minSwap;
        int maxSwap;
        int swapK;
        Random rand = new Random();

        for(int a = 0; a < input.length; a++){
            input[a] = a;
        }

        int k = 10;

        for(int a = 0; a < input.length; a++){
            minSwap = Math.max(0, a-k);
            maxSwap = Math.min(input.length-1, a+k);

            swapK = minSwap + rand.nextInt(maxSwap - minSwap + 1);

            temp = input[a];
            input[a] = input[swapK];
            input[swapK] = temp;
        }
    }

    public double ksingleTest(int size){

        int[] input = new int[size];

        generateKSorted(input);

        long startTime = System.nanoTime();
        sa.sorty(input);
        long endTime = System.nanoTime();

        double tmillis = (endTime - startTime) / 1_000_000.0;

        return tmillis;
    }

    public void test(int iterations, int size) {
        double totaltime = 0.0;

        for (int i = 0; i < iterations; i++) {
            totaltime = totaltime + ksingleTest(size);
        }

        double averagetime = totaltime / iterations;
        System.out.println("Average time to sort an array of size " + size + ": " + averagetime + "ms");
    }

}


