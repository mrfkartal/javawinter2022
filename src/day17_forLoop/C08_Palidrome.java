package day17_forLoop;

public class C08_Palidrome {
    public static void main(String[] args) {

        String input="kardes";
        palindromeKontrolEt(input);





    }

    private static void palindromeKontrolEt(String input) {

        String terstenInput=" ";

        for (int i = input.length()-1 ; i >=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.println("girdiğiniz kelimenin tersten yazılışı : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiğiniz kelime palindrome");
        }else{
            System.out.println("girdiğniz kelime palindrome değil");
        }

    }

    /*
    // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini
         kontrol eden bir program yazin.
     */
}




