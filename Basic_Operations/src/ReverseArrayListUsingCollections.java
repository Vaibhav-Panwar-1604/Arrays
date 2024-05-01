import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayListUsingCollections {
    public static void main(String[] args) {

    ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);

    }
}
