package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {


        List<Integer> sayilarList=new ArrayList<>();

        sayilarList.add(5); // [ 5]
        sayilarList.add(3);   //[5,3]
        sayilarList.add(0,7);      // [7,5,3]
        sayilarList.add(2,7);      // [7,5,7,3]

        System.out.println(sayilarList.get(2));  //7  bize ingeter döndürecek

        System.out.println(sayilarList);    //[7, 5, 7, 3]
    }
}
