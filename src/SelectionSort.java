public class SelectionSort implements SortingAlgorithm{

    public int[] sorty(int[]input) {

        int temp;
        int smallindex;
        for ( int a = 0; a < input.length-1; a++)
        {
            smallindex = a;
            for ( int b = a+1; b < input.length; b++)
            {
                if ( input[b] < input[smallindex])
                {
                    smallindex = b;
                }
                temp = input[a];
                input[a] = input[smallindex];
                input[smallindex] = temp;
            }
        }

        return input;

    }
/*
    public static void main(String args[])
    {
        int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

        SelectionSort bs = new SelectionSort();
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
