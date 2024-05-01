public class RotateArrByK {
    static void rotateArray(int[] arr) {
        int temp;
        temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
    static void rotateArr(int arr[],int k){
        for (int i=1;i<=k;i++){
            rotateArray(arr);
        }
    }
    static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printArray(arr);
        System.out.println("Array after Rotation: ");
        rotateArr(arr,10);
        printArray(arr);
    }
}
