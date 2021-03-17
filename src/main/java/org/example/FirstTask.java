package org.example;

import org.example.util.Numeral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,1,6,3,2,3,1,1};

        System.out.println(sort(numbers));
    }

    public static List<Numeral> sort(int[] array) {

        List<Numeral> list = new ArrayList<>();

        for (int number : array) {
            if (list.stream().anyMatch(n -> n.getIndex() == number)) {
                Numeral numeral = list.stream().filter(n -> n.getIndex() == number).findAny().get();
                int count = numeral.getCount();
                numeral.setCount(++count);
            } else {
                list.add(new Numeral(number, 1));
            }
        }

//        list.sort((o1, o2) -> {
//            if (o1.getCount() > o2.getCount()) {
//                return -1;
//            } else if (o1.getCount() < o2.getCount()) {
//                return 1;
//            } else {
//                return Integer.compare(o1.getIndex(), o2.getIndex());
//            }
//        });

        Collections.sort(list);
        return list;
    }
}
