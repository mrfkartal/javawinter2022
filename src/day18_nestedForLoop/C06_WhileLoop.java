package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki tam sayi alıp bu sayıları ve aralarındaki tüm sayiları
        yazdıran bir kod olusturun.
         */

        int baslangic=40;

        int bitis=60;

        for (int i = baslangic ; i <=bitis ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");   //alt satira gitmek için muhakkak boş yazdırma yapacağız

        // aynı soruyu while loop ile yapalim

        int i=baslangic;
        while (i<=bitis){
            System.out.print(i + " ");
           i++;
        }
        System.out.println("");
        System.out.println(baslangic);  //61
    }
}
