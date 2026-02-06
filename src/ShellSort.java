public class ShellSort implements SortingAlgorithm {

    public int[] sorty(int[]input) {

        int temp;
       for ( int gap = input.length/2; gap > 0; gap /=2 )
       {
           for ( int a = gap; a < input.length; a++)
           {
               temp =  input[a];
               int b;
               for ( b = a; b >= gap && temp < input[b - gap]; b = b -gap )
               {
                   input[b] = input[b - gap];
               }
               input[b] = temp;
           }
       }

       return input;
    }
/*

    public static void main(String args[])
    {
        int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

        ShellSort bs = new ShellSort();
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
