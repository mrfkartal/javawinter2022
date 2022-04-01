package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //verilen bir array'e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        //arr[3]=8;  array'de olmayan bir index'e atama yapamayiz

        //arr={1,3,5,6};   //var olan bir array'e ayni boyutta bile olsa direk
                            //yeni degerler iceren bir ATAYAMAYIZ

        arr=new int[4];   // [0, 0, 0, 0]

        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];

        arr=arrYeni;

        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));  //[2, 0, 0, 5, 0]

        // BİR ARRAY'E İÇİNDE HAZİR ELEMENtLERİN OLDUĞU YENİ BİR DEĞER ARRAY ATAMAK İSTERSENİZ BUNU
        //BUNU{1,2,3} ŞEKLİNDE YAZARAK DEĞİL
        //NEV İNT[3] DİYEREK OLUSTURUp SONRA DEGER ATAYARAK TAMAMLADIgIMIZ BİR ARRAYİ
        //ASSİNG EDEREK YAPABİLİRİZ

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]

    }

}
