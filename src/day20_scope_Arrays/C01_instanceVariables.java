package day20_scope_Arrays;

public class C01_instanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okulAcikmMi;


    public static void main(String[] args) {

        //sayi=10; sayi variable'i static olmadğı icin mait methoddan direk kullanılamaz
        //instance variabllara static metholardan ulasılabilmek icin obje oluasturmamız gerekir

        C01_instanceVariables obj1=new C01_instanceVariables();
        System.out.println(obj1.sayi);  //0 yazdırır çünkü sayıya bir değer atamadık
        obj1.sayi=10;
        System.out.println(obj1.sayi);   // 10 yazdirir
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okulAcikmMi);

        C01_instanceVariables obj2=new C01_instanceVariables();
        System.out.println(obj2.sayi);  //0
        System.out.println(obj2.bransIsmi);  //false

        obj1.okulAcikmMi=true;
        System.out.println(obj2.okulAcikmMi);  //false

    }
}
