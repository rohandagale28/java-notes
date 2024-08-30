import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {

    // uses heap memory
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

        // get element
        int result = list.get(1);
        System.out.println(result);

        // add element in between
        list.add(1, 4);
        System.out.println(list);

        // set element
        list.set(1, 5);
        System.out.println(list);

        // delete element
        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
