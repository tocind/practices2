package org.toc.practices2.collection.ex;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;
import java.util.stream.IntStream;

@Slf4j
public class HashMapDemo {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ee", 22);
        hashMap.put("aa", 33);
        hashMap.put("bb", 11);
        hashMap.put("dd", 99);
        hashMap.put("cc", 44);
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            String k = entry.getKey();
            String v = entry.getValue().toString();
            builder.append(k);
            builder.append(" ");
            builder.append(v);
        }
        System.out.println(builder.toString());
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] digest = messageDigest.digest(builder.toString().getBytes(StandardCharsets.UTF_8));
        String s = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(s);
        System.out.println("72458693fcd331d27cf4623b036de91262cd5cc6b4c201466581dbf30d8762ec870545996ce5f7ac29920b0b3aa5ba3b8923ac48921b46d02624c78474b47588".length());
//        for(int i = 0; i < hashMap.size(); ++i){
//            hashMap.get()
//        }
//
//        Iterator<String> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//            hashMap.put("zzz", 2344);
//        }
//        System.out.println("\n\n--------------------------again-------------------------\n\n");
//        Iterator<String> iterator2 = hashMap.keySet().iterator();
//        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
//            iterator.remove();
//            hashMap.put("zzz", 2344);
//        }
//        TreeMap<String, String> t = new TreeMap<>();
//        t.put("hi", "aaa");
//        t.put("aaa", "aaa");
//        t.put("ddd", "aaa");
//        t.put("ccc", "aaa");
//        System.out.println(t);
//
//
//






//        Iterator<String> iterator = set.iterator();
//        Iterator<Map.Entry<String, Integer>> iterator1 = hashMap.entrySet().iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println("\n\n--------------------------gettting keys , values using entry set-------------------------\n\n");
//        while (iterator1.hasNext()) {
//           Map.Entry e = iterator1.next();
//            String s = (String) e.getKey();
//            Integer i = (Integer) e.getValue();
//            System.out.println(s +" "+i);
//        }
//        System.out.println("\n\n------------------------for each---------------------------\n\n");
//        hashMap.forEach((k, v) -> {
//            System.out.println(k+" "+v);
//        });


//        List<String> list = Arrays.asList("eee", "ccc", "bbb", "ddd", "aaa");
//        list.sort(Comparator.reverseOrder());
//        System.out.println(list);
//
//        List<Integer> list = Arrays.asList(new Integer(3),
//                new Integer(10),
//                new Integer(31),
//                new Integer(2),
//                new Integer(5),
//                new Integer(1));
//
//        int[] n = {1, 4, -2, 7, 6, 5};
//        System.out.println(IntStream.of(n).min().getAsInt());
//        System.out.println(IntStream.of(n).max().getAsInt());
//        System.out.println(IntStream.of(n).count());
//        System.out.println(IntStream.of(n).average().getAsDouble());
//
//
    }
}
