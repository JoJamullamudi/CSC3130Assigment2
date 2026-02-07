public class QuickSort implements SortingAlgorithm {

    public int[] sorty(int[] input) {

        quicksort(input, 0, input.length - 1);
        return input;

    }

    public void quicksort(int[] input, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(input, left, right);

            quicksort(input, left, pivotIndex - 1);
            quicksort(input, pivotIndex + 1, right);
        }

    }

    public void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    public int partition(int[] input, int left, int right) {

        int medindex = medianofthree(input, left, right);
        int pivot = input[medindex];

        swap(input, medindex, right);

        int i = left;
        int j = right-1;

        while ( i <= j) {

            while ( i <= j && input[i] < pivot) //move i until we find something smaller than pivot
            {
                i++;
            }

            while ( i<=j && input[j] > pivot) // move j until something larger
            {
                j--;
            }

            if (i <= j ) // if pointers havent crossed swap numbers
            {
                swap(input, i, j);
                i++;
                j--;
            }

        }

        swap(input, i, right); // if pointers cross move pivot

        return i;
    }

    public int medianofthree(int[] input, int left, int right)
    {
        // Find the pivot point
        int center = (left + right) / 2;

        if (input[left] > input[center]) {
            swap(input, left, center);
        }

        if (input[left] > input[right]) {
            swap(input, left, right);
        }
        if (input[center] > input[right]) {
            swap(input, center, right);
        }

        return center;
    }
/*
    public static void main(String args[])
    {
        int[] input = {-5, 4, 2, 619, 11, 5, 620, -3};

        QuickSort bs = new QuickSort();
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
