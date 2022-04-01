package day26_forEachLop_Constructor;

public class C01_forEachLoop {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,11};

        // elementleri for loop ile yazdiralim

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        // bunu for-each loop ile yapacak olursak
        // for-each loop'u calistirmak icin hedef bir collection vermeliyiz

        for (int each : arr
        ) {
            System.out.print(each + " ");
        }
        // avantaji : index, baslangic degeri, bitis degeri gibi detaylarlarla
        // ugrasmamiza gerek kalmadan colections'dan tum elementleri bize getirir
        // dezavantaji : index'e bagli bir islem yapamayiz
    }
}