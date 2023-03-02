package sem3;

// Итерация всех элементов списка цветов и добавления к каждому символа '!'.

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class homW_2 {
    public static List<String> newColorList() {
        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("red");
        colorList.add("white");
        return colorList;
    }
    
    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(iterList(newColorList()));
    }
}