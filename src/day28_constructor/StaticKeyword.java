package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;
    public static void main(String[] args) {
        /*  Statik variable'lar direk class'a baglidir
            Class icerisinde yapilan her turlu degisiklik static variable'larda kalici olur
            Instance variable'lar ise obje'ye baglidir
            instance variable'lara sadece obje uzerinden erisilebilir
            ve bir obje uzerinden erisilerek yapilan degisiklik
            instance variable'in degerini tum objeler icin kalici olarak degistirmez
            sadece o obje icin instance variable degerini kalici olarak degistirir
         */
        System.out.println("sayi1 : " + sayi1); // 0
        // System.out.println("sayi1 : " + sayi2); static olmadigi icin main method'dan direk kullanamayiz
        StaticKeyword obj1=new StaticKeyword(); //obje olusturarark yazmamiz lazim
        System.out.println(obj1.sayi2); // 0
        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : " + sayi1); // 1
        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // 1
        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2); // 0
        System.out.println(obj2.sayi1); // 1
        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 2
        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // 2
        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1); // 3
        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 3
    }
}
