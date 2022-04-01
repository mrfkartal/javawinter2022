package day17_forLoop;

public class C06_Forloop {
    public static void main(String[] args) {

        // verilen 2 harf ve aralarındaki harfleri yazdıran
        //bir kod yaziniz

        char ilkHarf='c';
        char sonHarf='s';
        for (char i = ilkHarf; i <=sonHarf ; i++) {

            System.out.print(i+ " ");
        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        //baslangıc ve bitis sayıları arasında artıs miktari ile oluscaka tüm sayı
        //yazdırın

        for (double i = baslangic; i < bitis ; i+=artis) {
            System.out.println(i+ " ");

        }
        }

    }

