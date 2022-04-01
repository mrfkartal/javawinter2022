package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir rakam alıp çarpım tablosu olusturalım
         */
        int input=3;

        //1 2 3               1*1  1*2  1*3
        //2 4 6               2*1   2*2   2*3
        // 3 6 9              3*1   3*2   3*3

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.println("");  //satiri asağıga geçirmek için
        }

    }
}
