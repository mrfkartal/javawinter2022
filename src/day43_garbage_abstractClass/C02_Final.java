package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{

    public static void main(String[] args) {

        System.out.println(C01_Final.okulIsmi);
        // C01_Final.okulIsmi="Hasan Koleji";
    }

    /*
    public static void method1(){
        Override parent class'daki method'u child class'a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak parent class'daki method final olarak tanimlandigindan
        Java method'un uyarlanmasina izin vermiyor
        System.out.println("Parent class final method1");
    }
    */
}
