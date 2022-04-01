package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */
        int input=5648;
        int rakam=0;
        int rakamlarToplami=0;

        while(input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);

    }
}
