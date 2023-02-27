package sem2;

// *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class homW_3 {
    public static void main(String[] args) {
        String s = "Hello\n";
        System.out.print(s);

        if (s.length() > 0) {
            reversesString(s, s.length() - 1);
        }
    }

    public static void reversesString(String s, int index) {
        if (index == 0) {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        reversesString(s, index - 1);
    }
}
