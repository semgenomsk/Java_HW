package sem3;

// Вставить элемент в список в первой позиции.

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class homW_3 {
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
    
    public static List<String> addList(List<String> list) {
        list.add(0, "yellow");
        return list;
    }

public static void main(String[] args) {
    System.out.println(addList(iterList(newColorList())));
}
}
