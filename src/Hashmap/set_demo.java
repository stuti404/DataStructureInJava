package Hashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set_demo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(12);
        s.add(56);
        s.add(95);
        s.add(67);
        s.add(25);
        System.out.println(s);


        TreeSet<Integer> s1 = new TreeSet<>();
        s1.add(12);
        s1.add(56);
        s1.add(95);
        s1.add(67);
        s1.add(25);
        System.out.println(s1);

        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
        s2.add(12);
        s2.add(56);
        s2.add(95);
        s2.add(67);
        s2.add(25);
        System.out.println(s2);
    }
}
