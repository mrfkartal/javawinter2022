package day34_deneme;

import day34_accesModifier_encapsulation.C01;

import static day34_accesModifier_encapsulation.C01.halkaAcikSayi;

public class denemeChild extends C01 {

    public static void main(String[] args) {
        System.out.println(halkaAcikSayi);
        halkaAcikSayi=30;
    }


}
