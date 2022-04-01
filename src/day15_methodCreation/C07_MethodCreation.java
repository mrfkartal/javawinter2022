package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {

        String str="Ali";


        //stringi yazdıran method olusturalım

        stringYazdir(str);

        //hosgeldiniz diyen bir method olusturun
        hosgeldinizYazdir();

        //kapanma mesajı yazan bir method olusturalim

        kapanmaMethodu();





    }

    public static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
    }
    public static void hosgeldinizYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("böylede olur");
    }
    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
