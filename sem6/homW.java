package sem5;

import java.util.HashMap;
import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Objects;

// Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения. 
// Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого. 
// Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.

public class homW {
    public static void main(String[] args) {
        Myset set = new Myset();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set);
        System.out.println(set.contains(11));
        System.out.println(set.contains(5));
        System.out.println(set.get(5));
        System.out.println(set.geArrayList());
        System.out.println(set.headSet(7));
        System.out.println(set.tailSet(7));
        System.out.println(set.subSet(7, 9));
    }
}

class Myset {
    private HashMap<Integer, Object> values = new HashMap<>();
    private static final Object X = new Object();

    void add(int data) {
        values.put(data, X);
    }

    public String toString() {
        // values.forEach((k,v) -> System.out.println(k));
        return values.keySet().toString();
    }

    Boolean contains(int data) {
        return values.containsKey(data);
    }

    void clear() {
        values.clear();
    }

    void remove(int data) {
        values.remove(data);
    }

    int size() {
        return values.size();
    }

    int get(int index) {
        return (int) values.keySet().toArray()[index];
    }

    ArrayList geArrayList() {
        ArrayList<Integer> res = new ArrayList<>();
        // int [] arr = new int [] {(int) values.keySet().toArray()};
        values.forEach((k, v) -> res.add(k));
        return res;
    }

    Myset headSet(int data) {
        Myset res = new Myset();
        for (int el : values.keySet()) {
            res.add(el);
            if (data == el)
                break;
        }
        return res;
    }

    Myset tailSet(int data) {
        boolean ad = false;
        Myset res = new Myset();
        for (int el : values.keySet()) {
            if (data == el)
                ad = true;
            if (ad) {
                res.add(el);
            }
        }
        return res;
    }

    Myset subSet(int key1, int key2) {
        Myset res = new Myset();
        boolean ad = false;
        int stop = key1;
        for (int el : values.keySet()) {
            if (el == key1 && !ad) {
                ad = true;
                stop = key2;
            }
            if (el == key2 && !ad) {
                ad = true;
                stop = key1;
            }
            if (ad) {
                res.add(el);
                if (el == stop) {
                    break;
                }
            }
        }
        return res;
    }
}
