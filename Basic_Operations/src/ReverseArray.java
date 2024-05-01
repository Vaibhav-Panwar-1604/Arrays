public class ReverseArray {
    static void reverseArray(int[] arr,int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
        static void printArray(int [] arr){
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
        }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Original array is: ");
        printArray(arr);
        reverseArray(arr,0,arr.length-1);
        System.out.println("\nReversed Array is: ");
        printArray(arr);
    }
}
