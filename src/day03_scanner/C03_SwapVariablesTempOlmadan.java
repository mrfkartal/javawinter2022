package day03_scanner;

public class C03_SwapVariablesTempOlmadan {

    /*
    1-verilen sayi1 ve sayi2 variablelarının değerlerini ucuncu bir variable kullanmadan degistiren (swap) bir
    program yazınız

    orn: sayi1 = 10 ve sayi2 = 20;

    kod çalıştıktan sonra sayi1 =20
    sayi2=10

     */

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;

        System.out.println("swaptan önce sayi1 :" + sayi1  + " sayi2 :" + sayi2);

        sayi1=sayi2;
        sayi1=20;
        sayi2=10;

        System.out.println("swaptan sonra sayi1 :" + sayi1  + " sayi2 :" + sayi2);


    }

}
