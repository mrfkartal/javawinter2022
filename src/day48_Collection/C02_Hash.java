package day48_Collection;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str="java cok guzel";

        System.out.println(str.hashCode()); //520405140

        String str2="hava cok guzel";
        System.out.println(str2.hashCode());  //1531522390

        Set<Integer> sayikumesi=new HashSet<>();

        System.out.println(sayikumesi.hashCode()); //0

        sayikumesi.add(10);
        System.out.println(sayikumesi.hashCode()); //10

        sayikumesi.add(20);
        System.out.println(sayikumesi.hashCode()); //30


    }
}
