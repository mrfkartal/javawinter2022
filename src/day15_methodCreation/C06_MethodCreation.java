package day15_methodCreation;

public class C06_MethodCreation {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        //iki variable ın degerlerinin toplayan bir method olusturalım
        //1.adım method adını yazalım
        //2.adım methoda göndermem gereken argument var mı?
    ikiSayiTopla(25,50);


    C04.dortHarfiTersineCevir("sema");

    } //main mehod sonuna gelince class çalışmayı durudurur.!

    //bir methodu olusturmak calışması için yeterli değildir
    //method ancak cagrılırsa calısır
    //BİR METHODUN ÇALIŞMASI İÇİN MUTLAKA ÇAĞRILMASI GEREKİR
    //aynı class veya farklı class da olmasının hic bir onemi yoktur
    //java main method da yukarıdan asagıya doğru calısır
    //ve geldiği satırı calıstırır


    private static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen iki sayının toplamı : " + (a+b));
    }
}
