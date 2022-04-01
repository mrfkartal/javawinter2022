package day07_IfElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println(a + b);
        }
        if (a == b) {;
        System.out.println(a * b);
            }
            if (a>100) {
                System.out.println("a yüzden büyük");
            }
            if (a*b>5){
                System.out.println("sayıların çarpımı 5 ten büyük");
            }
            // bagımsiz if cumleleri kendileri dışındaki kodlarla ilgilenmezler bir şart ve o şarta
        //bağlı sonuca odaklıdır.
        //birden fazla bagimsiz if cümlesi odluğunda hepsinin body si çalışsa bileceği gibi hiçbirisin body
        //çalışabileceği gibi hepsinin çalışmayada bilri.


    }


}
