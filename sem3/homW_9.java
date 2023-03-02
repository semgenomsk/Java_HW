package sem3;

// Удалить из первого списка все элементы отсутствующие во втором списке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class homW_9 {
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

    public static List<String> replacElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), secondElement);
        return list;
    }

    public static List<String> removeList(List<String> list) {
        list.remove(2);
        return list;
    }

    public static List<String> sortList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static List<String> copyList(List<String> list) {
        List<String> newCopyList = List.copyOf(list);
        return newCopyList;
    }

    public static void main(String[] args) {
        System.out.println(copyList(sortList(removeList(replacElement(addList(iterList(newColorList())), "yellow", "yellow!")))));
    }
}
