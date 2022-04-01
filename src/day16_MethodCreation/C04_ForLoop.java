package day16_MethodCreation;

public class C04_ForLoop {

    public static void main(String[] args) {

        //verilen stringi tersten yazdıran bir kod yazınız

        String str="bu java cok zevkli";

        for (int i =str.length()-1 ; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }

    }
}
