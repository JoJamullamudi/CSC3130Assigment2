public class BubbleSort implements SortingAlgorithm{

    public int[] sorty(int[]input)
    {
        int temp;
        for ( int a = 0; a < input.length -1; a++)
        {
            for ( int b = 0; b < input.length-1; b++ )
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




}
