package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticExpression {
    public final static String[] arabicRoman = new String[]
            {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "+", "-", "*", "/"};

    public static int indexPlusOne(String number) {

        int index = 0;
        for (int i = 0; i < arabicRoman.length; i++) {
            if (number.equals(arabicRoman[i])) {
                if (i < 10) index = i + 1;
                else index = i - 9;
                break;
            }
        }
        return index;
    }

    public static int resultExpression(int x, int y, String sign) {

        return switch (sign) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;

        };
    }
    enum RomanNumeral {
        I(1), IV(4), V(5), IX(9), X(10),
        XL(40), L(50), XC(90), C(100);

        private int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getReverseSortedValues() {
            return Arrays.stream(values())
                    .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                    .collect(Collectors.toList());
        }
    }
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 100)) {
            throw new IllegalArgumentException("Результат арифметической операции с римскими цифрами не может быть со знаком минус или равен \"0\"!");
        }

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
















