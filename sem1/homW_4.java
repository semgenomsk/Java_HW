package sem1;

// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.ArrayList;

public class homW_4 {
    public static ArrayList<Integer> arrayMulti(int i, int n, int min) {
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                m2.add(j);
            }
        }
        return m2;
    }
}