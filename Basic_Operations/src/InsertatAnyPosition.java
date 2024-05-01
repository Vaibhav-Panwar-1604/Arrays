import java.util.ArrayList;

public class InsertatAnyPosition {
    static void insertArray(int[] arr, int pos, int x, int n) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    static void printArray(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[15];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int pos = 2;
        int x = 100;
        int n = 5;
        System.out.print("Array before insertion: ");
        printArray(n, arr);
        System.out.println();
        insertArray(arr, pos, x, n);
        n += 1;
        System.out.print("Array after insertion: ");
        printArray(n, arr);
    }

}
