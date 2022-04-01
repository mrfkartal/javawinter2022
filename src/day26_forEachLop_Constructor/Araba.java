package day26_forEachLop_Constructor;

public class Araba {
    /* Java'da her Class olusturdugumuzda
       Java o class'dan ileride objeler uretmek gerekecegini bilir
       ve biz ozellikle belirtmesek de Java
       her olusturdugu class'a bir constructor koyar

       Java'nin class olustururken class'a koydugu constructor'a
       DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

       Eger biz gorunur bir constructor'imiz olsun istersek
       default constructor ile ayni gorevi yapan bir constructor olusturabiliriz
       veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
       farkli ozelliklerde constructorlar da olusturabiliriz
       constructor'lari birbirinden farklilastiran tek ayricalik
       kullanilan parametre sayisi ve parametre data turudur
     */
    public Araba(){
        System.out.println("parametresiz constructor calisti");
    }
    /* bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
       iki seye dikkat etmelisiniz
       1- Constructorlar'in ismi class ismi ile ayni olmak zorundadir
       yani buyuk harfle baslar.

       2- Constructor'larin return type'i olmaz
       ozetle : constructorin adi class adi ile ayni olmali ve
                return type'i olmamali
     */
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }
    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");
    }
}
