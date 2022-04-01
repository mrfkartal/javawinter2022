package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);  //[Aykut, yusuf, ilker, oguzhan]

        isimler.set(1,"seçkin");   // yusuf gitti yerine seckin geldi
        System.out.println(isimler);  //[Aykut, seçkin, ilker, oguzhan]

        //daha önnceden listede var olanlari da arsiv gibi tutmak istersek log tutarız
        List<String> Loglistesi = new ArrayList<String>();

        Loglistesi.add(isimler.set(2,"cosmos"));  //cosmos 2.index ile yer geciyor
                                             // 2.indexteki log listesine ekleniyor



        System.out.println(isimler);  //[Aykut, seçkin, cosmos, oguzhan]
        System.out.println(Loglistesi);  //[ilker]



    }
}
