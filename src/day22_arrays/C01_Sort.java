package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr []={"S","M","A", "T" };

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //[A M S T]
        // JAVA DA BU SIRALAMAYA natural order denir
        //sayi olursa küçükten büyüğe
        //metin olursa alfabetik sıralamaya göre

    }
}
