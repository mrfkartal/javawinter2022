package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {

    public static Map<Integer, String> myMap() {
        Map<Integer, String> siniflist = new HashMap<>();

        siniflist.put(101, "ali, can, dev");
        siniflist.put(102, "veli, yan, QA");
        siniflist.put(103, "ali, yan, c*");

        return siniflist;


    }
}

