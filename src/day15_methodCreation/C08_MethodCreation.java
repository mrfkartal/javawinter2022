package day15_methodCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {

        String isim = "yasemin yalcin";
        String soyisim= "sari";
        String kKNo="1234567890128795";

        //eğer bir methoddan bir islem yapmasını
        //ve yaptığı işlemi bize getirmesini isterseniz
        //return type voit değil bize getireceği sonucun data türünde olmalıdır

       isimSoyisimGizle(isim, soyisim);
       //bu metotdan bizden istenen isim ve soyisimin gizlenmiş halini getirmesini istiyorum
        //beklediğim dönüş String olur

        // gizlenmişisim soyisime yazdırcaz
       krediKartiGizle(kKNo);
    }
    public static void krediKartiGizle(String kKNo) {

        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        //method olsturmadan 3. adim
        //method calısınca sadece birsey mi yazdıracak
        //yoksa bize bir data mi döndürecek buna karar vermektir
        //bu soruda gizlenmiş isim soyisim döndürmesi istendiğiniden
        //return Type i void değil Stiring seçtik
        //
        return yeniIsim+" "+yeniSoyisim;
    }
}
