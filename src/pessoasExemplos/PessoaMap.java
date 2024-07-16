package pessoasExemplos;

import java.util.HashMap;
import java.util.Map;

public class PessoaMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();
        Pessoa joao = new Pessoa(1L, "Joao");

        mapa.put(1L, joao);
    }
}