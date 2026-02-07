public class KPerformance {

        public static void main(String args[])
        {
            //Initialize all sorting algorithms
            BubbleSort b = new BubbleSort();
            InsertionSort i = new InsertionSort();
            SelectionSort s = new SelectionSort();
            ShellSort sh = new ShellSort();
            QuickSort q = new QuickSort();
            MergeSort m = new MergeSort();

            // testing all
            KSort SH = new KSort(sh);
            System.out.println("Shell Sort:");
            SH.test(20, 100);
            SH.test(20, 500);
            SH.test(20, 1000);
            SH.test(20, 2000);
            SH.test(20, 5000);
            SH.test(20, 10000);
            SH.test(20, 20000);
            SH.test(20, 75000);
            SH.test(20, 150000);

            KSort Q = new KSort(q);
            System.out.println("Quick Sort:");
            Q.test(20, 100);
            Q.test(20, 500);
            Q.test(20, 1000);
            Q.test(20, 2000);
            Q.test(20, 5000);
            Q.test(20, 10000);
            Q.test(20, 20000);
            Q.test(20, 75000);
            Q.test(20, 150000);

            KSort M = new KSort(m);
            System.out.println("Merge Sort:");
            M.test(20, 100);
            M.test(20, 500);
            M.test(20, 1000);
            M.test(20, 2000);
            M.test(20, 5000);
            M.test(20, 10000);
            M.test(20, 20000);
            M.test(20, 75000);
            M.test(20, 150000);

            KSort I = new KSort(i);
            System.out.println("Insertion Sort:");
            I.test(20, 100);
            I.test(20, 500);
            I.test(20, 1000);
            I.test(20, 2000);
            I.test(20, 5000);
            I.test(20, 10000);
            I.test(20, 20000);
            I.test(20, 75000);
            I.test(20, 150000);

            KSort S = new KSort(s);
            System.out.println("Selection Sort:");
            S.test(20, 100);
            S.test(20, 500);
            S.test(20, 1000);
            S.test(20, 2000);
            S.test(20, 5000);
            S.test(20, 10000);
            S.test(20, 20000);
            S.test(20, 75000);
            S.test(20, 150000);



            KSort B = new KSort(b);
            System.out.println("Bubble Sort:");
            B.test(20, 100);
            B.test(20, 500);
            B.test(20, 1000);
            B.test(20, 2000);
            B.test(20, 5000);
            B.test(20, 10000);
            B.test(20, 20000);
            B.test(20, 75000);
            B.test(20, 150000);
        }

    }
