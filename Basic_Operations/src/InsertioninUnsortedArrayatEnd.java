public class InsertioninUnsortedArrayatEnd {
    static int insertionArray(int[] arr,int number,int capacity,int n){

        for(int i=0;i<n;i++){
            if(n>=capacity){
                return i;
            }
            else{
                arr[n]=number;
            }
        return i+1;
        }
        return -1;
    }
//    static void printArray ( int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=20;
        arr[1]=30;
        arr[2]=40;
        arr[3]=50;
        arr[4]=60;
        arr[5]=70;
        arr[6]=80;
        int capacity=20;
        int number=90;
        int n=7;
        PrintArray print=new PrintArray();
        System.out.println("Array before Insertion: " );
        print.printarray(arr);
        insertionArray(arr,number,capacity,n);
        System.out.println("Array after Insertion: " );
        print.printarray(arr);


    }
}
