import java.util.ArrayList;

public class StevenTester {
    public static void main(String[] args) {
        
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

    }
}
