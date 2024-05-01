public class RotateArray {

        static void rotateArray(int[] arr) {
            int temp;
            temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }


        static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
            public static void main (String[]args){
                int[] arr = {1, 2, 3, 4, 5, 6};
                printArray(arr);
                System.out.println("Array after Rotation: ");
                rotateArray(arr);
                printArray(arr);
            }
    }


