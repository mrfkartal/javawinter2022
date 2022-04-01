package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //verilren bir arrayi buyukten kucuge siralayip yazdiran bir methof olusturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        terstenSiraYazdir(arr);

    }

    private static void terstenSiraYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersarr[]=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            tersarr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(tersarr));

    }
}
