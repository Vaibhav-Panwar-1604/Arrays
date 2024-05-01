import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        // To add Elements
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        //To Access Elements
        System.out.println(l1.get(2));


        //Printing the list
        System.out.println(l1);
        // Adding at some Index
        l1.add(2,100);
        System.out.println(l1);

        //To remove Elements
        l1.remove(2);
        System.out.println(l1);

        //To remove an Element e
        l1.remove(Integer.valueOf(30));
        System.out.println(l1);

        //To check if Element exist
        boolean ans=l1.contains(Integer.valueOf(40));
        System.out.println(ans);

        //If yoy don't specify data types you can put in anything
        ArrayList l2=new ArrayList();
        l2.add("kbajk");
        l2.add(9);
        l2.add(true);
        System.out.println(l2);

        //To find index of element
        int index=l1.indexOf(20);
        System.out.println(index);
    }
}
