public class InsertionSort implements SortingAlgorithm{

    public int[] sorty(int[]input){

        int temp;
        int b;
        for (int a = 0; a < input.length; a++)
        {
            b = a;
            while (b > 0 && input[b] < input[b-1] )
            {
                temp = input[b];
                input[b] = input[b-1];
                input[b-1] = temp;
                b--;
            }
        }

        return input;

    }
/*
    public static void main(String args[])
    {
        int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

        InsertionSort bs = new InsertionSort();
        bs.sorty(input);

        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i < input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

 */




}
