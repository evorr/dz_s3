//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class zadacha_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array_all = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            array_all.add((int) (Math.random() * 100));
        }
        System.out.print(array_all);
        ArrayList<Integer> array_even = new ArrayList<Integer>();
        for (int item: array_all) {
            if(item % 2 == 0){
                array_even.add(item);
            }
        }
        array_all.removeAll(array_even);
        System.out.println();
        System.out.print(array_all);
    }
}
