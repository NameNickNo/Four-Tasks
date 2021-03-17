package org.example;

public class ThirdTask {
    public static void main(String[] args) {
        int number = 3205895;
        System.out.println(replace(number));
    }

    public static int replace(int number) {
        String numberString = String.valueOf(number);
        int index = numberString.lastIndexOf("0");

        if (index == -1) {
            return number; //Some kind of logic, if number does not have  "0"
        }

        StringBuilder builder = new StringBuilder(numberString);
        builder.setCharAt(index, '1');

        return Integer.parseInt(builder.toString());
    }
}
