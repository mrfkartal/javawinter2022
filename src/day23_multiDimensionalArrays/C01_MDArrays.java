package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);     //7
        System.out.println(arr[1][1]);      //10

        //ilk inner arrayin tüm elementlerini yazdırın dersek

        System.out.println(arr[0]);   //arr[0] bir array oldugundan direk yazdıramaz.
        System.out.println(Arrays.toString(arr[0]));

        System.out.println(Arrays.toString(arr));   //referans değerlerini verir. yazdırmaz

        //MDArray de tüm elemneleri bir array olarak yazdirmak istersek

        Arrays.deepToString(arr);
        System.out.println(Arrays.deepToString(arr));  // hepsini yazdırır

    }
}
