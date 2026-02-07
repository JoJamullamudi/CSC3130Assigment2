import java.util.Random;

public class KSort {

    public static void generateKSorted(int[] input)
    {
        Random r = new Random();

        for (int a = 0; a < input.length; a++) {
            input[a] = r.nextInt(999);
        }

        int gap = 10;
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

    }


}
