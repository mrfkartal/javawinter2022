package day05_matematikselIslemler;

public class C01_PreIncerementPostIncrement {
    public static void main(String[] args) {

        int sayi=10;
        //bu sayıyı bir artırmak istersek
        sayi ++;
        System.out.println(sayi);  //11

        sayi ++;
        System.out.println(sayi);  //12
        //11. ve 12. satırda yaptığım işlermi teksatırda yaparsam
        //java iki işlemdn önce hangisini yapacağını bilmek ister

        System.out.println("pre-incrementen once" + sayi);  //12

        //önce artırır sonra yazdırıısak java yeni değeri yazdırır.
        //ama önce yazdırır sonra artırırsak bu durumda eski deger yazdırılır.

        System.out.println("pre-incrementten sonra" + ++sayi); //13

        //souta ++sayi diye yazarsak önce artırdık sonra yazdırdık gibi olur.


        System.out.println("post-increment satirinda once " + sayi++); //13 yazdir sonra artir.
        System.out.println("post increment satirindan sonra " + sayi );  //
    }
}
