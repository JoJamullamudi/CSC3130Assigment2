public class ShellSort implements SortingAlgorithm {

    public int[] sorty(int[]input) {

        int temp;
       for ( int gap = input.length/2; gap > 0; gap /=2 )
       {
           for ( int a = gap; a < input.length; a++)
           {
               temp =  input[a];
               for ( int b = a; b >= gap && temp < input[b - gap]; b = b -gap )
               {
                   temp[b] = input[b - gap];
               }
               input[a] = temp;
           }
       }

       return input
    }

}
