import java.util.HashMap;
import java.util.Map;

class MapExample {
    public static void main(String args[]) {
        Map<String, String> maps = new HashMap<>();
        maps.put("Aryan", "is badmoss");
        maps.put("Aryan saini", "is badmoss");
        maps.put("Arush", "is badmoss");
        maps.put("Aditya", "is not a badmoss");

        // for (Map.Entry<String, String> entry : maps.entrySet()) {
        //     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        // }

        for(String name : maps.keySet())
            System.out.println(maps.get(name));
    }
}
