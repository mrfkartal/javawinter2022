package day23_multiDimensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        //Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son
        // elemanlarin carpimini  ekrana yazdiran
        // bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int arr[][]={ {1,2,3}, {4,5}, {6,0,2} };
        int carpim=1;     // bir tane konteynir olusturmamzi lazim

        for (int i = 0; i <arr.length; i++) {

            carpim*=arr[i][arr[i].length-1];

        }
        System.out.println("son elemenlerin carpimi : " +carpim);


    }
}
