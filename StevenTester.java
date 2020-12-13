import java.util.*;
public class StevenTester {
    public static void main(String[] args) {

        System.out.println("NoNullArrayList tests");
        try{
            NoNullArrayList<String> test1 = new NoNullArrayList<>();
            test1.add("s");
            test1.add(null);
        } catch (IllegalArgumentException e) {
            System.out.println(" add (Element) test: good");
        }

        try{
            NoNullArrayList<Integer> test2 = new NoNullArrayList<Integer>(4);
            test2.add(0, 3);
            test2.add(1,4);
            test2.add(4,null);
        } catch (IllegalArgumentException e) {
            System.out.println(" add (index, Element) test: good");
        }
        try{
            NoNullArrayList<String> test3 = new NoNullArrayList<String>(90);
            test3.add(0,"s");
            test3.add(1,"s");
            test3.add(2,"cool");
            String former = test3.set(2, "ye");
            if (!former.equals("cool")) throw new Error ("set method does not return the previous element that was set.");
            test3.set(2, null);
        } catch (IllegalArgumentException e) {
            System.out.println(" set (index, Element) test: good");
        }

        OrderedArrayList<Double> k = new OrderedArrayList<Double>();
        k.add(3.0);
        k.add(-99.0);
        k.add(19.0);
        k.add(1,17.0);
        System.out.println(k);
        k.add(1.0);
        k.add(-1.0);
        System.out.println(k);
        OrderedArrayList<String> g = new OrderedArrayList<String>();
        g.add("Lowry");
        g.add("Theis");
        g.add("Siakam");
        g.add("Hayward");
        System.out.println(g);
        System.out.println(g.set(3, "Mo"));
        System.out.println(g);
        g.set(2,null);
        System.out.println(g);
    }
}
