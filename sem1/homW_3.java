package sem1;

// Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

import java.util.ArrayList;

public class homW_3 {
    public static ArrayList<Integer> arrayMulti(int i, int n, int max) {
        ArrayList<Integer> m1=new ArrayList<Integer>();
        for (int j = 1 + i; j <= max; ++j) {
            if (j % n == 0) {
                m1.add(j);
            }
        }            
        return m1;
    }
}