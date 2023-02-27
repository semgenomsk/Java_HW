package sem1;

// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

import java.util.Random;

/**
 * homW_1
 */
public class homW_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2001);
        System.out.println(i);
    }
}