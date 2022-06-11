package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /* LinkedList'in 2 tane parent Interface'i vardir
           LinkedList olustururken data turu olarak;
           LinkedList secersek : iki parent'daki tum methodlar
           List secersek : sadece List Interface'indeki method'lar
           Deque/Queue secersek : Deque'deki method'lari kullanabiliriz
         */


        LinkedList<Integer> ll1=new LinkedList<>();

        ll1.add(10);  //Linkedlist


        //sadece list interface inden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10); //Linkedlist
        ll2.remove(0);

        // sadece deque den gelen ozellikleri kullanalim

        Deque<Integer> ll3=new LinkedList<>();

        ll3.addFirst(20);
        ll3.addLast(15);
        System.out.println(ll3); //[20, 15]

    }
}
