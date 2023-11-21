package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();
    void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        return null;
    }
}
