package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
         Kullanicidan pozitif bir rakam girmesini isteyin
          ve girilen rakama gore asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *
         */

        int input=5;


        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input ; j++) {
                //nested for loop ya dikdörtgen  veya ücgen formatinda olabilir
                //dikdörtgen istediğimiz de iki loop için de bağımsız en point belirleriz
                //ucgen sekli vermek icin inner loop'un end point'ini olarak outer değişkeni bağlar


                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}
