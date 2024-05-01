public class SearchUnsortedArray {
    static int searchArr(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i+1;
            }
        }
                return -1;
    }
    static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 50, 200};
        int position=searchArr(arr,50);
        if (position>0) {
            System.out.println("Position of Element in array is " + position );
        }
        else {
            System.out.println("Element not found");
        }
    }
}
