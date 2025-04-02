package Maps;

import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public class MapApp2 {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new LinkedHashMap<>();

        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 500);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 700);

        System.out.println(scoreMap.keySet());
        for (String key : scoreMap.keySet()) {
            System.out.println(key);
        }

        for (Integer value : scoreMap.values()) {
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entries = scoreMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("%s ===> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
