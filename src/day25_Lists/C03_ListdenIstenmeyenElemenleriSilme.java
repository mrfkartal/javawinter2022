package day25_Lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenIstenmeyenElemenleriSilme {

    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi silip kalanlari
        //yeni bir array olarak yazdıran bir method olusutrun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;

        istenmeyenElementiSilveYazdir(arr,istenmeyenEleman);
    }

    private static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
