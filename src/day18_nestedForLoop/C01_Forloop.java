package day18_nestedForLoop;

public class C01_Forloop {

    public static void main(String[] args) {

        /*
        / Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
         ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)
         */

        int input =9;
        int faktoryel =1;
        for (int i = input; i >=1 ; i--) {

            faktoryel*=i;

           // System.out.println(input+"! = "+faktoryel); burda her kademesini yazdırır.
        }
// loopun dışında yazdırırnca çıkar
       System.out.println(input+"! = "+faktoryel);

    }
}
