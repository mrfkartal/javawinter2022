package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day40_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while( (k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) { // FileNotFoundException
            e.printStackTrace();
        }  catch (IOException e) { // IOException
            e.printStackTrace();
        }
        /*
        Exception'lar icin de parent child iliskisi mevcuttur
        Eger bir kod icin birden fazla exeption olusma ihtimali varsa
        Oncelikle olasi exception'lar parent-child iliskisi tasiyor mu bakmamiz gerekir

        Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz
        Eger Parent child iliskisi varsa
        sadece parent exception'i yazabiliriz
        veya ikisini de yazmak istersek
        child'i once parent'i sonra yazmaliyiz
         */
        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        biz bu gune kadar tamamina CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavrami da hayatimiza girdi
         */
    }

}
