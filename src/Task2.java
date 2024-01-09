import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static Map<String,String> task(String[] arr){
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String[] a = arr[i].split("");
            map.put(a[0],a[a.length-1]);
        }
        return map;
    }
}
