package algorithm;

import java.util.*;

/**
 * Created by zhujia on 2017/8/26.
 */
public class DIDICodeTest2 {


    public static int findKth(int[] a, int n, int K) {

        quickSort(a, 0, n - 1);
        return a[n - K];
    }


    public static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int i = partition(a, start, end);
            quickSort(a, i + 1, end);
            quickSort(a, start, i - 1);
        }
    }

    public static int partition(int[] a, int p, int q) {
        int x = a[p];
        int i = p;
        for (int j = p + 1; j <= q; j++) {
            if (a[j] < x) {
                swap(a, i + 1, j);
                i++;
            }
        }
        swap(a, p, i);
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextInt()) {
            String s = scanner.nextLine();
            String[] array = s.split("\\s+");
            int[] intarray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                intarray[i] = Integer.parseInt(array[i]);
            }
            int K = scanner.nextInt();
            int temp = findKth(intarray, intarray.length, K);
            System.out.println(temp);

        }

    }
}
