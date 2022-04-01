package day07_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a<b && b<100) {   //true ise altdakierşide yazdırır
            System.out.println("isteginiz gerceklesekcek");
            System.out.println("body icindeki tum kodlar calısır");
        }


        if (a>0) System.out.println("suslu parantez olmazsa sadece sir satir calisir"); //; virgülde bitirir { para
        // parantez yoksa.

        // bir if cumlesinin daha anlaşılır olmasıni istiyorsanız
        //if bodysini {}icine yazmalısınız
        //bodyyi {} icine yazmazsak da if cümlesi calisir
        //ancak ilk ; gordüğümde if cümlesi bitmiş olur.

        //24.satirdaki kod 15.satirdaki if dogru olsada calısır false oldsada calısır.

        System.out.println("2.satir calisti");
           }
}
