package day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {


        //verilen multi dimensional arrayin tüm elementlerinin toplamini bulunuz.
        int arr[][]={{3,1,7},{6,10,2}};

        int toplam=0;   //ilk once bir konteynir olusturmamiz lazim 0 degiskenli

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                toplam += arr[i][j];
            }
        }

    }
}
