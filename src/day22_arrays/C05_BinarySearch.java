package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //verilen array'de istenen bir elementin var olup olmadığını true/false yazdırarak
        //gösteren bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=14;

        İstenenElemanVarmi(arr,istenenSayi);


    }

    private static void İstenenElemanVarmi(int[] arr, int istenenSayi) {
        for (int i = 0; i <arr.length; i++) {

            if(arr[i]==istenenSayi){
                System.out.println("true");
                break;
            }

        }



    }

}
