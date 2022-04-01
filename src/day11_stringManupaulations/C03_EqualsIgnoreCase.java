package day11_stringManupaulations;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        //kullanıcıya derse katilip katılmayacağı sorun
        //evet derse  cevabını ve "derse katliminiz alınmıstır" yazdırın
        //hayir derse cevabini ve "sonraki derslerimize bekleriz" yazıdırn

        Scanner scan=new Scanner(System.in);
        System.out.println("derse katılmak istermisiniz ? \n Evet veya Hayir yaziniz");
        String cevap=scan.next();
        if(cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız : "+ cevap + "\nkatiliminiz onaylanmıştır");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabınız :" +cevap+ "\nSonraki derslerimize bekleriz" );
        }else {
            System.out.println("lütfen evet veya hayir yaziniz");
        }

        String isim="kartal al elma";
        System.out.println(isim.length()); //lenght isim karşılındaki ismin kaç karakter olduüunu gösterir
        //14 karakterli


    }
}
