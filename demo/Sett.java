package demo;

import java.util.*;

public class Sett {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'B', 'N', 'K', 'S');

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet" + treeSet);

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("linkedHashSet" + linkedHashSet);

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet" + hashSet);
    }
}
