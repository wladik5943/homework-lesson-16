import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String,Boolean> task(String[] arr){
        Map<String,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],false);
            }
            else{
                map.put(arr[i],true);
            }
        }
        return map;
    }
}
