package day38_inheritance_overiding;

public class Isci extends Personel{
    public String statu="Isci";
    public String haklar="Isciler Kidem tazminati alirlar";
    public String ikramiye="Isciler Yilda bir ikramiye alir";
    public void mesai(){
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum isciler 30 gun * 8 saat * 11 euro = " + (30*8*11) + " Euro maas alir");
    }
}
