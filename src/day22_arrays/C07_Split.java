package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="java gün gectikçe güzelleşiyor";

        str.split(" ");

        String kelimeler[]=str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [java, gün, gectikçe, güzelleşiyor]

        System.out.println(kelimeler[1]);  // gün

        String gectikce[]=str.split("gectikçe");
        System.out.println(Arrays.toString(gectikce));  //[java gün ,  güzelleşiyor]

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler)); //[ ]
//[j, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, ç, e,  , g, ü, z, e, l, l, e, ş, i, y, o, r]
    }
}
