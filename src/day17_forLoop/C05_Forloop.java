package day17_forLoop;

public class C05_Forloop {

    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin.
        1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
         */
        int sayi=55;  // kullanıcı dan 55 gelmiş gibi düşünelim

        for (int i = 1; i <=sayi ; i++) {

            if (i % 3 == 0){
                System.out.print(i + " ");
            }

        }



    }
}
