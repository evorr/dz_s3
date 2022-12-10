//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;

public class zadacha_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            array.add((int) (Math.random() * 10));
        }
        System.out.print(array);
        Collections.sort(array); //сортировали по возрастанию
        System.out.println();
        System.out.print(array);
        System.out.print("\n min = " + array.get(0) + " max = " + array.get(array.size() - 1));
        Set array_set = new HashSet(array); //убрали повторяющиеся значения
        List<Integer> array_list = new ArrayList<>(array_set);
        if(array_list.size() % 2 != 0) {
            int mid = array_list.size() / 2;
            System.out.print(" mid = " + array_list.get(mid));
        } else {
            System.out.print(" mid = " + array_list.get(array_list.size() / 2));
        }
    }
}
