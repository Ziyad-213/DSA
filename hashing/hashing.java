import java.util.*;


public class hashing{

    public static void main(String[] args) {
       HashMap<String, Integer> map=new HashMap<>();
          
map.put("India",100);
map.put("Australia",200);
map.put("Pakistan",20);
map.put("America",30);

System.out.println(map);


if(map.containsKey("Pakistan")){
    System.out.println("True");

}
else{
    System.out.println("False");
}

    System.out.println(map.get("America"));
    System.out.println(map.get("Antartica"));

    

    for(Map.Entry<String,Integer> e : map.entrySet()){
        
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }



    Set<String> keys = map.keySet();
    for(String key : keys){
        System.out.println(key+ " " + map.get(key));
    }

    }
}