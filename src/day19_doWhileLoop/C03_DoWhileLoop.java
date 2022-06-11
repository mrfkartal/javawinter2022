package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*kullanıcıdan pozitif bir tamsayi alip
         while loop ile sayidan küçük pozitif tamsayiları yazdıralim
         */
        int input=3;

        int sayi=1;
        int sayac=1;

        while( sayi<input){   //while loop önce kontorol yapıyor sonra işlem yapıyor bunun
                                // için bir kere fazla yazduruyor.
            System.out.println(sayi);
           sayi++;
        }
        // aynı soruyu do-while loop ile yapalim
        sayi=1;
        do{
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);

    }
}
