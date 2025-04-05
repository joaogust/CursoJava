package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrincipaisMetodos {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "João");             // Adiciona ou atualiza
        map.put(2, "Ana");             // Adiciona ou atualiza
        map.put(3, "Samuel");             // Adiciona ou atualiza
        map.put(4, "Islaine");
        System.out.println(map.get(1));                    // Retorna valor pela chave
        map.remove(1);                 // Remove par pela chave
        System.out.println(map.containsKey(2));           // Verifica se tem a chave
        System.out.println(map.containsValue("Islaine"));       // Verifica se tem o valor
        System.out.println(map.size());                      // Tamanho
        System.out.println(map.isEmpty());                   // Verifica se está vazio
        System.out.println(map.keySet());                    // Retorna todas as chaves
        System.out.println(map.values());                    // Retorna todos os valores
        System.out.println(map.entrySet());                  // Retorna os pares chave-valor
        map.clear();                     // Limpa o mapa
        System.out.println(map);
    }
}
