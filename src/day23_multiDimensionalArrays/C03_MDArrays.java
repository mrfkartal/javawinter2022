package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {


        //boyutlari belirli bir arrayi elementleri girmeden olusturalim

        //bir okulda içinde 24 öğrenci olan 8 sınıf vardır

        int arr[][] =new int[8] [24];

        // bir ilçede herbirinde 24 öğrenclik 8 sınıf bulunan 5 okul vardir

        int ilce[][][] =new int[5][8][24];

        //bir okulda 3 tane 24 kişilk 2 tanede 22 kşilik sınıf vardır
        // bunu yapamauiz cunku array de toplama cikarma yapamayiz bunun icin iki farkli 22 ve 24 siniflik

            int sinif24[][]=new int [3][24];
            int sinif22 [][]=new int[2][22];


        //olustururken elementleri atama yaparsak farkli uzunlukta inner arrayler tanımlayabiliriz

        int arr1[][]={{3,1,7},{6,10,2}};
    }
}
