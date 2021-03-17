package org.example;

import org.example.util.Numeral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,4,1,6,3,2,3,1,1, 3};

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

        Collections.sort(list);
        return list;
    }
}
