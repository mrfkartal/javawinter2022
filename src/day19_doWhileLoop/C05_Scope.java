package day19_doWhileLoop;

public class C05_Scope {
    
        //1-bir method icerisinde olusturualn variablelar sadece olusturuldukları
        //method da kullanılabilirler, baska methodlarda kullanılamazlar
        //2-tüm methodların kullanabilmesini istediğimiz variabları Class level'da olusturuz
        //Class levelde olusturduğumuz variabli 
        // --static yaparsak tüm methodlar kullanabilir
        // --static olmazsa(instance) o zaman sadece static olmayan methodlar kullanılabilir
        //3- Loop içinde olusturulan variablelar loop icerisinde kullanılabilir
        // ama loop un dısında kullanılamaz.

    static String kurs="java";
    int level=10;
    
    
    
    public static void main(String[] args) {
    
    int sayi=10;
    //isim="vali can";
    System.out.println(kurs);
     //   System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopsayi=20;
        }
        //System.out.println(i);

        int sayi2;


    }
    public static  void method1(){
    //sayi=20;
    String isim="ali can";
    System.out.println(kurs);

    }
    public void method2(){
        //sayi=30;
        //isim="ayse SAn";
        System.out.println(kurs);
        System.out.println(level);

    }
}
