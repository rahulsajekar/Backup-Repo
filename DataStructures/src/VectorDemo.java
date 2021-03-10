import java.util.Vector;
// size of vector increase by double automatically when its get full.
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> name = new Vector<>(5);
        name.add("Rahul");
        name.add("Sajekar");
        System.out.println(name.capacity());
        name.add("");
        System.out.println(name.capacity());
        name.add("");
        name.add("");
        name.add("");
        System.out.println(name.capacity());
        name.remove("Rahul");

    }
}
