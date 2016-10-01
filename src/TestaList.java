import java.util.ArrayList;
import java.util.List;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaList {
    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add    ("Felipe");
        listaStrings.add("Carol");
        listaStrings.add("Bernardo");

        for (String item : listaStrings) {
            System.out.println("Item: " + item);
        }

        listaStrings.remove(1);

        for (int i = 0; i < listaStrings.size(); i++) {
            String item = listaStrings.get(i);

            System.out.println("Item: " + item);
        }
    }
}
