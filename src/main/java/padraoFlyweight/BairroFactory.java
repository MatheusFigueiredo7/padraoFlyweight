package padraoFlyweight;

import java.util.HashMap;
import java.util.Map;

public class BairroFactory {
    private static Map<String, Bairro> bairros = new HashMap<String, Bairro>();

    public static Bairro getBairro(String nome, String cep) {
        Bairro bairro = bairros.get(nome);
        if (bairro == null) {
            bairro = new Bairro(nome, cep);
            bairros.put(nome, bairro);
        }
        return bairro;
    }

    public static Integer getTotalBairros() {
        return bairros.size();
    }
}
