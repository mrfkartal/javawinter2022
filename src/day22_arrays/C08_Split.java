package day22_arrays;

public class C08_Split {

    public static void main(String[] args) {


    //verilen bir cümlede istenen harfin kac defa kullanıldığını yazdiran
    //bir method olusturun

    String cumle = "nerede o 'hello world' yazdıramayan ögrenciler?";
    String harf = "e";


    harfKacKereKullanilmis(cumle, harf);

    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {
        int sayac=0;

        String karakterler[]=cumle.split("");
        for (int i = 0; i < karakterler.length ; i++) {
            if (karakterler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("aradiginiz" +harf+ "verilen cumlede"  +sayac+ "adet kullanilmistur");
    }

}