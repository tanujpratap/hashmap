import java.util.*;


public class iteration_on_hashmp {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 12);
        hm.put("afganistan", 23);
        hm.put("bangladesh", 70);
        Set<String>keys=hm.keySet();
System.out.println(keys);
for(String k:keys){
    System.out.println("keys = "+k+"  values "+hm.get(k));

}

    }
}
