public class BubbleSort implements SortingAlgorithm{

    public int[] sorty(int[]input)
    {
        int temp;
        for ( int a = 0; a < input.length -1; a++)
        {
            for ( int b = 0; b < input.length-a-1; b++ )
            {
                if ( input[b] > input[b+1])
                {
                    temp = input[b];
                    input[b] = input[b+1];
                    input[b+1] = temp;
                }
            }
        }

        return input;

    }
        /*
        public static void main(String args[])
        {
            int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

            BubbleSort bs = new BubbleSort();
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
