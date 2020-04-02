package linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>(18,0.75F,true);
        linkedHashMap.put("1","张三");
        linkedHashMap.put("2","李四");
        linkedHashMap.putIfAbsent("1","王五");
        linkedHashMap.put("2","赵柳");
        linkedHashMap.put("3","前期");
        linkedHashMap.put("4","欧力");
        linkedHashMap.put("5","备注");
        System.out.println(linkedHashMap.get("1"));
        System.out.println(linkedHashMap);

        Set<Map.Entry<String,String>> entry = linkedHashMap.entrySet();
        Iterator<Map.Entry<String,String>> iterator = entry.iterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(linkedHashMap);
//        while (iterator.hasNext()){
//            Map.Entry e = iterator.next();
//            System.out.print(e.getValue()+", ");
//        }
//        linkedHashMap.get("1");
        Map.Entry tail = null;
        Set<Map.Entry<String,String>> entry1 = linkedHashMap.entrySet();
        Iterator<Map.Entry<String,String>> iterator1 = entry1.iterator();
        while (iterator1.hasNext()){
            tail = iterator1.next();

        }
//        System.out.print(tail.getValue()+", ");
//        System.out.println(linkedHashMap.get("4"));
//        System.out.println(linkedHashMap);

    }
}
