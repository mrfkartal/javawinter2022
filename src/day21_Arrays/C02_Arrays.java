package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]= {"ali", " veli", "ayse"};
        //array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]);  // ali yazdirir 0 index ali cunku

        arr1[1]="esila";   // 1 nolu index teki veli yi esila ile degistirecegiz

        System.out.println(arr1[1]);  // esila

        //arrayin icindeki indexi kullanarak elementlere ulaabilir ve update edebiliriz

        int arr2[]=new int[4];    // new int[4] icindeki uzunluktur 4 elementli int demek ist.

        System.out.println(arr2[1]);   //0
        System.out.println(arr2[3]);   //0
        //System.out.println(arr2[5]);   // array index outofbounds exceptinon
                                        // hatasi veriri cunku 5. index yoktur maks 3 indekse
                                        // kadar verilmisir

        // arayintamamini yazdirmak istersek
        System.out.println(arr2);   //[[I@5b464ce8 referans nosunu verrir
                                    // arrayler non primitive olduklarindan direk yazdirmak
                                    // istersek java referans bilgisini yazdirir

        for (int i = 0; i <4 ; i++) {
            System.out.println(arr2[i]+" ");
        }
        System.out.println("");
        //arrayi yazdirmak icin javadaki arrays classinda toString() kullanilir

        System.out.println(Arrays.toString(arr2));  // [0,0,0,0] yazdiriri

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2)); //[0,11,0,22] yazdiriir cunku deger atadik indexlerine

        System.out.println(Arrays.toString(arr1));  //[ali, esila, ayse]


    }
}
