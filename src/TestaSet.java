import java.util.HashSet;
import java.util.Set;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaSet {
    public static void main(String[] args) {
        Set<String> setStrings = new HashSet<>();
        setStrings.add("Joao");
        setStrings.add("Maria");
        setStrings.add("Manuel");
        setStrings.add("Joao"); // repetido

        for (String item : setStrings) {
            System.out.println("Item: " + item);
        }

        setStrings.remove("Manuel");

        for (String item : setStrings) {
            System.out.println("Item: " + item);
        }
    }
}
