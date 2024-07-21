package kurs_2.dz;

import java.util.HashMap;
import java.util.Map;

public class povtor_element {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 4, 4, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);

            }
        }
        System.out.println(map);
    }
}
