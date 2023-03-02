package sem3;

// Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.

// import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class homW_1 {
    public static List<String> newColorList() {
        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("red");
        colorList.add("white");
        return colorList;
    }
    public static void main(String[] args) {
        // 1
        System.out.println(newColorList());
    }
}