import sun.security.ssl.HandshakeOutStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Test {
    public static void main(String[] args) {
//        TreeMap<String,Integer> treeMap = new TreeMap();
//        treeMap.put("alan",2);
//        treeMap.put("bushu",4);
//        treeMap.put("dao",1);
//        treeMap.put("ca",5);
//        Set<Map.Entry<String,Integer>> entry = treeMap.entrySet();
//        for(Map.Entry<String,Integer> e : entry){
//            System.out.print(e.getKey()+": "+e.getValue()+"  ");
//        }
//        System.out.println();
//
//
//        HashMap<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("ased",4);
//        hashMap.put("vsda",3);
//        hashMap.put("bfds",4);
//        hashMap.put("dcds",6);
//        Set<Map.Entry<String,Integer>> en = hashMap.entrySet();
//        for(Map.Entry e : en){
//            System.out.print(e.getKey()+"::"+e.getValue()+"  ");
//        }

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(4);
        set.add(5);

        System.out.println(set);





    }
}
