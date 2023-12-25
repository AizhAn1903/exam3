package exercise4;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Pen","Ручка");
        map.put("Apple","Яблоко");
        map.put("Milk","Молоко");

        System.out.println( "Перевод:" + map.get("Pen"));
        System.out.println("Перевод:" + map.get("Apple"));

        }
    }

