package abst.identityHashMAp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMApIt {

    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String, String>();
            map.put("key1", "value1");
            map.put("key2", "value2");
            Iterator<Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
            }    
    }
    
}
