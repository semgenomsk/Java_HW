package sem2;

import java.util.Scanner;

// Дано два числа, например 3 и 56, 
// необходимо составить следующие строки: 
// 3 + 56 = 59 
// 3 – 56 = -53
// 3 * 56 = 168 
// Используем метод StringBuilder.append().

public class homW_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int a = 56;
        int b = 3;
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        builder.append(String.format("%d / %d = %d\n", a, b, a / b));
        System.out.println(builder.toString().replaceAll("=", "равно"));
    }
}
