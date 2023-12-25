package exercise3;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> users = new TreeMap<>();
        users.put("Ivan",22);
        users.put("Petr",20);
        users.put("Maria",18);
        users.put("Oleg",21);

        System.out.println(users);
        System.out.println("Ages:" + users.values());
        System.out.println( "Names:" + users.keySet());

    }
}
