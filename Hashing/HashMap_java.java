import java.util.*;

public class HashMap_java {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 50);
        map.put("China", 150);

        System.out.println(map);

        //changing value
        map.put("China", 180); //updates
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        System.out.println(map.get("China")); //to get value of specified key
        System.out.println(map.get("Indonesia")); //key doesn't exists

        //similar to for each loop
        //for(int val:arr)
        for(Map.Entry<String,Integer> e: map.entrySet()){ //entrySet creates a set 
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet(); //creates a set of keys
        for(String key : keys){
            System.out.println(key+" "+map.get(key)); // key value pair is printed
        }

        map.remove("China");
        System.out.println(map);
    }
}
