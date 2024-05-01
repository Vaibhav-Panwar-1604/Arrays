public class RotateArrByKOptimized {
    static void rotateArray(int[] arr , int start,int end) {
            int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void rotateArr(int arr[],int k){
        rotateArray(arr,0,k-1);
        rotateArray(arr,k,arr.length-1);
        rotateArray(arr,0,arr.length-1);
    }
    static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("Array Before Rotation: ");
        printArray(arr);
        System.out.println("Array after Rotation: ");
        rotateArr(arr,3);
        printArray(arr);
    }
}


