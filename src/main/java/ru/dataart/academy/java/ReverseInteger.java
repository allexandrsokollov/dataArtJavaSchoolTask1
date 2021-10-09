package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        char[] number = ("" + inputNumber).toCharArray();
        int toReturn;

        if(number.length <= 1) {
            toReturn = Integer.parseInt(new String(number));
            return toReturn;
        }

        for (int i = 0, j = number.length - 1; i < number.length / 2; i++, j--) {

            if(number[i] == '-') {
                i++;
            }

            char tmp = number[i];
            number[i] = number[j];
            number[j] = tmp;
        }

        toReturn = Integer.parseInt(new String(number));
        return toReturn;
    }
}
