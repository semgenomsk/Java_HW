package sem1;

import java.util.Random;

// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class homW_2 {
    public static void main(String[] args) {
        int n = Integer.toBinaryString(new Random().nextInt(100)).length() - 1;
        System.out.println(n);
    }
}