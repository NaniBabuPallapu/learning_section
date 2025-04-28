package company.com.collections_programs;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElements {
    public static void countFrequencyOfElements(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : array){
            map.put(value, map.getOrDefault(value, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" occurred "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        countFrequencyOfElements(arr);
    }
}
