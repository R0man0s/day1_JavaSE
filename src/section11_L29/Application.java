package section11_L29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<String, String>();
        dictionary.put("Brave", "Short value1 of key Brave");
        dictionary.put("Brilliant", "Short value2 of key Brilliant");
        dictionary.put("Joy", "Short value3 of key Joy");
        dictionary.put("Confidence", "Short value3 of key Confidence");

        dictionary.put("Brilliant", "XXXXXXXXXXXXXX");
//        for (String word : dictionary.keySet()) {
//            System.out.println(dictionary.get(word));
//        }

        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }
}
