package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int a=15;
        int b=a++;
        System.out.println(b);
        System.out.println(a);
        b=--a;
        System.out.println(b);

        b=a--;
        System.out.println(a);

        int e=20;
        int m=e++;

        System.out.println(m);    //20
        System.out.println(e);   //21
        m=++e;
        System.out.println(m); //22
        System.out.println(e);  //22


    }
}
