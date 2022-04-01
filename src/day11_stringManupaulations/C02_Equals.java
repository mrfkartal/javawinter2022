package day11_stringManupaulations;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali"+" Can";

        System.out.println("str1 ;" + str1);
        System.out.println("str2 ;"+ str2);


        System.out.println("== ile karsılastır :" + (str1==str2));
        System.out.println("equels ile karsılastır :"+str1.equals(str2));

        String str3= str1 +"";
        System.out.println("str3 :" + str3);
        System.out.println("== ile karsılastır :" + (str3==str2));
        System.out.println("equels ile karsılastır :"+str3.equals(str2));


        //stringde == herzaman dogru sonuc vermez
        //bunun ıcın emin olduüumuz equels methoduunu kullanmayı tercih ederiz

        String str5="hasan";
        String str6="HASAN";

        System.out.println(str5.equals(str6)); //false verir çünkü string case sensivity dir. çünkü bir karakteri
        //bile farklı olsa aynı demez
        System.out.println(str5.toUpperCase().equals(str6));   //küçük harfe çevirince true der


    }

}
