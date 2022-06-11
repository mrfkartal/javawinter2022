package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class MapAciklamalami {
        public static void main(String[] args) {
            // gorevimiz sinif listesini düzenli yazdırmak
            Map<Integer, String> sinif = MapOlustur.myMap();
            // System.out.println(sinif);
            sinifListYazdir(sinif);
        }

        public static void sinifListYazdir(Map<Integer, String> sinifMap) {

            // Önce, SinifMap içerisindeki key'leri bir Sete aktardık, sonra index kullanım avantajı olduğu için Set'i de List'e aktardık.
            Set<Integer> keySets = sinifMap.keySet(); // [100 101 102]
            List<Integer> keyList = new ArrayList<>(); // List
            keyList.addAll(keySets); // index ile ulaşabileceğimiz key'leri barındıran bir List oluşturduk.

            // Önce, SinifMap içerisindeki value'leri bir Collection'a aktardık, sonra index kullanım avantajı olduğu için Collection'i de List'e aktardık.
            Collection<String> valueSets = sinifMap.values(); // [Ali, Can, Dev , Veli, Yan, QA , Ali, Yan, C#]
            List<String> valueList = new ArrayList<>(); // List.
            valueList.addAll(valueSets);// index ile ulaşabileceğimiz value'leri barındıran bir List oluşturduk.

            // Aşağıdaki 4 satırda, oluşturacağımız MD arrayin boyutlarını belirledik.
            int outerArrayLength = valueSets.size(); //outer array length belirlemek basit.

            String ilkVeri = valueList.get(0); // inner array length için ilk indexteki bilgileri alıp bir array'e attık.
            String[] ilkveriArray = ilkVeri.split(",");
            int innerArrayLength = ilkveriArray.length + 1; // bu arrayin uzunluğu, bizim value bilgilerimizin uzunluğu kadardır. +1 diyerek en başa da key bilgisini yazmak istedim.

            // şimdi key ve value bilgilerini aynı anda içeren bir MD oluşturuyoruz.
            String[][] keysAndvaluesMDArray = new String[outerArrayLength][innerArrayLength];
            for (int i = 0; i < outerArrayLength; i++) {
                keysAndvaluesMDArray[i][0] = String.valueOf(keyList.get(i)); // her inner arrayin ilk elemanı o inner arrayin key bilgisidir.
                String temp[] = valueList.get(i).split(","); // geçici bir temp [] oluşturduk ve valueList'den gelen bilgileri array olarak buna atadık.
                for (int j = 1; j < innerArrayLength; j++) {
                    keysAndvaluesMDArray[i][j] = temp[j-1];
                }
            }
            System.out.println(Arrays.deepToString(keysAndvaluesMDArray));
            // [[101, Ali, Can, Dev], [102, Veli, Yan, QA], [103, Ali, Yan, C#], [104, Murat, Kara, DB], [105, Mert, Aydın, RA], [106, Bilal, Ela, PHD]]

            // Şimdi elde ettiğimiz MD arrayi printf ile düzenli bir biçimde yazdırabiliriz.
            System.out.printf("%-9s %-10s %-10s %-10s\n", "Numara", "Isim", "Soyisim", "Brans");
            System.out.println("==========================================");

            for (int i = 0; i < outerArrayLength; i++) { //outer array uzunluğu kadar ilerle
                int j = 0;
                while (j < innerArrayLength-1) // inner array uzunluguna ulaşana kadar donguyu calistir.
                    System.out.printf("%-10d %-10s %-10s %-10s\n", Integer.parseInt(keysAndvaluesMDArray[i][j]),
                            keysAndvaluesMDArray[i][++j], keysAndvaluesMDArray[i][++j],keysAndvaluesMDArray[i][++j]);
            }
        }
}
