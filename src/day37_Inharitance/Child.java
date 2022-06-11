package day37_Inharitance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir class'i child class yaptigimizda
    // parent class'daki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifier'i uygun bir modifier yapilmalidir
    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){

        // Child class'da tum constructor'larin ilk satirina
        // Java'nin yerlestirdigi constructor PARAMETRESIZ dir yani super()

        System.out.println("Child class parametreli cons.");
    }

    Child(int sayi1, int sayi2){

        // Eger parent class'dan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        // bunu Child class'daki constructor'in ILK SATIRINA yazmalisiniz

        super(sayi1,sayi2);

        System.out.println("Child iki parametreli cons.");
    }
    public static void main(String[] args) {
        Child child=new Child(5,8);
    }

}
