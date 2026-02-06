public class MergeSort implements SortingAlgorithm{

    public int[] sorty(int[] input) {

       return mergesort(input);

    }

    public int[] merge( int[] one, int[] two)
    {
        int len = one.length + two.length;
        int[] m = new int[len];

        int oneindex = 0;
        int twoindex = 0;

        for ( int a = 0; a< len; a++)
        {
            if ( oneindex == one.length)
            {
                m[a] = two[twoindex];
                twoindex++;
            }
            else if ( twoindex == two.length)
            {
                m[a] = one[oneindex];
                oneindex++;
            }
            else if ( one[oneindex] <= two[twoindex])
            {
                m[a] = one[oneindex];
                oneindex++;
            }
            else if ( one[oneindex] >= two[twoindex])
            {
                m[a] = two[twoindex];
                twoindex++;
            }
        }

        return m;
    }

    public int[] mergesort(int[] input){

        if ( input.length == 1)
        {
            return input;
        }

        int[] one = new int[input.length/2];
        int[] two = new int[input.length- (input.length/2)];

        for( int a = 0; a< input.length/2; a++)
        {
            one[a] = input[a];
        }

        for( int b = input.length/2; b< input.length; b++)
        {
            two[b-(input.length/2)] = input[b];
        }

        one = mergesort(one);
        two = mergesort(two);

        return merge( one, two);
    }
/*
    public static void main(String args[])
    {
        int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

        MergeSort bs = new MergeSort();
        input = bs.sorty(input);

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
