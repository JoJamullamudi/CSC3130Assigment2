public class SelectionSort implements SortingAlgorithm{

    public int[] sorty(int[]input{

        int temp;
        int smallindex;
        for ( int a = 0; a < input.length-1; a++)
        {
            smallindex = a;
            for ( int b = a +1; b < input.length; b++)
            {
                if ( input[b] < input[smallindex])
                {
                    smallindex = b;
                }
                temp = input[b];
                input[b] = input[smallindex];
                input[smallindex] = temp;
            }
        }

        return input;

    }


}
