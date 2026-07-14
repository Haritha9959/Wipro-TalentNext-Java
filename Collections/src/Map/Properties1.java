package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Properties1 {

    public static void main(String[] args) {

        Properties states = new Properties();

        states.put("Andhra Pradesh", "Amaravati");
        states.put("Telangana", "Hyderabad");
        states.put("Karnataka", "Bengaluru");
        states.put("Tamil Nadu", "Chennai");
        states.put("Kerala", "Thiruvananthapuram");

        System.out.println("States and Their Capitals:");

        Iterator<Map.Entry<Object, Object>> iterator = states.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}