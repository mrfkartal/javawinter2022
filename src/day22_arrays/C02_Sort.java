package day22_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        //verilen bir array'da en küçük ve en büyük değerleri yazdırın

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        //sort methodu olmadan yapalim

        int enKücükSayi = Integer.MAX_VALUE;//arr[0] da yazilabilir cünkü döngü icinde bu deger degisecektir.
        int enBüyükSayi = Integer.MIN_VALUE;//arr[0] da yazilabilir cünkü döngü icinde bu deger degisecektir.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < enKücükSayi) {
                enKücükSayi = arr[i];
            }
            if (arr[i] > enBüyükSayi) {
                enBüyükSayi = arr[i];
            }
        }
        System.out.println("En büyük eleman : " + enBüyükSayi);
        System.out.println("En kücük eleman : " + enKücükSayi);
        Arrays.sort(arr);
        System.out.println("En büyük eleman : " + arr[arr.length - 1]);
        System.out.println("En kücük eleman : " + arr[0]);
    }
}
