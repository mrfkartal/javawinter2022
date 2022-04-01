package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        // java çalışmaya main methoddan başlar
        //sonra yukarıdan asagı soldan saga dogru calısır

        //eğer istersek bir variable once declare edip sonra değer atayabiliriz

        String okulIsmi;

        //java deger atamasi yapmadigimiz bir variable olusturmamiza itiraz etmez
        //ancak deger atamasi yapincaya kadar o variable'i kullanmamiza izin vermez
        //System.out.println(okulIsmi);

        okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi);


        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);

        okulIsmi="Java Koleji";

        //println ile print arasındaki fark
        //println dedıgımızde yazdırma isleminden sonra alt satira gecmez
        //sadece print dediginmize yazdirma isleminden  sonra alt satira gecmez
        System.out.println(okulIsmi);
    }

}