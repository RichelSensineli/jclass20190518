package br.com.fiap;

import java.util.*;

public class Colecoes {

    public static void main(String[] args) {
        System.out.println("HashSet");
        hashSet();

        System.out.println("SortedSet");
        sortedSet();

        System.out.println("ArrayList");
        arrayList();

        System.out.println("HashMap");
        hashMap();

        System.out.println("HashTable");
        hashTable();
    }

    static void hashSet(){
        Set<String> nomes = new HashSet<String>();
        nomes.add("Richel");
        nomes.add("Edson");
        nomes.add("Bruno");
        nomes.add("Heuler");
        nomes.add("Hugo");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println(nomes.contains("SENSINE"));
    }

    static void sortedSet(){
        Set<String> nomes = new TreeSet<String>();
        nomes.add("Richel");
        nomes.add("Edson");
        nomes.add("Bruno");
        nomes.add("Heuler");
        nomes.add("Hugo");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println(nomes.contains("SENSINE"));
    }

    static void arrayList(){
        List<String> nomes = new ArrayList<String>();
        nomes.add("Richel");
        nomes.add("Edson");
        nomes.add("Bruno");
        nomes.add("Heuler");
        nomes.add("Hugo");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println(nomes.contains("SENSINE"));
    }

    static void hashMap(){
        Map<Integer, String> nomes = new HashMap<>();
        nomes.put(1,"Richel");
        nomes.put(2,"Edson");
        nomes.put(3,"Bruno");
        nomes.put(4,"Heuler");
        nomes.put(5,"Hugo");
        nomes.put(6,"Ana");

        System.out.println(nomes);
        System.out.println(nomes.containsKey(1));
    }

    static void hashTable(){

        Map<Integer, String> nomes = new Hashtable<>();
        nomes.put(1,"Richel");
        nomes.put(2,"Edson");
        nomes.put(3,"Bruno");
        nomes.put(4,"Heuler");
        nomes.put(5,"Hugo");
        nomes.put(6,"Ana");

        System.out.println(nomes);
        System.out.println(nomes.containsKey(1));
    }
}
