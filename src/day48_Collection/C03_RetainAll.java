package day48_Collection;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {
    public static void main(String[] args) {

        Set<Integer>  set1=new HashSet<>();
        Set<Integer>  set2=new HashSet<>();

        set1.add(10);
        set1.add(20);

        set2.addAll(set1);
        set2.add(25);
        set2.add(30);

        System.out.println(set1); //[20, 10]
        System.out.println(set2); //[20, 25, 10, 30]

        System.out.println(set2.removeAll(set1)); //true

        System.out.println(set1);  //[20, 10]
        
        System.out.println(set2);  //[25, 30]
    }
}
