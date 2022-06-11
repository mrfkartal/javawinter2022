package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstractMethod();


    /*
    Abstract method'lar
    child class'larin MUTLAKA override etmesi gereken method'lardir
    dolayisiyla HICBIR ZAMAN direk calistirilmazlar
    ve bu sebeple method body'sine ihtiyac yoktur
   bir class'in veya method'un abstract olup olmadigini anlayabilir miyiz ?
   - abstract yaziyorsa abstractir, yazmiyorsa degildir
   (abstract olmayan class'lara concrete class/method denir)
   Abstract methodlar body'e sahip olamaz
   Concrete method'lar ise method body'si olmadan olusturulamaz
     */
}
