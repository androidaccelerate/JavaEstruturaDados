import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaMap {
    public static void main(String[] args) {
        Jipe jipe = new Jipe();
        jipe.setCor("Branco");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeMaxima(120);

        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setModelo("Voyage");
        carro.setVelocidadeMaxima(200);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Estrada");
        caminhonete.setVelocidadeMaxima(140);

        Map<String, Automovel> mapaAutomoveis = new HashMap<>();
        mapaAutomoveis.put("Felipe", jipe);
        mapaAutomoveis.put("Carol", caminhonete);
        mapaAutomoveis.put("Joao", carro);

        Set<String> nomes = mapaAutomoveis.keySet();

        for (String nome : nomes) {
            Automovel automovel = mapaAutomoveis.get(nome);

            System.out.println(nome + " dirige " + automovel.getModelo());
        }

    }
}
