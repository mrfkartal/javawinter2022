package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[];  // deger atansu yapmadik ama java kabul etti ancak
        // kullanmamiza izin vermez


        arr=new int[6];
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0, 0]
        System.out.println(arr.length);   //6
                                            // strindeki lenght bunda yoktur

        //arraydeki her bir elemani index degeri kadar artiralim

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;
        }
        System.out.println(Arrays.toString(arr));   //[0, 1, 2, 3, 4, 5] atadi[imiz index kadar artirip yazduracak

        //son indexteki elementi yazdiralim
        System.out.println(arr[arr.length-1]);  //5

        
    }
}
