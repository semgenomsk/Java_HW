package sem2;

// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

public class homW_1 {
    public static void main(String[] args) {
        String str="Привет!";

        CharSequence seq="р";
        boolean bool=str.contains(seq);
        System.out.println("Найдем 'р'?: " + bool);

        // return false
        boolean sqFound=str.contains("ы");
        System.out.println("Найдем 'ы'?: " + sqFound);
    }
}
