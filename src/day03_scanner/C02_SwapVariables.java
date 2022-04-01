package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

/*  interwiev soruuusu
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz

        Orn    : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10

*/

        int sayi1=10;
        int sayi2=20;
        System.out.println("swaptan önce sayı1:"+ sayi1 + ",sayi2 :" + sayi2);

        //su ve kum dolu kovanın 3.kova alarak yerlerinin değişmesi örneği

        // 1.adim bos bir variable olusturup sayi1 i ona atayalım

        int temp=sayi1;

        // 2.adım sayi1 e yeni değerini atayalım
        sayi1=sayi2;

        //3.adım sayi2 ye yeni değerini atayalım
        sayi2=temp;

        System.out.println("swaptan sonra sayi1:" + sayi1 + ", sayi2 :" + sayi2);




    }
}
