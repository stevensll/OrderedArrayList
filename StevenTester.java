public class StevenTester {
    public static void main(String[] args) {
        NoNullArrayList<String> g = new NoNullArrayList<String>();
        g.add("s");
        g.add("t");
        g.add("e");
        System.out.println(g);
        g.set(2, "4");
        System.out.println(g);
        g.add("5");
        System.out.println(g);

    }
}
