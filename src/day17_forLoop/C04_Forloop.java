package day17_forLoop;

public class C04_Forloop {
    public static void main(String[] args) {

        //10 ile 30 arasindaki (10 ve 30 dahil)
        //sayilari aralarında virgül olarak ayni satirda yazdirin
        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+", ");
        }
        System.out.print(30);

        int baslangic=15;
        int bitis=20;
        for (int i = baslangic ; i <=bitis ; i++) {

            if (i<bitis){
                System.out.println(i+", ");
            }else{
                System.out.println(i);
            }


            }
        }




    }

