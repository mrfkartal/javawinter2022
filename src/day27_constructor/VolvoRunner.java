package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1= new Volvo();
        System.out.println(arb1.marka); // Volvo
        arb1.yakit="Dizel";
        arb1.elektrikliMi=false;
        System.out.println(arb1.maxHiz); // 240
        System.out.println(arb1.toString()); // Model : null Yakit : Dizel Max Hiz : 240
        Volvo arb2 = new Volvo();
        arb2.yakit="Elektrikli";
        arb2.elektrikliMi=true;
        arb2.model="XC90";
        arb2.maxHiz= arb2.maxHizAta();
        System.out.println(arb2.toString()); // Model : XC90 Yakit : Elektrikli Max Hiz : 160
    }
}
