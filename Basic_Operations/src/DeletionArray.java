public class DeletionArray {
    static int searchArray(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int deleteArray(int arr[],int n,int key){
        int position=searchArray(arr,n,key);
        if(position==-1){
            System.out.println("Element not found");
        }
        else{
            for(int i=position;i<n;i++){
                arr[i]=arr[i+1];
            }
        }
        return -1;
    }
    static void printArray(int n,int[] arr) {
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
        int key=30;
        int n=5;
        System.out.print("Array before insertion: ");
        printArray(n,arr);
        System.out.println();
        deleteArray(arr,n,key);
        System.out.print("Array after insertion: ");
        printArray(n,arr);
    }
}