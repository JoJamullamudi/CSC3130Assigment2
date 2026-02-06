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




}
