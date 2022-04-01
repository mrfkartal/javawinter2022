package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        /* non primitive data turlerinde  objenin kendisi degil de
           icindeki elementler degisirse
           Java objenin referansi ve objenoin KENDISI degismedigi icin
           element degisikliklerini kabul eder ve kalici yapar
         */
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        arrDegistir(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr)); // [5, 6, 3]
    }
    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]
    }
}

