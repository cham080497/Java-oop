package lesson_06;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap();
        emergencyList.put(113, "CSCD");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cuu thuong");
        emergencyList.put(112, "Nothing");
        emergencyList.put(116, "Others");
       // emergencyList.put(116, "Other..");

        System.out.println(emergencyList.get(113));
        Set<Integer> allKey = emergencyList.keySet();

        emergencyList.replace(116, "nothing");
        for (Integer key : allKey) {
//            if(emergencyList.get(key).equals("Others")){
//                emergencyList.remove(key);
//            }
            emergencyList.remove(key, "Others");
        }
        for (Integer key : allKey) {
            System.out.println(emergencyList.get(key));
        }
        
    }
}
