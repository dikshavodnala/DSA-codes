// import java.util.HashSet;
// import java.util.Iterator;
import java.net.SocketPermission;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // Creating
        // HashSet<Integer> set=new HashSet<>();

        // // Insert
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);

        // System.out.println("size="+set.size());
        // System.out.println(set);

        // if(set.contains(1))
        // System.out.println("set contains 1");

        // set.remove(1);
        // if(!set.contains(1))
        // System.out.println("does not contain 1");

        // Iterator it= set.iterator();
        
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        // System.out.println(map);
        
        // map.put("China",180);
        // System.out.println(map);
         
        // if(map.containsKey("China")){
        //     System.out.println("present");
        // }else{
        //     System.out.println("not present");
        // }

        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        // int[] arr={12,15,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // for(int val: arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        
        // for(Map.Entry<String,Integer> e: map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        
        // Set<String> keys= map.keySet();
        // for(String key:keys){
        //     System.out.println(key+" "+map.get(key));
        // }

        map.remove("China");
        System.out.println(map);



    }
}


  