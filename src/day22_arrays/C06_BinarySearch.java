package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {


        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=-10;

        //Eger Javadan Hazir BinarySearch ile yapmak isterseniz
        //once sort methodunu kullanip, sonra binarySearch yapmalıyız
        //binarySearch() bize istenen sayinini indexi veriri

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //[0 1 3 4 5 6 9 9 25 45
        System.out.println(Arrays.binarySearch(arr,istenenSayi));  //-9

        //*** istenen sayi listede yoksa o sayi liste icinde kacinci sayilar arasinda ise
        //basina eksi - olarak o indeksi verecek yani istnensayi=22 olsauydi listede -8 verecekti
        //cunku 22 syisi listede olsaydi 8. indexte olacakti***

        //eger olmayan bir elementi aratirsak
        //Java bulamadiğini göstermek için -işraeti koyar
        //sonra da o sayi olsaydi siramasi ne olarak ise o sirayi bize verir





    }
}
